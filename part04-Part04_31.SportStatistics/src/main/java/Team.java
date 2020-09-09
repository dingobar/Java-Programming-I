/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Team {

	final private String _name;

	public Team(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	@Override
	public String toString() {
		return _name;
	}

}
