import java.util.ArrayList;

public class Matchbase {
	
	private ArrayList<Match> matches = new ArrayList<Match>();
	
	public void addMatchToMatchbase(Match match){
		matches.add(match);
	}
	
	public void infoAboutAllGames(){
		System.out.println(matches);
	}
	
}
