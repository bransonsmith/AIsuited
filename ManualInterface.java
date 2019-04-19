import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Common.Logger;
import HandEvaluation.HandEvaluatorCardCountProblem;
import HandEvaluation.Util.KickerFillProblem;
import Players.AlwaysAllIn;
import Players.AlwaysFold;
import Players.Player;
import Players.Rock;

public class ManualInterface {

	public static void main(String[] args) throws Exception, HandEvaluatorCardCountProblem, KickerFillProblem {
		
		Scanner kb = new Scanner(System.in);
		
		List<Player> players = new ArrayList<Player>();
		players.add(new Rock("Branson", "Branson"));
		players.add(new Rock("Trent", "Trent"));
		players.add(new Rock("Max", "Max"));
		players.add(new Rock("Alec", "Alec"));
		players.add(new Rock("the Baz", "Tubz"));
		players.add(new Rock("Mamaux", "Mamaux"));
		players.add(new Rock("Ian", "Ian"));
		players.add(new Rock("Sheu", "Sheu"));
		players.add(new Rock("McCrae", "McCrae"));
		
		
	}

}
