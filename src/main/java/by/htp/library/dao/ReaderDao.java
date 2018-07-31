package by.htp.library.dao;

import java.util.List;

import by.htp.library.reader.Reader;

public interface ReaderDao {

	Reader read(int id);

	List<Reader> list();

	void autorize(Reader reader);

	void getBookList(Reader reader);

	void getBookInformation(Reader reader);
	
	void remindDeliquencyBook(Reader reader);
}
