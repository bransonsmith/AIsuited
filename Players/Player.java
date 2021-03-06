package Players;

import GameRunning.Decisions.DecisionContext;
import GameRunning.Decisions.HEDecision;
import HandEvaluation.HandEvaluatorCardCountProblem;
import HandEvaluation.Util.KickerFillProblem;

public abstract class Player {
	
	private String name; 
	private String ownerName;
	
	public abstract HEDecision getDecision(DecisionContext decisionContext) throws HandEvaluatorCardCountProblem, KickerFillProblem;
	
	public Player(String _name, String ownerName) {
		setName(_name);
		setOwnerName(_name);
	}
	
	public String getName() { return name; }
	public void   setName(String _name) { name = _name; }
	public String getOwnerName() { return ownerName; }
	public void   setOwnerName(String _ownerName) { ownerName = _ownerName; }
}
