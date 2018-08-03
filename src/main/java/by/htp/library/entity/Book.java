package by.htp.library.entity;

public class Book {
	private String title;
	private int idBook;
	private String autor;
	private int idAutor;

	public Book() {
		super();
	}

	public Book(String title, String autor) {
		super();
		this.title = title;
		this.autor = autor;
	}
	
	public Book(String title, int idBook, String autor, int idAutor) {
		super();
		this.title = title;
		this.idBook =idBook;
		this.autor = autor;
		this.idAutor = idAutor;
	}

	public String getTitle() {
		return title;
	}

	public String setTitle(String title) {
		return this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public String setAutor(String autor) {
		return this.autor = autor;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public int setIdAutor(int idAutor) {
		return this.idAutor = idAutor;
	}

	public int getIdBook() {
		return idBook;
	}

	public int setIdBook(int idBook) {
		return this.idBook = idBook;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", autor=" + autor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + idAutor;
		result = prime * result + idBook;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (idAutor != other.idAutor)
			return false;
		if (idBook != other.idBook)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}



	
}
