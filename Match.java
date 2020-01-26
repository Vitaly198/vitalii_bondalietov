
public class Match {

	private String season;
	private String nameOfGame;
	private int goalScored;
	private int goalConceded;
		
	public Match(String season, String nameOfGame, int goalScored, int goalConceded) {
	    this.season = season;
	    this.nameOfGame = nameOfGame;
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
		System.out.println(season + ", " + nameOfGame + " " + goalScored + ":" + goalConceded);
	}
//I want to show in console the only one match information	
	public static void main (String [] args){
		Match one = new Match("2019/20", "Shakhtar Donetsk-Manchester City", 0, 3);
		one.infoAboutOneGame();
	}
}
