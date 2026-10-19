package br.com;


import br.com.model.SchoolClass;
import br.com.model.Student;
import br.com.policy.SchoolPolicy;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {

        Student allan = new Student("Allan", "Rodrigues");
        allan.gradeNotes(new double[] {0, 3, 9, 2, 10});

        Student ana = new Student("Ana", "Rodrigues");
        ana.gradeNotes(new double[] {10, 7, 9, 8, 10});

        Student thaina = new Student("Thaina", "Fernandes");
        thaina.gradeNotes(new double[] {10, 10, 9, 8, 10});

        SchoolClass students = new SchoolClass(
                new Student[]{allan, ana, thaina}
        );

        Student[] turmas = {allan, ana, thaina};
        SchoolPolicy schoolPolicy = new SchoolPolicy();

        System.out.println(students.reproved(schoolPolicy));

        for (Student student: turmas) {
            boolean approved = schoolPolicy.isApproved(student.average());

            if (approved) {
                System.out.println("Parabéns! " + student.fullName() + " foi aprovado.");
            } else {
                System.out.println(student.fullName() + " não foi aprovado.");
            }
        }
    }
}