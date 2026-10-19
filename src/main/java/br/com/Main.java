package br.com;


import br.com.model.SchoolClass;
import br.com.model.Student;
import br.com.policy.SchoolPolicy;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Student allan = new Student("Allan", "Rodrigues");
        allan.gradeNotes(new double[]{10, 5, 10, 10, 9});

        Student thaina = new Student("Thaina", "Rodrigues");
        thaina.gradeNotes(new double[]{10, 10, 10, 10, 10});

        SchoolClass schoolClass = new SchoolClass();
        schoolClass.addStudent(allan);
        schoolClass.addStudent(thaina);

        Student searchStudent = schoolClass.findByStudentFullName("Allan Rodrigues");
        SchoolPolicy schoolPolicy = new SchoolPolicy();

        if(searchStudent != null) {
            System.out.println("Aluno: " + searchStudent.fullName());
            System.out.println("Média: " + searchStudent.average());
            System.out.println(
                    "Aprovado: " + schoolPolicy.isApproved(searchStudent.average())
            );
        }


//        for (Student student : schoolClass.getStudents()) {
//            System.out.println("Aluno: " + student.fullName());
//            System.out.println("Média: " + student.average());
//            System.out.println(
//                    "Aprovado: " + schoolPolicy.isApproved(student.average())
//            );
//        }
    }
}