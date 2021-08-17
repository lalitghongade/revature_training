package model;

public class Team {
	private int teamId;
    private String teamName;
    
    public Team()
    {
    	
    }    
    
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @param teamId
	 * @param teamName
	 */
	public Team(int teamId, String teamName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + "]";
	}
    
    
	
	
}
