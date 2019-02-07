package game.item;

public class Weapon extends Item {
    
    private int minDamage;
    private int maxDamage;
    
    public void setMinDamage(int minDamage) { this.minDamage = minDamage; }
    
    public int getMinDamage() { return minDamage; }
    
    public void setMaxDamage(int maxDamage) { this.maxDamage = maxDamage; }
    
    public int getMaxDamage() { return maxDamage; }
       
}
