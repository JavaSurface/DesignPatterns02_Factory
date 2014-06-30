/*
 * Here we have made Currency as interface and all currency would be concrete implementation of Currency 
 * interface. Factory Class will create Currency based upon country and return concrete implementation which 
 * will be stored in interface type. This makes code dynamic and extensible.
 */
public interface Currency {
	String getSymbol();
}

//Concrete Rupee Class code
class Rupee implements Currency {
    @Override
    public String getSymbol() {
           return "RS";
    }
}

//Concrete SGD class Code
class SGDDollar implements Currency {
    @Override
    public String getSymbol() {
           return "SGD";
    }
}

//Concrete US Dollar code
class USDollar implements Currency {
    @Override
    public String getSymbol() {
           return "USD";
    }
}