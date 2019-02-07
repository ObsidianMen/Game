package game.creatures;

public class Creature {
    
    private String name; // Creature name
    public String creatureType; // Creature type
    private int health; //Creature max HP
    private int currentHP; // Creature current HP
    private int mana; //Creature max MP
    private int currentMP; // Creature current MP
    
    public void setName(String name) { this.name = name; };
    public void setCreatureType(String creatureType) { this.creatureType = creatureType; };
    public void setHealth(int health) { this.health = health; };
    public void setCurrentHP(int currentHP) { this.currentHP = currentHP; };
    public void setMana(int mana) { this.mana = mana; };
    public void setCurrentMP(int currentMP) { this.currentMP = currentMP; };
    
    public String getName() { return name; }
    public String getCreatureType() { return creatureType; }
    public int getHealth() { return health; }
    public int getCurrentHP() { return currentHP; }
    public int getMana() { return mana; }
    public int getCurrentMP() { return currentMP; }
}
