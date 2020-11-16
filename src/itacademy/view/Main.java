package itacademy.view;

import itacademy.application.ShopController;
import itacademy.domain.AbsItems;

import java.util.List;

public class Main {

    // Creamos el controller para seguir un esquema MVC
    private final static ShopController controller = new ShopController();

    public static void main(String[] args) throws Exception {

        controller.createShop("Anabel"); //Creamos la tienda y le asignamos un nombre
        controller.addTree("pino",25,4); //Añadimos un árbol
        controller.addFlower("rosa",5.35,"rojo"); //Añadimos una flor
        controller.addDecoration("estrella", 3, "fusta"); //Añadimos un item de decoración
        List<AbsItems> items = controller.getStock(); //Llamamos al método getStock del controller para recibir la Lista de todos los items

        System.out.println("Floristeria " + controller.getShopName());

        // Iteramos para mostrar por consola todos los items con sus características.
        for (AbsItems ai : items){
            System.out.println(ai.getType() + " | Id: " + ai.getId() + " | nombre: " + ai.getName() +" | precio: "+ ai.getPrice() +"€ | " + ai.getProperty());

        }

    }
}
