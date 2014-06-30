/*
 * Factory design pattern is used to create objects or Class in Java and it provides loose coupling and high 
 * cohesion. Factory pattern encapsulate object creation logic which makes it easy to change it later when you 
 * change how object gets created or you can even introduce new object with just change in one class. In GOF 
 * pattern list Factory pattern is listed as Creation design pattern. Factory should be an interface and clients 
 * first either creates factory or get factory which later used to create objects.
 * 
 * When to use:
 * -> Static Factory methods are common in frameworks where library code needs to create objects of types which 
 *    may be sub classed by applications using the framework. 
 * -> Some or all concrete products can be created in multiple ways, or we want to leave open the option that in 
 *    the future there may be new ways to create the concrete product.
 * -> Factory method is used when Products don't need to know how they are created.
 * -> We  can use factory pattern where we have to create an object of any one of sub-classes depending on the 
 *    data provided
 *    
 * Another benefit of using Factory design pattern in Java is that it encourages consistency in Code since every 
 * time object is created using Factory rather than using different constructor at different client side.
 */
public class CurrencyFactory {

	public static Currency createCurrency(String country) {
		
		if (country.equalsIgnoreCase("India")) {
			return new Rupee();
		} else if (country.equalsIgnoreCase("Singapore")) {
			return new SGDDollar();
		} else if (country.equalsIgnoreCase("US")) {
			return new USDollar();
		}
		
		throw new IllegalArgumentException("No such currency");
	}
	
}
