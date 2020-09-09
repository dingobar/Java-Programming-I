/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Match {

	final private Team _homeTeam;
	final private Team _awayTeam;
	final private int _homePoints;
	final private int _awayPoints;

	public Match(
		Team homeTeam,
		Team awayTeam,
		int homePoints,
		int awayPoints
	) throws InvalidScoreException {
		if (homePoints == awayPoints) {
			throw new InvalidScoreException(
				"The match cannot be a draw (was "
				+ homePoints
				+ " - "
				+ awayPoints
				+ ")."
			);
		}
		_homeTeam = homeTeam;
		_awayTeam = awayTeam;
		_homePoints = homePoints;
		_awayPoints = awayPoints;

	}

	public String getHomeTeam() {
		return _homeTeam.getName();
	}

	public String getAwayTeam() {
		return _awayTeam.getName();
	}

	public String getWinner() {
		return _homePoints > _awayPoints
			? _homeTeam.getName() : _awayTeam.getName();
	}

	@Override
	public String toString() {
		return _homeTeam + " " + _homePoints + " - " + _awayPoints + " " + _awayTeam;
	}
}
