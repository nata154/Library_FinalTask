package by.htp.library.librarian;

public class Librarian {

	private String surnameLib;
	private int idLibrarian;

	public Librarian() {
		super();
	}

	public Librarian(int idLibrarian) {
		this.idLibrarian = idLibrarian;
	}
	
	public Librarian(int idLibrarian, String surnameLib) {
		this(idLibrarian);
		this.surnameLib = surnameLib;
	}

	public String getSurnameLib() {
		return surnameLib;
	}

	public void setSurnameLib(String surnameLib) {
		this.surnameLib = surnameLib;
	}

	public int getIdLibrarian() {
		return idLibrarian;
	}

	public void setIdLibrarian(int idLibrarian) {
		this.idLibrarian = idLibrarian;
	}

	@Override
	public String toString() {
		return "Librarian [id=" + idLibrarian + ", surname=" + surnameLib + "]";
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
