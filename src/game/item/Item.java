package game.item;

import java.io.Serializable;
import java.util.UUID;

public class Item implements Serializable {

    private UUID itemId; 
    private String itemName;
    
    public Item() {
    
        this.itemId = UUID.randomUUID();
    
    }
    
    public void setItemName(String itemName) { this.itemName = itemName; }
    
    public String getItemName() { return itemName; }

}
