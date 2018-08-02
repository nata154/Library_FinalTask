package by.htp.library.dao.impl;

import static by.htp.library.dao.util.MySqlPropertyManager.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.library.dao.BookDao;
import by.htp.library.dao.ReaderDao;
import by.htp.library.entity.Book;
import by.htp.library.entity.Reader;

public class ReaderDaoImpl implements ReaderDao {

	private static final String SELECT_BOOK_BYID = "SELECT * FROM book WHERE id_book = ?";
	// private static final String SELECT_ALL_BOOK = "SELECT * FROM book ";
	private static final String SELECT_ALL_BOOK = "SELECT id_book,title,name,surname,birsdate FROM book, authors WHERE author=authors.id_author";
	private static final String INSERT_BOOK = "INSERT INTO book(title, author) VALUES (?, ?)";
	private static final String DELETE_BOOK = "DELETE FROM book WHERE title = ? AND author = ?";
	private static final String UPDATE_BOOK = "UPDATE book SET title = ?, author = ? WHERE id_book = ?";

	


	@Override
	public void autorizeReader(Reader reader) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the login");
		int libraryTicketNumber = scanner.nextInt();
		System.out.println("Enter the password");
		String readerPassword = scanner.nextLine();
	}

	@Override
	public void showMainReaderMenu() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose menu-item.");
		System.out.println("1 Get book list");
		System.out.println("2 Get book information");
		System.out.println("3 Exit");

		int menuItem = scanner.nextInt();

		switch (menuItem) {
		case 1:
			getBookList();
			break;
		case 2:
			getBookInformation();
			break;
		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong number.");
			System.out.println("Enter number again.");
			showMainReaderMenu();
		}
	}

	public void getBookList() {
		List<Book> listAllBooks = new ArrayList<>();
		for (Book bookToRead : listAllBooks) {
			System.out.println(bookToRead);
		}

	}

	private void getBookInformation() {
		// TODO Auto-generated method stu

	}

	@Override
	public void showOverdueBooks(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book read(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
