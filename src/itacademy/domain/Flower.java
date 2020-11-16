package itacademy.domain;

public class Flower extends AbsItems {

    private final String color;

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

    public String getProperty(){ //En este tipo de objeto, el método devuelve el color de la flor.
        return "color: " + color;
    }

    public String getType(){
        return "Flor";
    }
}
