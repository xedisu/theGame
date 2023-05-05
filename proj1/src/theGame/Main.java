package theGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		PlayerStatus xedisu, cafedon, puck, spongebob;
		xedisu = GameUtils.initPlayer("xedisu", 1, 1000);
		cafedon = GameUtils.initPlayer("cafedon", 3, 1000);

		xedisu.printStatus();
		cafedon.printStatus();
		System.out.println(" is " + xedisu.getNickname() + " still in game ? " +  GameUtils.isStillInGame(xedisu));
		xedisu.findArtifact(12);
		System.out.println(" is " + xedisu.getNickname() + " still in game ? " +  GameUtils.isStillInGame(xedisu));
		xedisu.printStatus();
		System.out.println();
		xedisu.findArtifact(13);
		xedisu.findArtifact(20000);
		cafedon.findArtifact(20000);
		xedisu.printStatus();
		cafedon.printStatus();
		
		
		cafedon.printStatus();
		cafedon.setWeaponInHand("kalashnikov");
		xedisu.setWeaponInHand("knife");

		xedisu.setPositionX(50);
		xedisu.setPositionY(45);
		cafedon.setPositionX(33);
		cafedon.setPositionY(24);

		System.out.println("is the distance from the players smaller than 1000 units ? " + GameUtils.isDistanceSmallerThan1000(xedisu, cafedon));
		System.out.println("should " + xedisu.getNickname() + " attack " + cafedon.getNickname()+ " ? " +  GameUtils.shouldAttackOpponent(xedisu, cafedon));
		System.out.println();
		
		GameUtils.duel(xedisu, cafedon);
		System.out.println();
		xedisu.findArtifact(6);
		xedisu.findArtifact(6);
		xedisu.findArtifact(6);
		xedisu.findArtifact(6);
		xedisu.findArtifact(6);
		xedisu.printStatus();
		cafedon.printStatus();
		xedisu.setWeaponInHand("kalashnikov");
		System.out.println();
		// trap artifact check
		xedisu.findArtifact(12);
		xedisu.printStatus();
		cafedon.printStatus();
		System.out.println();
		System.out.println(xedisu.getNickname() + "'s dmg output is " + xedisu.calculateDamage());
		System.out.println(cafedon.getNickname() + "'s dmg output is " + cafedon.calculateDamage());
		System.out.println("is the distance from the players smaller than 1000 units ? " + GameUtils.isDistanceSmallerThan1000(xedisu, cafedon));
		System.out.println("should " + xedisu.getNickname() + " attack " + cafedon.getNickname()+ " ? " +  GameUtils.shouldAttackOpponent(xedisu, cafedon));
		System.out.println();
		GameUtils.duel(xedisu, cafedon);
		xedisu.printStatus();
		cafedon.printStatus();
		
		cafedon.findArtifact(12345);
		cafedon.printStatus();
		cafedon.setWeaponInHand("sniper");
		cafedon.printStatus();
		System.out.println("should " + xedisu.getNickname() + " attack " + cafedon.getNickname()+ " ? " +  GameUtils.shouldAttackOpponent(xedisu, cafedon));
		GameUtils.duel(xedisu, cafedon);
		System.out.println();
		xedisu.printStatus();
		cafedon.printStatus();
		System.out.println();
		xedisu.findArtifact(12);
		xedisu.printStatus();
		xedisu.findArtifact(12);
		xedisu.printStatus();
		xedisu.findArtifact(12);
		xedisu.printStatus();
		
		System.out.println();
		System.out.println();
		cafedon.setPositionX(5000);
		cafedon.setPositionY(3000);
		xedisu.printStatus();
		cafedon.printStatus();
		System.out.println("is the distance from the players smaller than 1000 units ? " + GameUtils.isDistanceSmallerThan1000(xedisu, cafedon));
		System.out.println();
		System.out.println("should " + xedisu.getNickname() + " attack " + cafedon.getNickname()+ " ? " +  GameUtils.shouldAttackOpponent(xedisu, cafedon));
		System.out.println();
		GameUtils.duel(xedisu, cafedon);
		
	}
}
