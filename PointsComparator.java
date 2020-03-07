import java.util.Comparator;

public class PointsComparator implements Comparator<TeamResult> {
	@Override
	public int compare(TeamResult o1, TeamResult o2) {
		int diff;
		diff = o2.getPoints() - o1.getPoints();
		if (diff == 0) {
			diff = o2.getPlusOrMinus() - o1.getPlusOrMinus();
		}
		if (diff == 0) {
			diff = o2.getGoalsScored() - o1.getGoalsScored();
		}

		return diff;

	}
}
