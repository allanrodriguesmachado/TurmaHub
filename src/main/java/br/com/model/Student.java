package br.com.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private  String firstName;
    private String lastName;
    private double[] grade;

    public Student(String firstName, String lastName) throws IllegalArgumentException {
        this.validateName(firstName);
        this.validateName(lastName);

        this.firstName = firstName.strip();
        this.lastName = lastName.strip();
        this.grade = new double[0];
    }


    private void validateName(String fullName) throws IllegalArgumentException {
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Atencao! Preencha o nome do usuario");
        }
    }

    public String fullName() {
        return this.firstName + " "  + this.lastName;
    }

    public void gradeNotes(double[] notes) throws IllegalArgumentException{
      if (notes == null || notes.length != 5) {
          throw new IllegalArgumentException( "Informe exatamente 5 notas.");
      }

      for (double note: notes) {
          if(!Double.isFinite(note)  || note < 0 || note > 10) {
              throw new IllegalArgumentException(
                      "Cada nota deve estar entre 0 e 10."
              );
          }
      }

      this.grade = notes.clone();
    }

    public double average() throws IllegalArgumentException{
        if(this.grade.length == 0) {
            throw new IllegalArgumentException( "Cadastre as notas antes de calcular a média.");
        }

        double sum = 0;

        for(double note: this.grade) {
            sum += note;
        }

        return sum / this.grade.length;
    }
}
