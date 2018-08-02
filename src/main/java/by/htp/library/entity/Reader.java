package by.htp.library.entity;

public class Reader {
	
	private String surname;
	private int idReader;

	public Reader() {
		super();
	}

	public Reader(int idReader) {
		this.idReader = idReader;
	}
	
	public Reader(int idReader, String surname) {
		this(idReader);
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getIdReader() {
		return idReader;
	}

	public void setIdReader(int idReader) {
		this.idReader = idReader;
	}

	@Override
	public String toString() {
		return "Reader [id=" + idReader + ", surname=" + surname + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
