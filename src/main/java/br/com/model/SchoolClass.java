package br.com.model;

import br.com.policy.ApprovalPolicy;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private final List<Student> students;

    public SchoolClass() throws IllegalArgumentException {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("O aluno não pode ser nulo.");
        }

        this.students.add(student);
    }

    public List<Student> getStudents() {
        return List.copyOf(this.students);
    }

    public Student findByStudentFullName(String fullName) {
        for(Student student: this.students) {
           if(student.fullName().equalsIgnoreCase(fullName)) {
               return student;
           }
        }

        return null;
    }
}
