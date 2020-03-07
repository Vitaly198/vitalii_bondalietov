
public class TeamResult {

	private String teamName;
	private int games;
	private int wins;
	private int draws;
	private int loses;
	private int goalsScored;
	private int goalsConceded;
	private int points;
	private int plusOrMinus;
	
	public TeamResult() {
		
	}
	
	public TeamResult(String teamName) {
		this.teamName = teamName;
	}

	public TeamResult(String teamName, int games, int wins, int draws, int loses, int goalsScored, int goalsConceded, int points, int plusOrMinus) {
		this.teamName = teamName;
		this.games = games;
		this.wins = wins;
		this.draws = draws;
		this.loses = loses;
		this.goalsScored = goalsScored;
		this.goalsConceded = goalsConceded;
		this.points = points;
		this.plusOrMinus = plusOrMinus;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDraws() {
		return draws;
	}

	public void setDraws(int draws) {
		this.draws = draws;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public int getGoalsConceded() {
		return goalsConceded;
	}

	public void setGoalsConceded(int goalsConceded) {
		this.goalsConceded = goalsConceded;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getPlusOrMinus() {
		return plusOrMinus;
	}

	public void setPlusOrMinus(int plusOrMinus) {
		this.plusOrMinus = plusOrMinus;
	}

	public void infoAboutOneTeam() {
		System.out.printf("%-15s %-2d %-2d %-2d %-2d %2d-%-2d %-2d", teamName, games, wins, draws, loses, goalsScored, goalsConceded, points);
	}

	@Override
	public String toString() {
		return String.format("%-15s %-2d %-2d %-2d %-2d %2d-%-2d %-2d", teamName, games, wins, draws, loses, goalsScored, goalsConceded, points);
	}

}