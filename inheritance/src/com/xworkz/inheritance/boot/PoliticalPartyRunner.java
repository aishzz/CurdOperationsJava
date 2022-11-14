package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Bjp;
import com.xworkz.inheritance.thing.PoliticalParty;

public class PoliticalPartyRunner {


		public static void main(String[] args) {
			
			PoliticalParty party=new PoliticalParty("BJP",24000d);
			PoliticalParty bjp=new Bjp("Basavaraj Bommai");

				
				party.display();
			
				System.out.println(System.lineSeparator());
				bjp.display();
				}

}
