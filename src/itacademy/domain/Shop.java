package itacademy.domain;

public class Shop {

    private String name;

    public Shop(){

    }

    public String getName() throws Exception {
        if (name.equals("")) {
            throw new Exception("El nombre está vacío");
        }
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.equals("")) {
            throw new Exception("El nombre no puede dejarse en blanco");
        }
        this.name = name;
    }
}
