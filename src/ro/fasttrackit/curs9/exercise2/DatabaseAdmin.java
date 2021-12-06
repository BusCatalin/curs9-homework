package ro.fasttrackit.curs9.exercise2;

public class DatabaseAdmin extends Employee {
    private String dbTehnology;

    public DatabaseAdmin() {
        this("MySQL");
    }

    public DatabaseAdmin(String dbTehnology) {
        this.dbTehnology = dbTehnology;
    }

    public String getDbTehnology() {
        return dbTehnology;
    }

    @Override
    public String getAddress() {
        return "db admin " + address;
    }
}
