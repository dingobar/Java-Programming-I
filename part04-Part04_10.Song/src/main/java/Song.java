/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Song {

	private final String _name;
	private final int _length;

	public Song(String name, int length) {
		_name = name;
		_length = length;
	}

	public String name() {
		return _name;
	}

	public int length() {
		return _length;
	}
}
