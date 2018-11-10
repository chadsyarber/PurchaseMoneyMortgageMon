package model;

public class Property {
	private PropertyNames pName;
	private PropertyGroup pGroup;
	private int purchasePrice;
	private int mortgageValue;
	private int mortgagePayoffAmt;
	private int rentAmt;
	private int numHouses;
	private boolean hasHotel;
	private int houseCost;
	
	public Property(PropertyNames pName, PropertyGroup pGroup, int purchasePrice, int mortgageValue,
			int mortgagePayoffAmt, int rentAmt, int numHouses, boolean hasHotel, int houseCost) {
		super();
		this.pName = pName;
		this.pGroup = pGroup;
		this.purchasePrice = purchasePrice;
		this.mortgageValue = mortgageValue;
		this.mortgagePayoffAmt = mortgagePayoffAmt;
		this.rentAmt = rentAmt;
		this.numHouses = numHouses;
		this.hasHotel = hasHotel;
		this.houseCost = houseCost;
	}

	public PropertyGroup getGroup() {
		return pGroup;
	}

	public void setGroup(PropertyGroup pGroup) {
		this.pGroup = pGroup;
	}

	public int getNumHouses() {
		return numHouses;
	}

	public void setNumHouses(int numHouses) {
		this.numHouses = numHouses;
	}

	public boolean HasHotel() {
		return hasHotel;
	}

	public void HasHotel(boolean hasHotel) {
		this.hasHotel = hasHotel;
	}

	public int getPurchasePrice() {
		return purchasePrice;
	}	
	
}
