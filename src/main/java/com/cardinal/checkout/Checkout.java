package com.cardinal.checkout;

import java.time.LocalDate;

import com.cardinal.tools.*;

public class Checkout {
	public RentalAgreement checkout(ToolCode toolCode, LocalDate checkOutDate, int rentalDayCount, int discountPercent) 
			throws  IllegalArgumentException{
		
		Tool rentalTool;
		RentalAgreement rentalAgreement;
		
		if(rentalDayCount<1)
			throw new IllegalArgumentException("ERROR: Rental days is "+rentalDayCount+". It must be 1 or greater.\n");
		
		if(discountPercent<0 || discountPercent>100)
			throw new IllegalArgumentException("ERROR: Discount percentage is "+discountPercent+". It must be between 0 and 100.\n");
			
		switch(toolCode) {
			case CHNS: 
				rentalTool = new Chainsaw(toolCode);
				break;
			case LADW:
				rentalTool = new Ladder(toolCode);
				break;
			case JAKD:
			case JAKR:
				rentalTool = new Jackhammer(toolCode);
				break;
			default:
				throw new IllegalArgumentException("ERROR: Invalid Tool code.\n");
		}
		
		rentalAgreement = new RentalAgreement(rentalTool, checkOutDate,rentalDayCount, discountPercent);
		
		//print the values of the rental agreement once it is created for reference
		System.out.println(rentalAgreement.toString());
		
		return 	rentalAgreement;

	}
}
