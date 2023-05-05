package theGame;

public class GameUtils {

    public static PlayerStatus initPlayer(String nickname) {
        PlayerStatus playerStatus = new PlayerStatus(nickname);
        return playerStatus;
    }

    public static PlayerStatus initPlayer(String nickname, int lives) {
        PlayerStatus playerStatus = new PlayerStatus(nickname, lives);
        return playerStatus;
    }

    public static PlayerStatus initPlayer(String nickname, int lives, int score) {
        PlayerStatus playerStatus = new PlayerStatus(nickname, lives, score);
        return playerStatus;
    }

    public static boolean isStillInGame(PlayerStatus playerStatus) {
    	
        return playerStatus.getLives() > 0;
    }

//    public static void duel (PlayerStatus attacker, PlayerStatus opponent) {
//    	if (attacker.calculateDamage() > opponent.calculateDamage()) {
//    			opponent.receiveDamage(attacker.calculateDamage());
//    	} 
//    }
    public static void duel (PlayerStatus attacker, PlayerStatus opponent) {
    	if ( shouldAttackOpponent(attacker, opponent)) {
    		System.out.println("winner is " + attacker.getNickname());
    	} else {
    		System.out.println("winner is " + opponent.getNickname());
    	}
    }
    
    public static boolean shouldAttackOpponent(PlayerStatus attacker, PlayerStatus opponent) {
    	
        if (attacker.getWeaponInHand().equals(opponent.getWeaponInHand())) {
            return attacker.calculateDamage() > opponent.calculateDamage();
        } else {
            if (isDistanceSmallerThan1000(attacker, opponent)) {
                if (attacker.getWeaponInHand().equals("kalashnikov")) {
                    return true;
                }
                if (opponent.getWeaponInHand().equals("kalashnikov")) {
                    return false;
                }
                if (attacker.getWeaponInHand().equals("sniper")) {
                    return true;
                }
                if (opponent.getWeaponInHand().equals("sniper")) {
                    return false;
                }
                if (attacker.getWeaponInHand().equals("knife")) {
                    return true;
                }
                if (opponent.getWeaponInHand().equals("knife")) {
                    return false;
                }
            } else {
                if (attacker.getWeaponInHand().equals("sniper")) {
                    return true;
                }
                if (opponent.getWeaponInHand().equals("sniper")) {
                    return false;
                }
                if (attacker.getWeaponInHand().equals("kalashnikov")) {
                    return true;
                }
                if (opponent.getWeaponInHand().equals("kalashnikov")) {
                    return false;
                }
                if (attacker.getWeaponInHand().equals("knife")) {
                    return true;
                }
                if (opponent.getWeaponInHand().equals("knife")) {
                    return false;

                }
            }
        }
        return false;
    }

    public static boolean isDistanceSmallerThan1000(PlayerStatus first, PlayerStatus second) {
        double result = Math.sqrt(Math.pow(first.getPositionX() - second.getPositionX(), 2) + Math.pow(first.getPositionY() - second.getPositionY(), 2));
//        System.out.println("distance is " + result);
        return result <= 1000;
    }
}
