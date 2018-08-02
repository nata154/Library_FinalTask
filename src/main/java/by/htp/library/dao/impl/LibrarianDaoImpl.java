package by.htp.library.dao.impl;

import static by.htp.library.dao.util.MySqlPropertyManager.getLogin;
import static by.htp.library.dao.util.MySqlPropertyManager.getPass;
import static by.htp.library.dao.util.MySqlPropertyManager.getUrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.htp.library.dao.LibrarianDao;
import by.htp.library.entity.Book;

public class LibrarianDaoImpl implements LibrarianDao{
	
	@Override
	public void add(Book book) {
		String title = book.getTitle();
		int idAutor = book.getIdAutor();

		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(INSERT_BOOK);
			ps.setString(1, title);
			ps.setInt(2, idAutor);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Book book) {
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
	public void update(Book book) {
		int idBook = book.getIdBook();
		String title = book.getTitle();
		int idAutor = book.getIdAutor();

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

	private Book buildBook(ResultSet rs) throws SQLException {
		Book book = new Book();
		book.setTitle(rs.getString("title"));
		return book;
	}

}
