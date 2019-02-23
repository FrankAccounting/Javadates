package chapter4;

import java.math.BigDecimal;
import java.math.BigInteger;

public class population {
	public static void main (String[] args) {
		BigInteger wiscon = new BigInteger("5726398");
		BigInteger cali = new BigInteger("38041430");
		BigInteger tex = new BigInteger("26059203");

		BigInteger wXt = wiscon.multiply(cali);
		BigInteger copyXT = wXt.multiply(tex);
		
		double i = 3.23;
      
	      
		BigInteger copyXprice = copyXT;
		System.out.print(copyXprice + " Copies\n");
		BigInteger result = copyXprice.multiply(BigInteger.valueOf((long) i));
		System.out.print(result +"  Total cost");
	}


}

