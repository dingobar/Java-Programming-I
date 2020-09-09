/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Whistle {

	final private String _sound;

	public Whistle(String sound) {
		_sound = sound;
	}

	public void sound() {
		System.out.println(_sound);
	}
}
