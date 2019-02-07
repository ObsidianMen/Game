package game.menu;

import game.item.Item;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class Inventory implements Serializable {
    
    private List<Item> itemList;
    private List<String> slotList = new ArrayList<String>(Arrays.asList("head", "torso", "hands", "legs", "feet", "rHand", "lHand"));
    private final HashMap<String, Item> charSlot = new HashMap<String, Item>(){{
    
        put("head", null);
        put("torso", null);
        put("hands", null);
        put("legs", null);
        put("feet", null);
        put("rHand", null);
        put("lHand", null);
        
    }};
    
    public void setItemList(List<Item> itemList) { this.itemList = itemList; }
    
    public List<Item> getItemList() { return itemList; }
    
    public Item equipItem(Item item, String slot) {
    
        Item previousItem  = null;
        
        if (slotList.contains(slot) && item.getSlot().equals(slot)) {
        
            previousItem = charSlot.get(slot);
            
            charSlot.put(slot, item);
            
            System.out.println(item.getItemName() + " equipped!");
        
        } else {
        
            System.out.println("You can't equip this item");
        
        }
        
        return previousItem;
        
    } // Equip item

    public Item unequipItem(String slot) {
    
        Item previousItem = null;
    
        if (slot != null && slotList.contains(slot)) {
        
            previousItem = charSlot.get(slot);
            charSlot.put(slot, null);
            
        }
        
        if (previousItem != null) {
        
            System.out.println(previousItem.getItemName() + " unequiped!");
            
        }
        
        return previousItem;
    
    } // Unequip item

}