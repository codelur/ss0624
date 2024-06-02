1. Project's Title:
          Reposiroty created for  Programming Demonstration
          Cardinal Tool Rental App

3. Project Description:
         The demonstration is to code and test a simple tool rental application.

4. Project Requirements:
         ● The application is a point-of-sale tool for a store, like Home Depot, that rents big tools.
         ● Customers rent a tool for a specified number of days.
         ● When a customer checks out a tool, a Rental Agreement is produced.
         ● The store charges a daily rental fee, whose amount is different for each tool type.
         ● Some tools are free of charge on weekends or holidays.
         ● Clerks may give customers a discount that is applied to the total daily charges to reduce the final charge.

5. Project Components:
        Available Tools : Chainsaw, Ladder, Jackhammer
        Brands: 
            Chainsaw -> Stihl
            Ladder -> Werner
            Jackhammer -> DeWalt, Ridgid
          
        Charges:
            Chainsaw ->   Daily Charge: $1.99
                          Weekday Charge: Yes
                          Weekend Charge: Yes
                          Holiday Charge: No
                      
            Ladder ->     Daily Charge: $1.49
                          Weekday Charge: Yes
                          Weekend Charge: No
                          Holiday Charge: Yes
                      
            Jackhammer -> Daily Charge: $2.99
                          Weekday Charge: Yes
                          Weekend Charge: No
                          Holiday Charge: No
        
         Holidays:  ● Independence Day, July 4th - If falls on weekend, it is observed on the closest weekday (if Sat, then Friday before, if Sunday, then Monday after)
                    ● Labor Day- First Monday in September
   
6. HOW TO USE:
     Download and run on Eclipse IDE if necessary.

7. Project modules:
      Located at src/main/java  
           com.cardinal.tools:
               Includes the classes for all the tools: Abstract class Tools and its children Chainsaw, Ladder and Jackhammer.
               Includes 2 enums to include the available tool in the rental app and the attributes of each Tool:
                       ToolCode: Includes the Tool Type and Brand for each Tool Code.
                       ToolCharges: Includes the daily charge value and the booleans for weekday, weekend and holiday charge.
  
           com.cardinal.checkout:
               Includes the classes required to create a RentalAgreement instance during on Checkout: Checkout and RentalAgreement
               RentalAgreement class includes a .toString() method to print its attributes.
  
           com.cardinal.rental:
               Irrelevant. It'd be used to run the app if necessary.

  9. Project JUnit Tests:
       Located at src/test/java
           com.cardinal.rental
               CheckOutTests:
                 Test 1: testJackhammerInvalidPercentage()
                      //Jackhammer - 9/3/15 - 5 days - 101%
     
                 Test 2: testLadderCharge3Days10PercentIndependenceDay()
                      //Ladder - 7/2/20 - 3 days - 10%
     
                 Test 3: testChainsawCharge5Days25PercentIndependenceDay()
                      //Chainsaw - 7/2/15 - 5 days - 25%
     
                 Test 4: testJackhammerCharge6DaysNoPercentLaborDay()
                      //Jackhammer - 9/3/15 - 6 days - 0%
     
                 Test 5: testJackhammerCharge9DaysNoPercentIndependenceDay()
                      //Jackhammer - 7/2/15 - 9 days - 0%
     
                 Test 6: testJackhammerCharge4Days50PercentIndependenceDay()
                      //Jackhammer - 7/2/20 - 4 days - 50%
