package org.carroll.baseball;

public abstract class AbstractBaseballTeam implements IBaseballTeam {
    private String teamName;
    
    public AbstractBaseballTeam(String teamName) {
        this.teamName = teamName;	
    }
    
    public String getTeamName() {
    	return teamName;
    }
}
