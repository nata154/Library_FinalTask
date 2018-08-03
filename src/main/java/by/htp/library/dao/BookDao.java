package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Book;
import by.htp.library.entity.Reader;

public interface BookDao {
	
	Book getBookById(int idBook);

	List<Book> list();
	
	Book readBook(int idBook);

	Book addNewBook();
	
	void addBooktoReader(Book book);

//	void deleteBookById(int idBook);

	void updateBookOwner(Book book,  Reader reader);
	
	void updateBook(Book book);
	
	void deleteBook(Book book);
	
	void getBookInformation();
}
