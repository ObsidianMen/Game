package game.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeeleWeapon extends Weapon {
    
    public int quality;
    public final List<String> qualityList = new ArrayList<>(Arrays.asList("low", "normal", "superior"));
    
   public MeeleWeapon() {
   
       weaponType = "Meele Weapon";
   
   }
    
}
