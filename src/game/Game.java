package game;

import game.item.Item;
import game.menu.*;

import java.util.List;
import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        
        List<Item> list = new ArrayList<>();
        
        Item item1 = new Item();
        
        item1.setItemName("sword");
        list.add(item1);
               
        
        Item item2 = new Item();
        item2.setItemName("dagger");
        list.add(item2);
        
        System.out.print("Items in inventory:");
        
        for (Item curItem : list) {
        
            System.out.print(" " + curItem.getItemName());
            
        }
        
        System.out.print(".\n");
        
    }
    
}
