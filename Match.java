
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awayTeam == null) ? 0 : awayTeam.hashCode());
		result = prime * result + goalScoredAwayTeam;
		result = prime * result + goalScoredHomeTeam;
		result = prime * result + ((homeTeam == null) ? 0 : homeTeam.hashCode());
		result = prime * result + ((nameOfGroup == null) ? 0 : nameOfGroup.hashCode());
		result = prime * result + ((round == null) ? 0 : round.hashCode());
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Match other = (Match) obj;
		if (awayTeam == null) {
			if (other.awayTeam != null)
				return false;
		} else if (!awayTeam.equals(other.awayTeam))
			return false;
		if (goalScoredAwayTeam != other.goalScoredAwayTeam)
			return false;
		if (goalScoredHomeTeam != other.goalScoredHomeTeam)
			return false;
		if (homeTeam == null) {
			if (other.homeTeam != null)
				return false;
		} else if (!homeTeam.equals(other.homeTeam))
			return false;
		if (nameOfGroup == null) {
			if (other.nameOfGroup != null)
				return false;
		} else if (!nameOfGroup.equals(other.nameOfGroup))
			return false;
		if (round == null) {
			if (other.round != null)
				return false;
		} else if (!round.equals(other.round))
			return false;
		if (season == null) {
			if (other.season != null)
				return false;
		} else if (!season.equals(other.season))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return season + ", "  + round + ", " + nameOfGroup + ", " + homeTeam + " - " + awayTeam + " " + goalScoredHomeTeam + ":" + goalScoredAwayTeam;
	}

}
