package theGame;

public class PlayerStatus {

	private String nickname;
	private int score;
	private int lives;
	private int health;
	private String weaponInHand;
	private double positionX;
	private double positionY;
	protected static String gameName = "the game";

	private Utils utils = new Utils();
	private WeaponUtils weaponUtils = new WeaponUtils();
//	public PlayerStatus() {
//		weaponInHand = "";
//		health = 100;
//	}

//	public PlayerStatus(String nickname, int score, int lives, int health) {
//		this();
//		this.nickname = nickname;
//		this.score = score;
//		this.lives = lives;
//		this.health = health;
//	}

	public PlayerStatus(String nickname) {
//		this();
		this.nickname = nickname;
	}

	public PlayerStatus(String nickname, int lives) {
//		this();
		this.nickname = nickname;
		this.lives = lives;

	}

	public PlayerStatus(String nickname, int lives, int score) {
//		this();
		this.nickname = nickname;
		this.lives = lives;
		this.score = score;

	}

	public int getHealth() {
		return health;
	}

	public int getLives() {
		return lives;
	}

	public int getScore() {
		return score;
	}

	public String getNickname() {
		return nickname;
	}

	public String getWeaponInHand() {
		return weaponInHand;
	}

	public double getPositionX() {
		return positionX;
	}

	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	public double getPositionY() {
		return positionY;
	}

	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}

	public static String getGameName() {
		return gameName;
	}

	public static void setGameName(String gameName) {
		PlayerStatus.gameName = gameName;
	}

	// calculate dmg intake
	public double calculateDamage() {
//    	 System.out.println(3d * health /4  + 1d* score / 1000/4);
		return 3d * health / 4 + 1d * score / 1000 / 4;
	}

	// receive dmg + healthcheck
	public void receiveDamage(double damageReceived) {
		health -= damageReceived;
		System.out.println(nickname + " received a hit of " + damageReceived);
		healthCheck();
	}

	private void healthCheck() {
		if (health <= 0) {
			if (lives > 0) {
				lives--;
				System.out.println(nickname + " lost a life");
				health = 100;
			} else {
				System.out.println(nickname + "died");
			}
		}
		if (health > 100) {
			health = 100;
		}
	}

	public void findArtifact(int artifactCode) {
		if (utils.isPerfectNumber(artifactCode)) {
			score += 5000;
			lives += 1;
			health = 100;
			System.out.println(getNickname()+ " perfect artifact proc!");
		} else if (utils.isPrimeNumber(artifactCode)) {
			score += 1000;
			lives += 2;
			health += 25;
			System.out.println(getNickname()+ " prime artifact proc!");
			healthCheck();
		} else if (artifactCode % 2 == 0 && utils.calculateSumOfDigits(artifactCode) % 3 == 0) {
			score -= 3000;
			health -= 25;
			System.out.println(getNickname()+ " trap artifact proc!");
			healthCheck();
			GameUtils.isStillInGame(this);
			
		} else {
			System.out.println(getNickname()+ " default artifact proc!");
			score += artifactCode;
		}
	}

	public boolean setWeaponInHand(String weaponInHand) {
		if (weaponUtils.isValidWeapon(weaponInHand) && weaponUtils.hasScoreForPurchase(weaponInHand, score)) {
			this.weaponInHand = weaponInHand;
			score -= weaponUtils.priceTag(weaponInHand);
			return true;
		}
		return false;
	}

	public void movePlayerTo(double positionX, double positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public void printStatus() {
		System.out.println(getNickname() + " " + "score " + getScore() + " health " + getHealth() + " weapon " + getWeaponInHand() + " position "+ 
	getPositionX() + "," + getPositionY() + " lives " + getLives()) ;
	}
}
