package game.item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Item implements Serializable {

    private final UUID itemId; 
    private final List<String> typeList = new ArrayList<String>(Arrays.asList("weapon", "armor", "jewelery", "rune"));    
    public String itemName;
    public String slot;
    
    public Item() {
    
        this.itemId = UUID.randomUUID();
    
    }
    
    public void setItemName(String itemName) { this.itemName = itemName; }
    
    public String getItemName() { return itemName; }
    
    public void setSlot(String slot) { this.slot = slot; }
    
    public String getSlot() { return slot; }
    
    public void drop() {
    
        int drop; // Variable for a random number
    
        drop = (int)(Math.random() * ((4 - 1) + 1)) + 1;
        
        if (drop == 4) {
        
            dropItem();
        
        } else {
               
        }
        
    }
    
    public void dropItem() {
    
        int drop;
        
        drop = (int)(Math.random() * ((4 - 1) + 1)) + 1;
        
        if (drop == 4) {
        
            rollDroppedItemType();
                              
        } else {
        
            System.out.println("You found " + drop + " gold!");
        
        }
    
    }
    
    public void rollDroppedItemType() {
    
        int type;
        
        type = (int)(Math.random() * (4 - 1) + 1) + 1;
        
        if (type == 4) {
        
            dropEquipment();
        
        } else {
        
            dropPotion();
        
        }
    
    }

    public void dropPotion() {
    
        int potion = (int)(Math.random() * ((2 - 1) + 1) + 1);
            
        if (potion == 1) {
            
            System.out.println("##You found health potion!##");
            
        } else {
            
            System.out.println("##You found mana potion!##");
                
        }
    
    }
    
    public void dropEquipment() {
    
        String equipmentType = typeList.get((int)(Math.random() * ((typeList.size() - 0) + 0) + 0));
        
        switch (equipmentType) {
            
            case "weapon": {
            
                System.out.println("~~~~Weapon dropped!~~~~");
                break;
            }
            case "armor": {
                
                System.out.println("~~~~Armor dropped!~~~~");
                break;
            }
            case "jewelery": {
            
                System.out.println("~~~~Jewelery dropped!~~~~");
                break;
            }
            case "rune": {
            
                System.out.println("~~~~Rune dropped!~~~~");
                break;
            }
        
        }
        
        /*if (equipmentType.equals("weapon")) {
        
            Item weapon = new Weapon();
        
        }*/
        
    }
    
}
