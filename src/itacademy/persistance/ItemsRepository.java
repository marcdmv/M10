package itacademy.persistance;

import itacademy.domain.AbsItems;
import itacademy.domain.Decoration;
import itacademy.domain.Flower;
import itacademy.domain.Tree;

import java.util.ArrayList;
import java.util.List;

public class ItemsRepository {

    private static List<AbsItems> items = new ArrayList<>();
    private static List<Tree> trees = new ArrayList<>();
    private static List<Flower> flowers = new ArrayList<>();
    private static List<Decoration> decoration = new ArrayList<>();

    public ItemsRepository(){

    }

    public void addItem(AbsItems item) throws Exception {
        if (item == null) throw new Exception();
        items.add(item);
    }

    public void addTree(Tree tree) throws Exception {
        if (tree==null) throw new Exception();
        trees.add(tree);
    }

    public List<AbsItems> getAllItems(){
        return new ArrayList<>(items);
    }
}
