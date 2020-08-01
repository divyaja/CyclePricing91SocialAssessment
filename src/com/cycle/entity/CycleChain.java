package com.cycle.entity;

public class CycleChain {
	private int chain = CycleItemsPrice.CHAIN;

	public int getChain() {
		return chain;
	}
	public int getCycleChainPrice() {
		return getChain();
	}
}
