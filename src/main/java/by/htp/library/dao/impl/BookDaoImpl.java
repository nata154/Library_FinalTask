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
import by.htp.library.entity.Book;
import by.htp.library.entity.Reader;

public class BookDaoImpl implements BookDao {

	private static final String SELECT_BOOK_BYID = "SELECT * FROM book WHERE id_book = ?";
	// private static final String SELECT_ALL_BOOK = "SELECT * FROM book ";
	private static final String SELECT_ALL_BOOK = "SELECT id_book,title,name,surname,birsdate FROM book, authors WHERE author=authors.id_author";
	private static final String INSERT_BOOK = "INSERT INTO book(title, author) VALUES (?, ?)";
	private static final String DELETE_BOOK = "DELETE FROM book WHERE title = ? AND author = ?";
	private static final String UPDATE_BOOK = "UPDATE book SET title = ?, author = ? WHERE id_book = ?";
	
	Scanner scanner = new Scanner(System.in);

	@Override
	public Book getBookById(int id) {

		Book book = null;

		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(SELECT_BOOK_BYID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				book = buildBook(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public Book readBook(int id) {

		Book book = null;

		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(SELECT_BOOK_BYID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				book = buildBook(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

	private Book buildBook(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setTitle(rs.getString("title"));
		return book;
	}

	@Override
	public List<Book> list() {

		List<Book> listAllBooks = new ArrayList<>();

		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(SELECT_ALL_BOOK);
			while (result.next()) {
				int idBook = result.getInt("id_book");
				String title = result.getString("title");

				String Autor = result.getString("autor");
				int idAutor = result.getInt("id_autor");

				Book b = new Book();
				b.setIdAutor(idAutor);
				b.setAutor(Autor);
				b.setIdBook(idBook);
				b.setTitle(title);

				listAllBooks.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listAllBooks;
	}

	@Override
	public Book addNewBook() {
		Book book = new Book();
		
		String title = book.setTitle("Maygli");
		String Autor = book.setAutor("R. Kipling");
		int idAutor = book.getIdAutor();
		int idBook = book.getIdBook();

		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(INSERT_BOOK);
			ps.setString(1, title);
			ps.setString(2, Autor);
			ps.setInt(3, idAutor);
			ps.setInt(4, idBook);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}

//	@Override
//	public void deleteBookById(int id) { // ���-�� �� ��
//		Book book = new Book();
//		id = book.getIdBook();
//
//		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
//			PreparedStatement ps = conn.prepareStatement(DELETE_BOOK);
//			ps.setInt(1, id);
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public void updateBookOwner(Book book, Reader reader) {
		int idBook = book.getIdBook();
		String title = book.getTitle();
		int idAutor = book.getIdAutor();
		int idReader = reader.setIdReader(222);// Here might be Math.random

		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(UPDATE_BOOK);
			ps.setString(1, title);
			ps.setInt(2, idAutor);
			ps.setInt(3, idBook);
			ps.setInt(4, idReader);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addBooktoReader(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Book book) {
		String title = book.getTitle();
		int idAutor = book.getIdAutor();

		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(DELETE_BOOK);
			ps.setString(1, title);
			ps.setInt(2, idAutor);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBook(Book book) {
		System.out.println("Enter idBook");
		int idBook = book.setIdBook(scanner.nextInt());//FIND BY idBook
		String title = book.setTitle(scanner.next());
		int idAutor = book.setIdAutor(scanner.nextInt());


		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(UPDATE_BOOK);
			ps.setString(1, title);
			ps.setInt(2, idAutor);
			ps.setInt(3, idBook);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void getBookInformation() {
	}
}
