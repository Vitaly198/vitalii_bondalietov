
public class Match {

	private String season;
	private String round;
	private String nameOfGroup;
	private String homeTeam;
	private String awayTeam;
	private int goalScoredHomeTeam;
	private int goalScoredAwayTeam;
		
	public Match(String season, String round, String nameOfGroup, String homeTeam, String awayTeam, int goalScoredHomeTeam, int goalScoredAwayTeam) {
	    this.season = season;
	    this.round = round;
	    this.nameOfGroup = nameOfGroup;
	    this.homeTeam = homeTeam;
	    this.awayTeam = awayTeam;
	    this.goalScoredHomeTeam = goalScoredHomeTeam;
	    this.goalScoredAwayTeam = goalScoredAwayTeam;
	}
	
	public String getSeason(){
		return season;
	}
	
	public void setSeason(String season){
		this.season = season;
	}
	
	public String getRound(){
		return round;
	}
	
	public void setRound(String round){
		this.round = round;
	}
	
	public String getNameOfGroup(){
		return nameOfGroup;
	}
	
	public void setNameOfGroup(String nameOfGroup){
		this.nameOfGroup = nameOfGroup;
	}
	
	public String getHomeTeam(){
		return homeTeam;
	}
	
	public void setHomeTeam(String homeTeam){
		this.homeTeam = homeTeam;
	}
	
	public String getAwayTeam(){
		return awayTeam;
	}
	
	public void setAwayTeam(String awayTeam){
		this.awayTeam = awayTeam;
	}
	
	public int getGoalScoredHomeTeam(){
		return goalScoredHomeTeam;
	}
	
	public void setGoalScoredHomeTeam(int goalScoredHomeTeam){
		this.goalScoredHomeTeam = goalScoredHomeTeam;
	}
	
	public int getGoalScoredAwayTeam(){
		return goalScoredAwayTeam;
	}
	
	public void setGoalScoredAwayTeam(int goalScoredAwayTeam){
		this.goalScoredAwayTeam = goalScoredAwayTeam;
	}
	
	public void infoAboutOneGame(){
		System.out.println(season + ", "  + round + ", " + nameOfGroup + ", " + homeTeam + " - " + awayTeam + " " + goalScoredHomeTeam + ":" + goalScoredAwayTeam);
		
	}

	public static void main (String [] args){
		Match one = new Match("2019/20", "Group stage", "Group C", "Shakhtar", "Manchester City", 0, 3);
		one.infoAboutOneGame();
		Match two = new Match("2019/20", "Group stage", "Group C", "Atalanta", "Shakhtar Donetsk", 1, 2);
		two.infoAboutOneGame();
	}
}
