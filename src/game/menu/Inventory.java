package game.menu;

import game.item.Item;
import java.io.Serializable;
import java.util.List;

public class Inventory implements Serializable {
    
    private List<Item> itemList;
    
    public void setItemList(List<Item> itemList) { this.itemList = itemList; }
    
    public List<Item> getItemList() { return itemList; }

}