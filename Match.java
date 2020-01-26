
public class Match {

	private String season;
	private String nameOfGame;
	private boolean isGameAtHome;
	private int goalScored;
	private int goalConceded;
		
	public Match(String season, String nameOfGame, boolean isGameAtHome, int goalScored, int goalConceded) {
	    this.season = season;
	    this.nameOfGame = nameOfGame;
	    this.isGameAtHome = isGameAtHome;
	    this.goalScored = goalScored;
	    this.goalConceded = goalConceded;
	}
	
	public String getSeason(){
		return season;
	}
	
	public void setSeason(String season){
		this.season = season;
	}
	
	public String getNameOfGame(){
		return nameOfGame;
	}
	
	public void setNameOfGame(String nameOfGame){
		this.nameOfGame = nameOfGame;
	}
	
	public boolean getIsGameAtHome(){
		return isGameAtHome;
	}
	
	public void setIsGameAtHome(boolean isGameAtHome){
		this.isGameAtHome = isGameAtHome;
	}
	
	public int getGoalScored(){
		return goalScored;
	}
	
	public void setGoalScored(int goalScored){
		this.goalScored = goalScored;
	}
	
	public int getGoalConceded(){
		return goalConceded;
	}
	
	public void setGoalConceded(int goalConceded){
		this.goalConceded = goalConceded;
	}
	
	public void infoAboutOneGame(){
		if (isGameAtHome == true)
			System.out.println(season + ", " + nameOfGame + " " + goalScored + ":" + goalConceded);
		else
			System.out.println(season + ", " + nameOfGame + " " + goalConceded + ":" + goalScored);
	}

	public static void main (String [] args){
		Match one = new Match("2019/20", "Shakhtar Donetsk-Manchester City", true, 0, 3);
		one.infoAboutOneGame();
	}
}
