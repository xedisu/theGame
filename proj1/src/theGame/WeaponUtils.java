package theGame;
public class WeaponUtils {

    boolean isValidWeapon(String weaponInHand) {
       return weaponInHand.equals("knife") ||  weaponInHand.equals("sniper") || weaponInHand.equals("kalashnikov");
   }

   protected boolean hasScoreForPurchase(String weaponInHand, int score) {
       switch (weaponInHand) {
           case "knife":
               return score >= 1000;
           case "sniper":
               return score >= 10000;
           case "kalashnikov":
               return score >= 20000;
       }
       return false;
   }

    int priceTag(String weaponInHand) {
       switch (weaponInHand) {
           case "knife":
               return 1000;
           case "sniper":
               return 10000;
           case "kalashnikov":
               return 20000;
       }
       return 0;
   }
}