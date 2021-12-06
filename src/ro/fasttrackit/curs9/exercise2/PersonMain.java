package ro.fasttrackit.curs9.exercise2;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person);

        System.out.println("---Employee---");
        Employee employee = new Employee();
        System.out.println(employee.dateOfEmployment);
        System.out.println(employee.position);

        System.out.println("---Programmer---");
        Progammer progammer = new Progammer("English");
        System.out.println(progammer.getPosition());

        System.out.println("---DatabaseAdmin---");
        DatabaseAdmin databaseAdmin = new DatabaseAdmin();
        System.out.println(databaseAdmin.getAddress());
    }
}
