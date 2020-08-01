package com.cycle.price.implementation;

import com.cycle.entity.CycleChain;
import com.cycle.entity.CycleFrame;
import com.cycle.entity.CycleHandle;
import com.cycle.entity.CycleSeating;
import com.cycle.entity.CycleWheels;

public class CyclePricingImplementation {
	public CycleFrame frame;
	public CycleHandle handle;
	public CycleSeating seating;
	public CycleWheels wheels;
	public CycleChain chain;

	public int getCyclePrice(int frameType, int gears, int isTubless) {
		System.out.println("Frame Price :" + frame.getCycleFramePrice(frameType));
		System.out.println("Handle Price :" + handle.getCycleHandlePrice(gears));
		System.out.println("Seating Price :" + seating.getCycleSeatPrice());
		System.out.println("Wheels Price :" + wheels.getCycleWheelsPrice(isTubless));
		System.out.println("Chain Price :" + chain.getCycleChainPrice());

		return frame.getCycleFramePrice(frameType) + handle.getCycleHandlePrice(gears) + seating.getCycleSeatPrice()
				+ wheels.getCycleWheelsPrice(isTubless) + chain.getCycleChainPrice();
	}

	public CyclePricingImplementation() {
		super();
		this.frame = new CycleFrame();
		this.handle = new CycleHandle();
		this.seating = new CycleSeating();
		this.wheels = new CycleWheels();
		this.chain = new CycleChain();
	}
}