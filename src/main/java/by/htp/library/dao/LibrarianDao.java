package by.htp.library.dao;

import java.util.List;

import by.htp.library.librarian.Librarian;

public interface LibrarianDao {
	Librarian read(int idLibrarian);

	List<Librarian> list();

	void autorizeLibrarian(Librarian librarian);

	void addNewBook(Librarian librarian);

	void getLibrarianCounter(Librarian librarian);
	
	void setReturnedBook(Librarian librarian);
}
