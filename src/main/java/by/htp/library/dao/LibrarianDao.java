package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Librarian;

public interface LibrarianDao {
	
	Librarian read(int idLibrarian);

	List<Book> list();

	void autorizeLibrarian(Librarian librarian);
	
	void showMainLibrarianMenu();

	void showOverdueBookReaders(Librarian librarian);

	void addNewBook(Librarian librarian);
	
	void setReturnedBook(Librarian librarian);
	
	void 
}
