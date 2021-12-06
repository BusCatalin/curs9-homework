package ro.fasttrackit.curs9.exercise2;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected LocalDateTime birthday;

    public Person() {
        this("John", "Smith", "Garibaldi Street", LocalDate.of(1972, Month.MAY, 15).atStartOfDay());
    }

    public Person(String firstName, String lastName, String address, LocalDateTime birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public String toString() {
        return "First Name: " + firstName + " Last Name: " + lastName + " Address: " + address + " Birthday: " + birthday;
    }

}
