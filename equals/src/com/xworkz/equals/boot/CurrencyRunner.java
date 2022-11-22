package com.xworkz.equals.boot;

import com.xworkz.equals.Currency;

public class CurrencyRunner {

		public static void main(String[] args) {
			Currency currancy=new Currency();
			currancy.setAcceptableCountries("all countries");
			currancy.setCode('D');
			currancy.setConvertingPrice(82.5);
			currancy.setCountryName("USA");
			currancy.setMakingCost(10.2);
			currancy.setMaterial("papers");
			currancy.setStrong(true);
			currancy.setTotalCurrancy(6);
			currancy.setType("international");
			currancy.setValidity(100);
			
			System.out.println(currancy);
			Currency Currency2=new Currency("local", 20, 'R', 12, false, "india", 90, "paper", 120, "only few");
			System.out.println(Currency2);
			boolean ref=currancy.equals(Currency2);
			System.out.println(ref);
			

	}

}
