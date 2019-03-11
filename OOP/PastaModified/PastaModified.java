package oop.PastaModified;

public class PastaModified {
	// Private properties
	private int price;
	private String type;
	private PastaType pastype;

	// Constructs a Pasta object with a price and a type
	public PastaModified(PastaType type) {
		pastype = type;
	}

	// Gets the price of the pasta
	public int price() {
		return pastype.price();
	}

	// Gets the type of the pasta
	public String type() {
		return pastype.toString();
	}
}