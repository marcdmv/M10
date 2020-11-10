package itacademy.application;

import itacademy.domain.*;

import java.util.ArrayList;
import java.util.List;

import itacademy.persistance.ItemsRepository;

public class ShopController {

    private ItemsRepository repo = new ItemsRepository();
    private Shop shop = new Shop();

    public ShopController(){

    }

    public void createShop(String name) throws Exception {
        shop.setName(name);
    }

    public String getShopName(){
        return shop.getName();
    }

    public void addTree(String name, double price, double height) throws Exception {
        Tree arbre = new Tree(name,price,height);
        repo.addItem(arbre);
    }

    public void addFlower(String name, double price, String color) throws Exception {
        Flower flor = new Flower(name,price,color);
        repo.addItem(flor);

    }

    public void addDecoration(String name, double price, String material) throws Exception {
        Decoration deco = new Decoration(name,price,material);
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
