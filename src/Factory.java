/*
 * Whenever we create object using new() we violate principle of programming for interface rather than 
 * implementation which eventually result in inflexible code and difficult to change in maintenance. By 
 * using Factory design pattern in Java we get rid of this problem.
 * 
 * Another problem we can face is class needs to contain objects of other classes or class hierarchies 
 * within it; this can be very easily achieved by just using the new keyword and the class constructor. 
 * The problem with this approach is that it is a very hard coded approach to create objects as this creates 
 * dependency between the two classes.
 * 
 * So factory pattern solve this problem very easily by model an interface for creating an object which at 
 * creation time can let its subclasses decide which class to instantiate, Factory Pattern promotes loose 
 * coupling by eliminating the need to bind application-specific classes into the code. The factory methods 
 * are typically implemented as virtual methods, so this pattern is also referred to as the “Virtual Constructor”. 
 * These methods create the objects of the products or target classes.
 * 
 * Advantages of Factory Method:
 * -> Enables the subclasses to provide extended version of an object, because creating an object inside factory 
 *    is more flexible than creating an object directly in the client. Since client is working on interface level 
 *    any time you can enhance the implementation and return from Factory.
 * -> Java encourages consistency in Code since every time object is created using Factory rather than using 
 *    different constructor at different client side.
 * -> Code written using Factory design pattern in Java is also easy to debug and troubleshoot because you have 
 *    a centralized method for object creation and every client is getting object from same place.
 * -> DBC is a good example for this pattern; application code doesn't need to know what database it will be used 
 *    with, so it doesn't know what database-specific driver classes it should use. Instead, it uses factory methods 
 *    to get Connections, Statements, and other objects to work with. Which gives you flexibility to change your 
 *    back-end database without changing your DAO layer in case you are using ANSI SQL features and not coded on 
 *    DBMS specific feature
 */
public class Factory {
	
	public static void main(String args[]) {
		
		// Creating any country name
		String country = "India";
		
		// CurrecyFactory will produce a new Currency object based on given country name
		Currency rupee = CurrencyFactory.createCurrency(country);
		
		// Printing symbol
		System.out.println(rupee.getSymbol());
		
	}
	
}
