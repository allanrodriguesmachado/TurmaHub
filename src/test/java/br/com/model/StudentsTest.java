package br.com.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StudentsTest {
//    private Student student;
//
//    @BeforeEach
//    void setUp() {
//        student = new Student("Allan", "Rodrigues");
//    }
//
//    @Test
//    public void shouldRejectFirstNameIsNull() {
//        assertThrows(IllegalArgumentException.class,() -> {
//           new Student(null, "Rodrigues");
//        }, "O Nome nao pode ser nulo");
//    }
//
//    @Test
//    public void shouldRejectLastNameIsNull() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Student("Allan", null);
//        });
//    }
//
//    @Test
//    void shouldRejectLastNameIsBlank() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            new Student("Allan", "");
//        });
//    }
//
//    @Test
//    public void shouldRejectFirstNameIsBlank() {
//        assertThrows(IllegalArgumentException.class,() -> {
//            new Student("", "Rodrigues");
//        }, "O Nome nao pode ser nulo");
//    }
//
//    @Test
//    public void shouldRejectFullNameIsNull() {
//        assertThrows(IllegalArgumentException.class, ()-> {
//            new Student(null, null);
//        });
//    }
//
//    @Test
//    public void shouldRejectGradeAboveTen() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            student.gradeNotes(new double[] {10, 6, 11, 8, 6});
//        }, "O cadastro deveria rejeitar uma nota acima de 10.");
//    }
//
//    @Test
//    public void shouldAcceptGradeAboveTen() {
//        assertDoesNotThrow(
//                () -> student.gradeNotes(new double[] {10, 6, 9, 8, 6}),
//                "O cadastro deveria aceitar cinco notas válidas."
//        );
//    }
//
//    @Test
//    void shouldRejectGradeNotesIsNull() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            student.gradeNotes(null);
//        });
//    }
//
//    @Test
//    void shouldRejectGradeAboveFive() {
//        double[] notes =  new double[]{1, 2, 3, 4};
//
//        assertThrows(IllegalArgumentException.class, ()-> {
//            student.gradeNotes(notes);
//        });
//    }
//
//    @Test
//    void shouldRejectGradeNotesBiggerTen() {
//        double[] notes = new double[]{5, 3, 11, 4, 5};
//
//        assertThrows(IllegalArgumentException.class, () -> {
//           student.gradeNotes(notes);
//        });
//    }
}