package com.xworkz.boot;

import com.xworkz.Encapsulation.thing.Jail;
import com.xworkz.boot.child.Centraljail;
import com.xworkz.boot.child.SubJail;
import com.xworkz.boot.child.WomenJail;


public class JailRunner {


	public static void main(String[] args) {
	
						Object obj = new Jail();
						Jail jail = (Jail)obj;
						System.out.println(jail.name);
						System.out.println(jail.type);
						
						System.out.println(System.lineSeparator());
						
						Jail jail1 = new Centraljail();
						Centraljail centraljail= (Centraljail)jail;
						System.out.println(jail.type);
						System.out.println(jail.name);
						
						
						System.out.println(System.lineSeparator());
					
						Jail jail2 = new SubJail();
						SubJail subJail= (SubJail)jail;
						System.out.println(jail.type);
						System.out.println(jail.name);
						
						System.out.println(System.lineSeparator());
						
						Jail jail3 = new WomenJail();
						WomenJail womenJail= (WomenJail)jail;
						System.out.println(jail.type);
						System.out.println(jail.name);
						
						System.out.println(System.lineSeparator());
					

	}

}
