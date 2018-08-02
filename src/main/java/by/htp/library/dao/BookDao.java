package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Book;

public interface BookDao {
	
	Book getBookById(int idBook);

	List<Book> list();

	void addBook(Book book);

	void deleteBookById(int idBook);

	void updateBookOwner(int idBook, int idReader);
}
