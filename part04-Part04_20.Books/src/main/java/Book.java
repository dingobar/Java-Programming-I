/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin
 */
public class Book {

	private final String _name;
	private final int _pages;
	private final int _publicationYear;

	public Book(String name, int pages, int publicationYear) {
		_name = name;
		_pages = pages;
		_publicationYear = publicationYear;
	}

	public String getName() {
		return _name;
	}

	public int getPages() {
		return _pages;
	}

	public int getPublicationYear() {
		return _publicationYear;
	}

	@Override
	public String toString() {
		return _name + ", " + _pages + " pages, " + _publicationYear;
	}
}
