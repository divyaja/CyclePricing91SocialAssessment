package com.cycle.entity;

public class CycleWheels {
	private int spokes = CycleItemsPrice.SPOKES;
	private int rim = CycleItemsPrice.RIM;
	private int tubePrice = CycleItemsPrice.TUBE_PRICE;
	private int tubeLessPrice = CycleItemsPrice.TUBELESS_PRICE;

	public int getTubeLessPrice() {
		return tubeLessPrice;
	}

	public int getSpokes() {
		return spokes;
	}

	public int getRim() {
		return rim;
	}

	public int getTubePrice() {
		return tubePrice;
	}

	public int getCycleWheelsPrice(final int isTubless) {
		int tubeprice = 0;
		if (isTubless == 0) {
			tubeprice = getTubePrice();
		} else if (isTubless == 1) {
			tubeprice = getTubeLessPrice();

		}
		return getRim() + getSpokes() + tubeprice;
	}

}
