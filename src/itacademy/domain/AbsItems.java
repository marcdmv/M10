package itacademy.domain;

public abstract class AbsItems {
    public int id;
    public String name;
    public double price;

    private static int contador = 1;

    public AbsItems(String name, double price) throws Exception {
        if (name.equals(""))
            throw new Exception();
        if (price <= 0)
            throw new Exception("El precio debe que ser mayor que 0");

        this.name = name;
        this.price = price;
        id = contador;
        contador++;
    }

    public abstract String getType();
    public abstract int getId();
    public abstract String getName();
    public abstract double getPrice();
    public abstract String getProperty(); // Método abstracto importante, ya que para cada tipo de objeto devuelve un elemento diferente.
}
