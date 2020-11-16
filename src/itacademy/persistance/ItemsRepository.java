package itacademy.persistance;

import itacademy.domain.AbsItems;

import java.util.ArrayList;
import java.util.List;

public class ItemsRepository {

    private final static List<AbsItems> items = new ArrayList<>();

    public ItemsRepository(){

    }

    public void addItem(AbsItems item) throws Exception {
        if (item == null) throw new Exception();
        items.add(item);
    }

    public List<AbsItems> getAllItems(){
        return new ArrayList<>(items);
    }
}
