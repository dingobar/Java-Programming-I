/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Container {

	private int content;
	private final int maxContent;

	public Container() {
		content = 0;
		maxContent = 100;
	}

	public int contains() {
		return content;
	}

	public void add(int amount) {
		amount = Integer.max(amount, 0);
		content = Integer.min(content + amount, maxContent);
	}

	public void remove(int amount) {
		amount = Integer.max(amount, 0);
		content = Integer.max(content - amount, 0);
	}

	@Override
	public String toString() {
		return content + "/100";
	}

}
