package br.com.model;

import br.com.policy.ApprovalPolicy;

public class SchoolClass {
    private final Student[] students;

    public SchoolClass(Student[] students) throws IllegalArgumentException {
        if (students == null) {
            throw new IllegalArgumentException( "Nenhum aluno cadastrado, por favor verifique.");
        }

        for (Student student: students) {
            if (student == null) {
                throw new IllegalArgumentException(
                        "A turma não pode conter um aluno nulo."
                );
            }
        }

        this.students = students.clone();
    }

    public int approved(ApprovalPolicy approvalPolicy) {
        int count = 0;

        for (Student student: students) {
            if (approvalPolicy.isApproved(student.average())) {
                count++;
            }
        }

        return count;
    }

    public int reproved(ApprovalPolicy approvalPolicy) {
        int count = 0;

        for (Student student: students) {
            if (!approvalPolicy.isApproved(student.average())) {
                count++;
            }
        }

        return count;
    }
}
