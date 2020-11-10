package itacademy.view;

import itacademy.application.ShopController;
import itacademy.domain.AbsItems;
import itacademy.domain.Flower;
import itacademy.domain.Shop;

import java.util.List;

public class Main {

    private static ShopController controller = new ShopController();

    public static void main(String[] args) throws Exception {

        controller.createShop("Anabel");
        controller.addTree("pino",25,4);
        controller.addFlower("rosa",5.35,"rojo");
        controller.addDecoration("estrella", 3, "fusta");
        List<AbsItems> items = controller.getStock();

        System.out.println("Floristeria " + controller.getShopName());

        for (AbsItems ai : items){
            System.out.println(ai.getType() + " | Id: " + ai.getId() + " | nombre: " + ai.getName() +" | precio: "+ ai.getPrice() +"€ | " + ai.getProperty());

        }

    }
}
