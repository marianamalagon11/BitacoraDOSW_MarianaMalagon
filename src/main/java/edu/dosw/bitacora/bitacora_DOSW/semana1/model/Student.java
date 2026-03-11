package edu.dosw.bitacora.bitacora_DOSW.semana1.model;

import java.util.List;
import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String team;
    private List<Grade> grades;

    public Student(String id, String name, String team, List<Grade> grades) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.grades = grades;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getTeam() { return team; }
    public List<Grade> getGrades() { return grades; }

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' + ", name='" + name + '\'' +
                ", team='" + team + '\'' + ", grades=" + grades + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        Student s = (Student) o;
        return Objects.equals(this.id, s.id);
    }

}
