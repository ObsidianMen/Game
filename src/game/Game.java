package game;

import game.item.Claymore;
import game.item.Item;
import game.item.ShortWarBow;
import game.menu.*;

import java.util.List;
import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        
        List<Item> list = new ArrayList<>();
        
        Item item1 = new Item();
        
        item1.setItemName("Iron Sword");
        item1.setSlot("rHand");
        list.add(item1);
               
        
        Item item2 = new Item();
        item2.setItemName("Skull Cap");
        item2.setSlot("head");
        list.add(item2);

        int a = 0;
        System.out.print("Items in inventory:");
        
        for (Item curItem : list) {
        
            a++;
            System.out.print(a + ")" + curItem.getItemName() + "\n");
            
        }
  
        inventory.equipItem(item2, item2.getSlot());   
        inventory.equipItem(item1, item1.getSlot());   
        inventory.unequipItem(item1.getSlot());
        
        for (int i = 0; i < 100; i++) {
            
            item1.drop(); // Item drop test
        
        }
        
        System.out.println("\n");
        
        Claymore one = new Claymore();
        System.out.println(one.itemName + "\n" + one.weaponType + "\n" + one.weaponClass + "\n" + one.isTwoHanded + "\n");
        
        ShortWarBow two = new ShortWarBow();
        System.out.println(two.itemName + "\n" + two.weaponType + "\n" + two.weaponClass + "\n" + two.ammoType + "\n");
        
        inventory.equipItem(one, one.slot);
        inventory.equipItem(two, two.slot);
        
    }
    
}
