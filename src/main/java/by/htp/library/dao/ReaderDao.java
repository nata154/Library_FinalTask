package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Book;
import by.htp.library.entity.Reader;

public interface ReaderDao {

	Book read(Book book);//есть

	List<Book> list();//есть

	void autorizeReader(Reader reader);
	//showReaderLoginMenu();
	
	void showMainReaderMenu();//есть

	
	void showOverdueBooks(Book book);
	
	//void getBookList();
	
	//void getBookInformation();
	
	
}
