package ro.fasttrackit.curs9.exercise2;

public class Progammer extends Employee {
    private String language;

    public Progammer() {
        this("English");
    }

    public Progammer(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return position = "Programmer";
    }
}
