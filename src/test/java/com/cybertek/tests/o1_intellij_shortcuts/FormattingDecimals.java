package com.cybertek.tests.o1_intellij_shortcuts;

import java.text.DecimalFormat;

public class FormattingDecimals {
public static void main(String[] args) {
	DecimalFormat format=new DecimalFormat("0.00");
	double b =23.1245233231213;
	System.out.println(b);
	// format (double): formats the decimals and returns string value
	
	String num1=format.format(b);
	
	System.out.println(num1); //23.12
	
	double c=45.56789;
	System.out.println(format.format(c)); 
	//45.57 ucuncu rakam 5'ten buyuk oldugu icin 45.57 olarak yuvarlama yapti
	// String oldugu icin format.format(c)+1 olarak yazarsak sonuc 45.571 olur
	
	c=Double.parseDouble(format.format(c));
	System.out.println(c); 
	//45.57
	// c+1 olarak yazarsak sonuc 46.57 olur.
}
}
