package uiproject1;

import org.carroll.baseball.IBaseballTeam;
import org.carroll.baseball.BaseballTeam;

public class BaseballSimulation {
	private IBaseballTeam team;

	public static void main(String[] args) {
		BaseballSimulation simulation = new BaseballSimulation();
		simulation.start();
	}
	
	private void start() {
		team = new BaseballTeam("Phillies");
		team.addPlayer("Cole Hamels");
	}

}
