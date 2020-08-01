package com.cycle.entity;

public class CycleSeating {
 private int seatPrice = CycleItemsPrice.SEAT;


public int getSeatPrice() {
	return seatPrice;
}

public int getCycleSeatPrice() {
	return getSeatPrice();
}
}
