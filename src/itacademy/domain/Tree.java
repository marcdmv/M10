package itacademy.domain;

public class Tree extends AbsItems {

    private double height;

    public Tree(String name, double price, double height) throws Exception {
        super(name,price);
        if (height <= 0)
            throw new Exception("La altura tiene que ser mayor que 0");

        this.height = height;
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

    public String getProperty(){
        return "altura: " + String.valueOf(height);
    }

    public String getType(){
        return "Arbre";
    }
}


