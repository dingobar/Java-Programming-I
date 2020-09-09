
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author martin
 */
public class Item {

	private final String _id;
	private final String _name;

	public String getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public Item(String id, String name) {
		_id = id;
		_name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Item other = (Item) obj;
		return Objects.equals(this._id, other._id);
	}

	@Override
	public String toString() {
		return _id + ": " + _name;
	}

}
