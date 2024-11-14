package com.xworkz.database.dto;

public class SportsDTO {

	private int teamId;
	private String teamName;
	private String playerName;
	private String sportType;
	private int score;
	private int gameDuration;
	private String venue;
	private String coachName;
	private String league;
	private int ranking;

	public SportsDTO(int teamId, String teamName, String playerName, String sportType, int score, int gameDuration,
			String venue, String coachName, String league, int ranking) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.playerName = playerName;
		this.sportType = sportType;
		this.score = score;
		this.gameDuration = gameDuration;
		this.venue = venue;
		this.coachName = coachName;
		this.league = league;
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "SportsDTO [teamId=" + teamId + ", teamName=" + teamName + ", playerName=" + playerName + ", sportType="
				+ sportType + ", score=" + score + ", gameDuration=" + gameDuration + ", venue=" + venue
				+ ", coachName=" + coachName + ", league=" + league + ", ranking=" + ranking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coachName == null) ? 0 : coachName.hashCode());
		result = prime * result + gameDuration;
		result = prime * result + ((league == null) ? 0 : league.hashCode());
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		result = prime * result + ranking;
		result = prime * result + score;
		result = prime * result + ((sportType == null) ? 0 : sportType.hashCode());
		result = prime * result + teamId;
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		result = prime * result + ((venue == null) ? 0 : venue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportsDTO other = (SportsDTO) obj;
		if (coachName == null) {
			if (other.coachName != null)
				return false;
		} else if (!coachName.equals(other.coachName))
			return false;
		if (gameDuration != other.gameDuration)
			return false;
		if (league == null) {
			if (other.league != null)
				return false;
		} else if (!league.equals(other.league))
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		if (ranking != other.ranking)
			return false;
		if (score != other.score)
			return false;
		if (sportType == null) {
			if (other.sportType != null)
				return false;
		} else if (!sportType.equals(other.sportType))
			return false;
		if (teamId != other.teamId)
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		if (venue == null) {
			if (other.venue != null)
				return false;
		} else if (!venue.equals(other.venue))
			return false;
		return true;
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

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getSportType() {
		return sportType;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getGameDuration() {
		return gameDuration;
	}

	public void setGameDuration(int gameDuration) {
		this.gameDuration = gameDuration;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

}