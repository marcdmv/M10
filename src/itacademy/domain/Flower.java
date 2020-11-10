package itacademy.domain;

public class Flower extends AbsItems {

    private String color;

    public Flower(String name, double price, String color) throws Exception {

        super(name,price);

        if (color.equals(""))
            throw new Exception();

        this.color = color;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getFlowerColor() {
        return color;
    }

    public String getProperty(){
        return "color: " + color;
    }

    public String getType(){
        return "Flor";
    }
}
