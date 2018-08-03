package by.htp.library;

import java.util.Scanner;

import by.htp.library.dao.impl.LibrarianDaoImpl;
import by.htp.library.dao.impl.ReaderDaoImpl;

public class LibraryManager {

	Scanner scanner = new Scanner(System.in);
	ReaderDaoImpl rdi = new ReaderDaoImpl();
	LibrarianDaoImpl ldi = new LibrarianDaoImpl();

	public void showMainMenu() {
		System.out.println("Choose menu-item.");
		System.out.println("1 Reader");
		System.out.println("2 Librarian");
		System.out.println("3 Exit");

		int menuItem = scanner.nextInt();

		switch (menuItem) {
		case 1:
			rdi.autorizeReader();
			rdi.showOverdueBooks();
			rdi.showMainReaderMenu();
			break;
		case 2:
			ldi.autorizeLibrarian();
			ldi.showMainLibrarianMenu();
			ldi.showOverdueBookReaders();
			break;
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong number.");
			System.out.println("Enter number again.");
			showMainMenu();
		}
	}


}
