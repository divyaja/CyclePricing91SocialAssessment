package com.cycle.entity;

public class CycleHandle {
private int gears =CycleItemsPrice.GEARS;
private int breaks =CycleItemsPrice.BREAKS;

public int getBreaks() {
	return breaks;
}
public int getGears() {
	return gears;
}

public CycleHandle(int gears, int breaks) {
	super();
	this.gears = gears;
	this.breaks = breaks;
}
public CycleHandle() {
	// TODO Auto-generated constructor stub
}
public int getCycleHandlePrice(int noofgears) {
	
	return (noofgears * getGears()) + getBreaks();
}

}
