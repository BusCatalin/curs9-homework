package ro.fasttrackit.curs9;

public class ProductMain {
    public static void main(String[] args) {
        Product myProduct = new Product(50, 5);

        System.out.println(myProduct);
        myProduct.livrareMarfa(5);
        System.out.println(myProduct);
        myProduct.sale(15);
        System.out.println(myProduct);
        myProduct.soldOut();
        System.out.println(myProduct);
        myProduct.priceIncrease(67);
        System.out.println(myProduct);
        myProduct.restock();
        System.out.println(myProduct);
        myProduct.newProduct("mayo", 75, 15, "Eat in small amounts ");
        System.out.println(myProduct);

        System.out.println("Cosmetics");
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.newProduct("lipstick", 100, 20, "Contains pigments ");
        System.out.println(cosmetics);
        cosmetics.setColour("Red");
        System.out.println(cosmetics.getColour());
        cosmetics.setWeight(3);
        System.out.println(cosmetics.getWeight());
        cosmetics.sale(50);
        System.out.println(cosmetics);

        System.out.println("Electronics");
        Electronics electronics = new Electronics();
        electronics.newProduct("microwave", 700, 7, "Don't put microwave in microwave ");
        electronics.setDimensions("20", "8", "7");
        electronics.setWeight("15");
        System.out.println(electronics.getLength());
        System.out.println(electronics.getWidth());
        System.out.println(electronics.getHeight());
        System.out.println(electronics.getWeight());

        System.out.println("Fridge");
        Fridge fridge= new Fridge();
        fridge.newProduct("Fridge",500,2,"Cold as ice ");
        fridge.setTemperature(15);
        System.out.println(fridge.getTemperature());
        fridge.setPlugged(true);
        fridge.changeTemperature();
        System.out.println(fridge.getTemperature());

    }
}
