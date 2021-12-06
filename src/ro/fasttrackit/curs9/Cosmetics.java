package ro.fasttrackit.curs9;

public class Cosmetics extends Product {
    private String colour;
    private int weight;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    protected void sale(int percentage){
        this.price=price-price*percentage/100;
    }

}
