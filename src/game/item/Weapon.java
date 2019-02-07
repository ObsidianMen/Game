package game.item;

public class Weapon extends Item implements Breakable {
    
    public int minDamage;
    public int maxDamage;
    public String weaponType;
    public String weaponClass;
    public int durability;
    public boolean isTwoHanded;
    
    public void setMinDamage(int minDamage) { this.minDamage = minDamage; }
    
    public int getMinDamage() { return minDamage; }
    
    public void setMaxDamage(int maxDamage) { this.maxDamage = maxDamage; }
    
    public int getMaxDamage() { return maxDamage; }

    @Override
    public int depleteDurability(int durability) {
        
        int newDurability = durability - 1;
        
        return newDurability;
        
    }
       
    
    
}