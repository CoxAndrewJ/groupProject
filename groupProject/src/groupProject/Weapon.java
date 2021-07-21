package groupProject;

/**
 * Creating 4 fields that are not instantiated in the constructor
 * The statistics are hardcoded in each weapon
 * The getters will return all the values of each weapon, a
 * the code does not need to be duplicated
 * 
 * @author Andrew
 *
 */
public enum Weapon{
	
	//Possible start with weaker unarmed state until chest are looted
		//UNARMED(0,0,0,0),
		BASEBALLBAT(0,1,3,1), 
		CHAINSAW(0,5,5,2), 
		PISTOL(1,1,4,1),
		SHOTGUN(1,2,4,2);
	//Possible upgraded weapons
		//BASEBALLBATWITHNAILS()
		//DOUBLECHAINSAW()
		//DOUBLEBARRELSHOTGUN()
		//EXTENDEDMAGPISTOL()
		
		private final int range, numberOfDice, damageRoll, damageRating;

		
		private Weapon(int range, int numberOfDice, int damageRoll, int damageRating) {
			this.range=range;
			this.numberOfDice=numberOfDice;
			this.damageRoll=damageRoll;
			this.damageRating=damageRating;
	}
		
		public int getRange() {
			return range;
		}
		
		public int getNumberOfDice() {
			return numberOfDice;
		}

		public int getDamageRoll() {
			return damageRoll;
		}
		
		public int getDamageRating() {
			return damageRating;
		}
	
}
