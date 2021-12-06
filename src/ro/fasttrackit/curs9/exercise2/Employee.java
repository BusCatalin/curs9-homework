package ro.fasttrackit.curs9.exercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Employee extends Person {
    protected LocalDateTime dateOfEmployment;
    protected String position;

    public Employee() {
        this(LocalDate.of(2010, Month.APRIL, 9).atStartOfDay(), "Baker");
    }

    public Employee(LocalDateTime dateOfEmployment, String position) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public String getPosition() {
        return position = "Baker";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

}
