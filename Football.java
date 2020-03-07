import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Football {

	Matchbase championsLeague = new Matchbase();

	public void addAllGames(BufferedReader reader) throws IOException {

		boolean ifYes = true;

		while (ifYes) {
			System.out.println("Do you want to enter the match? (yes or no)");
			String answer = reader.readLine();
			if (answer.toLowerCase().equals("yes")) {
				System.out.println("Enter the season: ");
				String season = reader.readLine();
				System.out.println("Enter the round: ");
				String round = reader.readLine();
				System.out.println("Enter the name of group: ");
				String nameOfGroup = reader.readLine();
				System.out.println("Enter the name of home team: ");
				String homeTeam = reader.readLine();
				System.out.println("Enter the name of away team: ");
				String awayTeam = reader.readLine();
				System.out.println("Enter goals scored of home team: ");
				int goalScoredHomeTeam = Integer.parseInt(reader.readLine());
				System.out.println("Enter goals scored of away team: ");
				int goalScoredAwayTeam = Integer.parseInt(reader.readLine());
				championsLeague.addMatchToMatchbase(new Match(season, round, nameOfGroup, homeTeam, awayTeam,
						goalScoredHomeTeam, goalScoredAwayTeam));
			} else {
				ifYes = false;
				break;
			}
		}
		ifYes = true;

	}

	public void showOneGroup(BufferedReader reader) throws IOException {
		System.out.println("Enter the necessary season: ");
		String season = reader.readLine();
		System.out.println("Enter the necessary round: ");
		String round = reader.readLine();
		System.out.println("Enter the necessary name of group: ");
		String nameOfGroup = reader.readLine();
		List<Match> groupChoice = championsLeague.getOneGroup(season, round, nameOfGroup);
		List<TeamResult> table = new ArrayList();
		boolean ifTableContainsTeam = false;
		table.add(new TeamResult(groupChoice.get(0).getHomeTeam()));
		table.add(new TeamResult(groupChoice.get(0).getAwayTeam()));
		for (int i = 0; i < groupChoice.size(); i++) {
			for (int j = 0; j < table.size(); j++) {
				if (!table.get(j).getTeamName().equals(groupChoice.get(i).getHomeTeam())) {
					ifTableContainsTeam = false;
				} else {
					ifTableContainsTeam = true;
					break;
				}
			}
			if (ifTableContainsTeam == false) {
				table.add(new TeamResult(groupChoice.get(i).getHomeTeam()));
			}
			ifTableContainsTeam = false;
		}
		for (int i = 0; i < groupChoice.size(); i++) {
			for (int j = 0; j < table.size(); j++) {
				if (!table.get(j).getTeamName().equals(groupChoice.get(i).getAwayTeam())) {
					ifTableContainsTeam = false;
				} else {
					ifTableContainsTeam = true;
					break;
				}
			}
			if (ifTableContainsTeam == false) {
				table.add(new TeamResult(groupChoice.get(i).getAwayTeam()));
			}
			ifTableContainsTeam = false;
		}

		int countGames = 0;
		int countWins = 0;
		int countDraws = 0;
		int countLoses = 0;
		int countGoalScored = 0;
		int countGoalConceded = 0;
		int countPoints = 0;
		int countPlusOrMinus = 0;

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam())
						|| table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam())) {
					countGames++;
				}
				table.get(i).setGames(countGames);
			}
			countGames = 0;
		}

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam()) && (groupChoice.get(j)
						.getGoalScoredHomeTeam()) > (groupChoice.get(j).getGoalScoredAwayTeam())) {
					countWins++;
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam()) && (groupChoice.get(j)
						.getGoalScoredAwayTeam()) > (groupChoice.get(j).getGoalScoredHomeTeam())) {
					countWins++;
				}
				table.get(i).setWins(countWins);
			}
			countWins = 0;
		}

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam()) && (groupChoice.get(j)
						.getGoalScoredHomeTeam()) == (groupChoice.get(j).getGoalScoredAwayTeam())) {
					countDraws++;
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam()) && (groupChoice.get(j)
						.getGoalScoredAwayTeam()) == (groupChoice.get(j).getGoalScoredHomeTeam())) {
					countDraws++;
				}
				table.get(i).setDraws(countDraws);
			}
			countDraws = 0;
		}

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam()) && (groupChoice.get(j)
						.getGoalScoredHomeTeam()) < (groupChoice.get(j).getGoalScoredAwayTeam())) {
					countLoses++;
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam()) && (groupChoice.get(j)
						.getGoalScoredAwayTeam()) < (groupChoice.get(j).getGoalScoredHomeTeam())) {
					countLoses++;
				}
				table.get(i).setLoses(countLoses);
			}
			countLoses = 0;
		}

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam())) {
					countGoalScored = countGoalScored + groupChoice.get(j).getGoalScoredHomeTeam();
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam())) {
					countGoalScored = countGoalScored + groupChoice.get(j).getGoalScoredAwayTeam();
				}

				table.get(i).setGoalsScored(countGoalScored);
			}
			countGoalScored = 0;
		}

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam())) {
					countGoalConceded = countGoalConceded + groupChoice.get(j).getGoalScoredAwayTeam();
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam())) {
					countGoalConceded = countGoalConceded + groupChoice.get(j).getGoalScoredHomeTeam();
				}

				table.get(i).setGoalsConceded(countGoalConceded);
			}
			countGoalConceded = 0;
		}

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam()) && (groupChoice.get(j)
						.getGoalScoredHomeTeam()) > (groupChoice.get(j).getGoalScoredAwayTeam())) {
					countPoints += 3;
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam()) && (groupChoice.get(j)
						.getGoalScoredHomeTeam()) < (groupChoice.get(j).getGoalScoredAwayTeam())) {
					countPoints += 3;
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam()) && (groupChoice.get(j)
						.getGoalScoredHomeTeam()) == (groupChoice.get(j).getGoalScoredAwayTeam())) {
					countPoints++;
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam()) && (groupChoice.get(j)
						.getGoalScoredHomeTeam()) == (groupChoice.get(j).getGoalScoredAwayTeam())) {
					countPoints++;
				}

				table.get(i).setPoints(countPoints);
			}
			countPoints = 0;
		}

		for (int i = 0; i < table.size(); i++) {
			for (int j = 0; j < groupChoice.size(); j++) {
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getHomeTeam())) {
					countPlusOrMinus = countPlusOrMinus + (groupChoice.get(j).getGoalScoredHomeTeam())
							- (groupChoice.get(j).getGoalScoredAwayTeam());
				}
				if (table.get(i).getTeamName().equals(groupChoice.get(j).getAwayTeam())) {
					countPlusOrMinus = countPlusOrMinus + (groupChoice.get(j).getGoalScoredAwayTeam())
							- (groupChoice.get(j).getGoalScoredHomeTeam());
				}
				table.get(i).setPlusOrMinus(countPlusOrMinus);
			}
			countPlusOrMinus = 0;
		}

		table.sort(new PointsComparator());
		for (TeamResult sortTable : table) {
			System.out.println(sortTable);
		}

	}

	public void printAllGames() {
		championsLeague.infoAboutAllGames();
	}

	public void printTable(List<TeamResult> table) {
		for (int i = 0; i < table.size(); i++) {
			table.get(i).infoAboutOneTeam();
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Football football = new Football();
		football.addAllGames(reader);
		football.printAllGames();
		football.showOneGroup(reader);
	}

}

