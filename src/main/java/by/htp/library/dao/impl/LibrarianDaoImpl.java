package by.htp.library.dao.impl;

import java.util.Scanner;

import by.htp.library.dao.LibrarianDao;

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
		// TODO Auto-generated method stub
	}

	@Override
	public void showOverdueBookReaders() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setReturnedBook() {
		// TODO Auto-generated method stub
	}

}
