package org.carroll.baseball;

import java.util.HashMap;

public class BaseballTeam extends AbstractBaseballTeam {
    private HashMap<Integer,IBaseballPlayer> players;
    
    public BaseballTeam(String teamName) {
    	super(teamName);
    }
}
