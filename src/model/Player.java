package model;

import java.util.ArrayList;

public class Player {

	private String mName;
	private int mMoney;
	private Pieces mPiece;
	private ArrayList<Property> mProperties;

	public Player(String mName, int mMoney, Pieces mPiece, ArrayList<Property> mProperties) {
		super();
		this.mName = mName;
		this.mMoney = mMoney;
		this.mPiece = mPiece;
		this.mProperties = mProperties;
	}

	// Public Methods

	public void buyNewProperty(Property prop) {
		if (enoughMoney(prop.getPurchasePrice())) {
			mProperties.add(prop);
		}
	}

	// Private Mehtods
	private boolean enoughMoney(int cost) {
		return mMoney < cost;

	}

	private void checkMonopolyStatus(Property prop) {
		int numOfGroup = 0;
		for (int i = 0; i < mProperties.size(); i++) {
			if (prop.getGroup().getColor() == mProperties.get(i).getGroup().getColor()) {
				numOfGroup++;

			}
			if (numOfGroup == 2) {
				switch (prop.getGroup().getColor()) {
				case BROWN:
				case UTIL:
				case BLUE:
					mProperties.get(i).getGroup().setMonopoly(true);
					break;
				}
			}
			if (numOfGroup == 3) {
				switch (prop.getGroup().getColor()) {
				case LIGHTBLUE:
				case PURPLE:
				case GREEN:
				case ORANGE:
				case RED:
				case YELLOW:
					mProperties.get(i).getGroup().setMonopoly(true);
				}
			}

		}

	}

	// Gets and sets
	public String getName() {
		return mName;
	}

	public void setName(String mName) {
		this.mName = mName;
	}

	public int getMoney() {
		return mMoney;
	}

	public void setMoney(int mMoney) {
		this.mMoney = mMoney;
	}

	public Pieces getPiece() {
		return mPiece;
	}

	public void setPiece(Pieces mPiece) {
		this.mPiece = mPiece;
	}

	public ArrayList<Property> getmProperties() {
		return mProperties;
	}

	public void setmProperties(ArrayList<Property> mProperties) {
		this.mProperties = mProperties;
	}

}
