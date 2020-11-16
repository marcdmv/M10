package itacademy.application;

import itacademy.domain.*;

import java.util.ArrayList;
import java.util.List;

import itacademy.persistance.ItemsRepository;

public class ShopController {

    private final ItemsRepository repo = new ItemsRepository();
    private final Shop shop = new Shop();

    public ShopController(){ //Definimos el constructor

    }

    public void createShop(String name) throws Exception { //Asignamos el nombre a la variable name
        shop.setName(name);
    }

    public String getShopName() throws Exception { //Recuperamos el nombre del objeto shop
        return shop.getName();
    }

    public void addTree(String name, double price, double height) throws Exception {
        Tree arbre = new Tree(name,price,height); //Añadimos un objeto de tipo Tree con su propiedad específica height
        repo.addItem(arbre);
    }

    public void addFlower(String name, double price, String color) throws Exception {
        Flower flor = new Flower(name,price,color); //Añadimos un objeto de tipo Flower con su propiedad específica color
        repo.addItem(flor);

    }

    public void addDecoration(String name, double price, String material) throws Exception {
        Decoration deco = new Decoration(name,price,material); //Añadimos un objeto de tipo Decoration con su propiedad específica material
        repo.addItem(deco);
    }

    public List<AbsItems> getStock(){
        List<AbsItems> stock = new ArrayList<>();
        for (AbsItems ai : repo.getAllItems()) {
            stock.add(ai);
        }
        return stock;
    }

}
