
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public class Package {

	private final ArrayList<Gift> _gifts;

	public Package() {
		_gifts = new ArrayList();
	}

	public void addGift(Gift gift) {
		_gifts.add(gift);
	}

	public int totalWeight() {
		return _gifts.stream().mapToInt((i) -> i.getWeight()).sum();
	}

}
