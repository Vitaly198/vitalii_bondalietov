import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Football {
	
	Matchbase championsLeague = new Matchbase();
	
	public void addAllGames(){
		
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Shakhtar Donetsk", "Manchester City", 0, 3));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Dinamo Zagreb", "Atalanta", 4, 0));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Atalanta", "Shakhtar Donetsk", 1, 2));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Manchester City", "Dinamo Zagreb", 2, 0));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Shakhtar Donetsk", "Dinamo Zagreb", 2, 2));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Manchester City", "Atalanta", 5, 1));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Atalanta", "Manchester City", 1, 1));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Dinamo Zagreb", "Shakhtar Donetsk", 3, 3));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Manchester City", "Shakhtar Donetsk", 1, 1));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Atalanta", "Dinamo Zagreb", 2, 0));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Shakhtar Donetsk", "Atalanta", 0, 3));
		championsLeague.addMatchToMatchbase(new Match("2019/20", "Group stage", "C", "Dinamo Zagreb", "Manchester City", 1, 4));
	}
	
	public void addGamesOfOneGroup(BufferedReader reader) throws IOException{
		championsLeague.getOneGroup(reader);
	}

	public void printAllGames(){
		championsLeague.infoAboutAllGames();
	}
	
	public void printGamesInOneGroup() {
		championsLeague.infoAboutGamesInOneGroup();
	}
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Football football = new Football();
		football.addAllGames();
		football.printAllGames();
			try {
				football.addGamesOfOneGroup(reader);
			} catch (IOException e) {
				System.out.println("Error!");
			e.printStackTrace();
		}
		football.printGamesInOneGroup();
	}

}
