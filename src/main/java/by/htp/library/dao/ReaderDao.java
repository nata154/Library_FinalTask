package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Reader;

public interface ReaderDao {

	void autorizeReader();
	
	List<Reader> list();
	
	void showMainReaderMenu();//есть
	
	void showOverdueBooks();

	
	
}
