
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
public class Stack {

	private final ArrayList<String> _fuck;

	public Stack() {
		_fuck = new ArrayList();
	}

	public boolean isEmpty() {
		return _fuck.isEmpty();
	}

	public void add(String value) {
		_fuck.add(value);
	}

	public ArrayList<String> values() {
		return _fuck;
	}

	public String take() {
		String item = "";
		if (!_fuck.isEmpty()) {
			item = _fuck.get(_fuck.size() - 1);
			_fuck.remove(item);
		}
		return item;
	}

}
