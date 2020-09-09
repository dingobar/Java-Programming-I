/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Cube {

	private final int _edge;

	public Cube(int edgeLength) {
		_edge = edgeLength;
	}

	public int volume() {
		return (int) Math.pow(_edge, 3);
	}

	@Override
	public String toString() {
		return "The length of the edge is " + _edge
			+ " and the volume " + volume();
	}
}
