package com.cycle.entity;

public class CycleFrame {
	private int steelFrame = CycleItemsPrice.STEELFRAME;
	private int aluminumFrame = CycleItemsPrice.ALUMINUMFRAME;

	public int getSteelFrame() {
		return steelFrame;
	}

	public int getAluminumFrame() {
		return aluminumFrame;
	}

	public int getCycleFramePrice(int type) {
		// 0- steel, 1- aluminum
		if (type == 0) {
			return getSteelFrame();
		} else if (type == 1) {
			return getAluminumFrame();
		}
		return 0;
	}

}
