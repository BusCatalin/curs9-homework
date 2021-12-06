package ro.fasttrackit.curs9;

public class Electronics extends Product {
    private String length;
    private String width;
    private String height;
    private String weight;

    public String getLength() {
        return length;
    }
    public String getWidth(){
        return width;
    }
    public String getHeight(){
        return height;
    }

    public void setDimensions(String length, String width, String height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


}
