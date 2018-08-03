package by.htp.library.dao.impl;

import java.util.List;
import java.util.Scanner;

import by.htp.library.dao.LibrarianDao;
import by.htp.library.dao.impl.ReaderDaoImpl;
import by.htp.library.entity.Reader;

public class LibrarianDaoImpl implements LibrarianDao{
	
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void autorizeLibrarian() {

		System.out.println("Enter librarian number");
		int librarianNumber = scanner.nextInt();
		System.out.println("Enter the password");
		String librarianPassword = scanner.nextLine();
	}

	@Override
	public void showMainLibrarianMenu() {
		BookDaoImpl bdi = new BookDaoImpl();
		ReaderDaoImpl rdi = new ReaderDaoImpl();

		System.out.println("Choose menu-item.");
		System.out.println("1 Get book list");
		System.out.println("2 Add new reader");
		System.out.println("3 Add new book");
		System.out.println("4 Check by idBook if book is given to enother reader");
		System.out.println("5 Return book");
		System.out.println("6 Show all readers");
		System.out.println("7 Exit");

		int menuItem = scanner.nextInt();

		switch (menuItem) {
		case 1:
			bdi.list();;
			break;
		case 2:
			addNewReader();
			break;
		case 3:
			addNewBook();
			break;
		case 4:
			checkBelongBook();
			break;
		case 5:
			addReturnedBook();
			break;
		case 6:
			rdi.list();
			break;
		case 7:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong number.");
			System.out.println("Enter number again.");
			showMainLibrarianMenu();
		}
	}

	@Override
	public void showOverdueBookReaders() {
		// TODO Auto-generated method stub
	}


	@Override
	public void addNewReader() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBelongBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addReturnedBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBooksRating() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show2_8bookReaders() {
		// TODO Auto-generated method stub
		
	}

}
