package model;

public class PropertyGroup {

	private ColorGroup color;
	private int amtInGroup;
	private boolean isBuildable;
	private boolean isMonopoly;
	
	

	public PropertyGroup(ColorGroup color, int amtInGroup, boolean isBuildable) {
		super();
		this.color = color;
		this.amtInGroup = amtInGroup;
		this.isBuildable = isBuildable;
	}

	public ColorGroup getColor() {
		return color;
	}

	public void setColor(ColorGroup color) {
		this.color = color;
	}

	public int getAmtInGroup() {
		return amtInGroup;
	}

	public void setAmtInGroup(int amtInGroup) {
		this.amtInGroup = amtInGroup;
	}

	public boolean isBuildable() {
		return isBuildable;
	}

	public void setBuildable(boolean isBuildable) {
		this.isBuildable = isBuildable;
	}
	
	public boolean isMonopoly() {
		return isMonopoly;
	}

	public void setMonopoly(boolean isMonopoly) {
		this.isMonopoly = isMonopoly;
	}
	
}
