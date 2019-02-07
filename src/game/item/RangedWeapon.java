package game.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RangedWeapon extends Weapon {
    
    public int quality;
    public final List<String> qualityList = new ArrayList<>(Arrays.asList("low", "normal", "superior"));
    public boolean requiresAmmo;
    public String ammoType;
    
    public RangedWeapon() {
    
        isTwoHanded = true;
        weaponType = "Ranged Weapon";
    
    }
    
}
