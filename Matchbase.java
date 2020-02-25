import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Matchbase {
	
	private List<Match> matches = new ArrayList<Match>();
	private List<Match> groupChoice = new ArrayList<Match>();
	
	public void addMatchToMatchbase(Match match){
		matches.add(match);
	}
	
	public void getOneGroup(BufferedReader reader) throws IOException {
		System.out.println("Enter the season, round and name of group: ");
		String season = reader.readLine();
		String round = reader.readLine();
		String nameOfGroup = reader.readLine();
		for (int i = 0; i < matches.size(); i++) {
			if (matches.get(i).getSeason().equals(season) && matches.get(i).getRound().equals(round) && matches.get(i).getNameOfGroup().equals(nameOfGroup)) {
				groupChoice.add(matches.get(i));
				}
		}
	}
	
	public void infoAboutAllGames(){
		if (matches.isEmpty()) {
			System.out.println("Not found matches.");
			}
			else
			for (int i = 0; i < matches.size(); i++) {
			System.out.println(matches.get(i));
			}
	}
	
	public void infoAboutGamesInOneGroup(){
		if (groupChoice.isEmpty()) {
			System.out.println("Not found matches.");
			}
			else
			for (int i = 0; i < groupChoice.size(); i++) {
			System.out.println(groupChoice.get(i));
			}
	}
	
}
