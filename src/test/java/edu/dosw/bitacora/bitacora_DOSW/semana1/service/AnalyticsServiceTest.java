package edu.dosw.bitacora.bitacora_DOSW.semana1.service;

import edu.dosw.bitacora.bitacora_DOSW.semana1.model.Grade;
import edu.dosw.bitacora.bitacora_DOSW.semana1.model.Student;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class AnalyticsServiceTest {

    private AnalyticsService service = new AnalyticsService();

    private List<Student> sampleStudents() {
        List<Grade> grades1 = Arrays.asList(
                new Grade("DOSW", 4.2, LocalDate.of(2024, 6, 1), true),
                new Grade("BD", 3.7, LocalDate.of(2024, 6, 1), true),
                new Grade("REDES", 2.9, LocalDate.of(2024, 6, 2), false)
        );
        List<Grade> grades2 = Arrays.asList(
                new Grade("DOSW", 4.9, LocalDate.of(2024, 6, 1), true),
                new Grade("BD", 5.0, LocalDate.of(2024, 6, 1), true),
                new Grade("REDES", 4.1, LocalDate.of(2024, 6, 2), true)
        );
        List<Grade> grades3 = Arrays.asList(
                new Grade("DOSW", 3.2, LocalDate.of(2024, 6, 1), false),
                new Grade("BD", 3.1, LocalDate.of(2024, 6, 1), false),
                new Grade("REDES", 3.5, LocalDate.of(2024, 6, 2), false)
        );
        return Arrays.asList(
                new Student("1", "Mariana", "AZUL", grades1),
                    new Student("2", "Shawn", "DORADO", grades2),
                new Student("3", "Joji", "AZUL", grades3)
        );
    }

    @Test
    void testGetAzulStudents() {
        List<Student> students = sampleStudents();
        List<Student> azul = service.getAzulStudents(students);
        assertEquals(2, azul.size());
    }

    @Test
    void testGetStudentNamesSorted() {
        List<Student> students = sampleStudents();
        List<String> names = service.getStudentNamesSorted(students);
        assertEquals(Arrays.asList("Joji", "Mariana", "Shawn"), names);
    }

    @Test
    void testGetGlobalAverage() {
        assertEquals(3.8, Math.round(service.getGlobalAverage(sampleStudents()) * 10) / 10.0);
    }

    @Test
    void testGetAveragePerSubject() {
        Student s = sampleStudents().get(0);
        Map<String, Double> avg = service.getAveragePerSubject(s);
        assertEquals(4.2, avg.get("DOSW"), 0.01);
        assertEquals(3.7, avg.get("BD"), 0.01);
        assertEquals(2.9, avg.get("REDES"), 0.01);
    }

    @Test
    void testGetTopStudent() {
        Optional<Student> top = service.getTopStudent(sampleStudents());
        assertTrue(top.isPresent());
        assertEquals("Shawn", top.get().getName());
    }

    @Test
    void testGetFailedSubjectsByTeam() {
        Map<String, Long> failed = service.getFailedSubjectsByTeam(sampleStudents());
        assertEquals(4, failed.get("AZUL"));
        assertEquals(0, failed.get("DORADO"));
    }

    @Test
    void testGetTop3ApprovedSubjects() {
        List<Student> students = sampleStudents();
        List<Student> top3 = service.getTop3ApprovedSubjects(students);
        assertEquals("Shawn", top3.get(0).getName());
    }

    @Test
    void testGroupByAcademicState() {
        Map<String, List<Student>> grouped = service.groupByAcademicState(sampleStudents());
        assertTrue(grouped.containsKey("REGULAR"));
        assertTrue(grouped.containsKey("RIESGO"));
        assertTrue(grouped.containsKey("ALTO RENDIMIENTO"));
    }

    @Test
    void testGetMostFailedSubject() {
        assertEquals("REDES", service.getMostFailedSubject(sampleStudents()));
    }

    @Test
    void testGetAzulApprovedAverages() {
        List<Student> students = sampleStudents();
        LinkedHashMap<String, Double> azulAvg = service.getAzulApprovedAverages(students);
        assertTrue(azulAvg.containsKey("DOSW"));
    }
}