
public class TeamResult {

	private int games;
	private int wins;
	private int draws;
	private int loses;
	private int goalsScored;
	private int goalsConceded;
	private int points;

	public TeamResult(int games, int wins, int draws, int loses, int goalsScored, int goalsConceded, int points) {
		this.games = games;
		this.wins = wins;
		this.draws = draws;
		this.loses = loses;
		this.goalsScored = goalsScored;
		this.goalsConceded = goalsConceded;
		this.points = points;
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

	public void infoAboutOneTeam() {
		System.out.println(games + "  " + wins + " " + draws + " " + loses + "  " + goalsScored + "-" + goalsConceded
				+ "  " + points);
	}

	@Override
	public String toString() {
		return games + "  " + wins + " " + draws + " " + loses + "  " + goalsScored + "-" + goalsConceded + "  "
				+ points;
	}

}