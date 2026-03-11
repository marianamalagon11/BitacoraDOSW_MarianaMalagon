package edu.dosw.bitacora.bitacora_DOSW.semana1.service;

import edu.dosw.bitacora.bitacora_DOSW.semana1.model.Grade;
import edu.dosw.bitacora.bitacora_DOSW.semana1.model.Student;

import java.util.*;
import java.util.stream.*;

public class AnalyticsService {

    public List<Student> getAzulStudents(List<Student> students) {
        return students.stream()
                .filter(s -> "AZUL".equalsIgnoreCase(s.getTeam()))
                .collect(Collectors.toList());
    }


    public List<String> getStudentNamesSorted(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
    }


    public double getGlobalAverage(List<Student> students) {
        return students.stream()
                .flatMap(s -> s.getGrades().stream())
                .mapToDouble(Grade::getScore)
                .average()
                .orElse(0.0);
    }


    public Map<String, Double> getAveragePerSubject(Student student) {
        return student.getGrades().stream()
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ));
    }


    public Optional<Student> getTopStudent(List<Student> students) {
        return students.stream()
                .max(Comparator.comparingDouble(this::getStudentAverage));
    }

    private double getStudentAverage(Student student) {
        return student.getGrades().stream()
                .mapToDouble(Grade::getScore)
                .average().orElse(0.0);
    }

    public Map<String, Long> getFailedSubjectsByTeam(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getTeam,
                        Collectors.flatMapping(
                                s -> s.getGrades().stream().filter(g -> !g.isPassed()),
                                Collectors.counting()
                        )
                ));
    }


    public List<Student> getTop3ApprovedSubjects(List<Student> students) {
        return students.stream()
                .sorted((a, b) -> {
                    long bCount = b.getGrades().stream().filter(Grade::isPassed).count();
                    long aCount = a.getGrades().stream().filter(Grade::isPassed).count();
                    return Long.compare(bCount, aCount);
                })
                .limit(3)
                .collect(Collectors.toList());
    }


    public Map<String, List<Student>> groupByAcademicState(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(s -> {
            double avg = getStudentAverage(s);
            if (avg >= 4.5) return "ALTO RENDIMIENTO";
            else if (avg >= 3.5) return "REGULAR";
            else return "RIESGO";
        }));
    }


    public String getMostFailedSubject(List<Student> students) {
        return students.stream()
                .flatMap(s -> s.getGrades().stream())
                .filter(g -> !g.isPassed())
                .collect(Collectors.groupingBy(
                        Grade::getSubject, Collectors.counting()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public LinkedHashMap<String, Double> getAzulApprovedAverages(List<Student> students) {
        Map<String, Double> map = students.stream()
                .filter(s -> "AZUL".equalsIgnoreCase(s.getTeam()))
                .flatMap(s -> s.getGrades().stream())
                .filter(Grade::isPassed)
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ));
        return map.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new
                ));
    }
}
