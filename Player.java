public class Player {

	private String name;
	private String userName;
	private int level;
	private boolean hasMedal;
	private double prizeMoney;
	
	public Player(){this("", "", 0, false, 0.0);}
	
	public Player(String name, String userName, int level, boolean hasMedal, double prizeMoney ) {
		this.name = name;
		this.userName = userName;
		this.level = level;
		this.hasMedal = hasMedal;
		this.prizeMoney = prizeMoney;
				
	}
	
	//Create Getters to return private instance variables
	public String getName() {return name;}
	public String getUserName() {return userName;}
	public int getLevel() {return level;}
	public boolean getHasMedal() {return hasMedal;}
	public double getPrizeMoney() {return prizeMoney;}
	
	//Create Setters to modify private instance variables
	public void setName(String newName) {
		name = newName;
	}
	public void setUserName(String newName) {
		userName = newName;
	}
	public void setlevel(int level) {
		this.level = level;
	}
	public void setHasMedal(boolean hasMedal) {
		this.hasMedal = hasMedal;
	}
	public void setPrizeMoney(double prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	
	public String toString() {
		return "Player Name: " + name + "\nUserName: " + userName + "\nThis player's level is " + level + "They have $" + prizeMoney;
	}
}
