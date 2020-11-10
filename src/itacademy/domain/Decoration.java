package itacademy.domain;

public class Decoration extends AbsItems {

    private String material;

    public Decoration(String name, double price, String material) throws Exception{
        super(name,price);
        if (!material.equals("fusta") && !material.equals("plàstic"))
            throw new Exception("Los materiales pueden ser: fusta o plàstic");

        this.material = material;
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
        return "material: " + material;
    }

    public String getType(){
        return "Decoració";
    }
}
