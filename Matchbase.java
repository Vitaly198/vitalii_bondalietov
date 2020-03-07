import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Matchbase {
	
	private List<Match> matches = new ArrayList<Match>();
		
	public void addMatchToMatchbase(Match match){
		matches.add(match);
	}
	
	public List<Match> getOneGroup(String season, String round, String nameOfGroup) {
		List<Match> groupChoice = new ArrayList<Match>();
			for (int i = 0; i < matches.size(); i++) {
			if (matches.get(i).getSeason().equals(season) && matches.get(i).getRound().equals(round) && matches.get(i).getNameOfGroup().equals(nameOfGroup)) {
				groupChoice.add(matches.get(i));
				}
			}
			return groupChoice;
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
	
		
}
