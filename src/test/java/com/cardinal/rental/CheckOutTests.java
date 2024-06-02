package com.cardinal.rental;
import com.cardinal.checkout.*;
import com.cardinal.tools.ToolCode;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CheckOutTests {

	@Test
	@DisplayName("Test 1. Throw Invalid Percentage Exception.")
	void testJackhammerInvalidPercentage() {
		Checkout checkout = new Checkout();
		//Jackhammer - 9/3/15 - 5 days - 101%
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> checkout.checkout(ToolCode.JAKR, LocalDate.of(2015, Month.SEPTEMBER, 3), 5, 101));
		System.out.println(exception.getMessage());

	}
	
	@Test
	@DisplayName("Test 2. Ladder Charge 2 days 10%")
	void testLadderCharge3Days10PercentIndependenceDay() {
		Checkout checkout = new Checkout();
		//Ladder - 7/2/20 - 3 days - 10%
		RentalAgreement rentalAgreement = checkout.checkout(ToolCode.LADW, LocalDate.of(2020, Month.JULY, 2), 3, 10);
		assertEquals(BigDecimal.valueOf(3.58),rentalAgreement.getFinalCharge());
	}
	
	@Test
	@DisplayName("Test 3. Chainsaw Charge 3 days 25%")
	void testChainsawCharge5Days25PercentIndependenceDay() {
		Checkout checkout = new Checkout();
		//Chainsaw - 7/2/15 - 5 days - 25%
		RentalAgreement rentalAgreement = checkout.checkout(ToolCode.CHNS, LocalDate.of(2015, Month.JULY, 2), 5, 25);
		assertEquals(BigDecimal.valueOf(3.35),rentalAgreement.getFinalCharge());
	}

	@Test
	@DisplayName("Test 4. Jackhammer Charge 3 days 0%")
	void testJackhammerCharge6DaysNoPercentLaborDay() {
		Checkout checkout = new Checkout();
		//Jackhammer - 9/3/15 - 6 days - 0%
		RentalAgreement rentalAgreement = checkout.checkout(ToolCode.JAKD, LocalDate.of(2015, Month.SEPTEMBER, 3), 6, 0);
		assertEquals(BigDecimal.valueOf(8.97),rentalAgreement.getFinalCharge());
	}
	
	@Test
	@DisplayName("Test 5. Jackhammer Charge 6 days 0%")
	void testJackhammerCharge9DaysNoPercentIndependenceDay() {
		Checkout checkout = new Checkout();
		//Jackhammer - 7/2/15 - 9 days - 0%
		RentalAgreement rentalAgreement = checkout.checkout(ToolCode.JAKR, LocalDate.of(2015, Month.JULY, 2), 9, 0);
		assertEquals(BigDecimal.valueOf(17.94),rentalAgreement.getFinalCharge());
	}
	
	@Test
	@DisplayName("Test 6. Jackhammer Charge 1 day 50%")
	void testJackhammerCharge4Days50PercentIndependenceDay() {
		Checkout checkout = new Checkout();
		//Jackhammer - 7/2/20 - 4 days - 50%
		RentalAgreement rentalAgreement = checkout.checkout(ToolCode.JAKR, LocalDate.of(2020, Month.JULY, 2), 4, 50);
		assertEquals(BigDecimal.valueOf(1.49),rentalAgreement.getFinalCharge());
	}
}
