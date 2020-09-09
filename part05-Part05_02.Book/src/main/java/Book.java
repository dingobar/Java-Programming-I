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

	private final String _author;
	private final String _title;
	private final int _pages;

	public Book(String author, String title, int pages) {
		_author = author;
		_title = title;
		_pages = pages;
	}

	public String getAuthor() {
		return _author;
	}

	public String getName() {
		return _title;
	}

	public int getPages() {
		return _pages;
	}

	@Override
	public String toString() {
		return _author + ", " + _title + ", " + _pages + " pages";
	}
}
