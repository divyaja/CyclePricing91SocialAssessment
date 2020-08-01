package com.cycle.price.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.cycle.price.implementation.CyclePricingImplementation;


public class CyclePrice {
	static int frameType = 0;
	static int isTubless = 0;
	static int gears =0;

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		CyclePricingImplementation cyclePriceObj = new CyclePricingImplementation();
		Scanner sc = new Scanner(System.in);
		int iter = 0;
		for (; iter < 2; iter++) {
			System.out.println("Please select CycleFrameType. Choose 0 for STEEL and 1 for Aluminum : ");
			frameType = sc.nextInt();
			if (frameType != 0 && frameType != 1) {
				System.out.println("Please select a valid frame type");
				continue;
			}
			else {
				break;
			}
		}
		if (iter == 2) {
			System.out.println("You have exceeded maximum number of atempts. Please re-run! Thank you");
			System.exit(0);
		}

		System.out.println("Please select number of gears required :");
		String gear = sc.nextLine();
		try {
			gears = Integer.parseInt(gear); 
		}
		catch (NumberFormatException e)  
        { 
            System.out.println(gear + " is not a valid integer number. Please re-run! Thank you"); 
            System.exit(0);
        } 
		
		
		int t = 0;
		for (; t < 2;t++) {
			System.out.println("Please select 0 for tubless and 1 for tube tyre :");
			int isTubless = sc.nextInt();
			if (isTubless != 0 && isTubless != 1) {
				System.out.println("Please select a valid tube type");
				continue;
			}
			else {
				break;
			}
		}
		if (t == 2) {
			System.out.println("You have exceeded maximum number of atempts. Please re-run! Thank you");
			System.exit(0);
		}
		int totalCyclePrice = cyclePriceObj.getCyclePrice(frameType, gears, isTubless);
		System.out.println("Total Cycle Price: "+totalCyclePrice);
	}

}
