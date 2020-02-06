

public class Football {
	
	public void addAllGames(){
		Matchbase w = new Matchbase();
		Match one = new Match("2019/20", "Group stage", "C", "Shakhtar Donetsk", "Manchester City", 0, 3);
		Match two = new Match("2019/20", "Group stage", "C", "Dinamo Zagreb", "Atalanta", 4, 0);
		Match three = new Match("2019/20", "Group stage", "C", "Atalanta", "Shakhtar Donetsk", 1, 2);
		Match four = new Match("2019/20", "Group stage", "C", "Manchester City", "Dinamo Zagreb", 2, 0);
		Match five = new Match("2019/20", "Group stage", "C", "Shakhtar Donetsk", "Dinamo Zagreb", 2, 2);
		Match six = new Match("2019/20", "Group stage", "C", "Manchester City", "Atalanta", 5, 1);
		Match seven = new Match("2019/20", "Group stage", "C", "Atalanta", "Manchester City", 1, 1);
		Match eight = new Match("2019/20", "Group stage", "C", "Dinamo Zagreb", "Shakhtar Donetsk", 3, 3);
		Match nine = new Match("2019/20", "Group stage", "C", "Manchester City", "Shakhtar Donetsk", 1, 1);
		Match ten = new Match("2019/20", "Group stage", "C", "Atalanta", "Dinamo Zagreb", 2, 0);
		Match eleven = new Match("2019/20", "Group stage", "C", "Shakhtar Donetsk", "Atalanta", 0, 3);
		Match twelve = new Match("2019/20", "Group stage", "C", "Dinamo Zagreb", "Manchester City", 1, 4);
		w.addMatchToMatchbase(one);
		w.addMatchToMatchbase(two);
		w.addMatchToMatchbase(three);
		w.addMatchToMatchbase(four);
		w.addMatchToMatchbase(five);
		w.addMatchToMatchbase(six);
		w.addMatchToMatchbase(seven);
		w.addMatchToMatchbase(eight);
		w.addMatchToMatchbase(nine);
		w.addMatchToMatchbase(ten);
		w.addMatchToMatchbase(eleven);
		w.addMatchToMatchbase(twelve);
		w.infoAboutAllGames();
	}

	public static void main(String[] args) {
		Football football = new Football();
		football.addAllGames();
	}

}
