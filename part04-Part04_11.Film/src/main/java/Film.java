/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Film {

	private final String _name;
	private final int _ageRating;

	public Film(String filmName, int filmAgeRating) {
		_name = filmName;
		_ageRating = filmAgeRating;
	}

	public String name() {
		return _name;
	}

	public int ageRating() {
		return _ageRating;
	}
}
