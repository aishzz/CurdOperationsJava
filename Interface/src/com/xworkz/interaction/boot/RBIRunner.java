package com.xworkz.interaction.boot;

import com.xworkz.interaction.Governer.RBI;
import com.xworkz.interaction.follower.CanaraBank;
import com.xworkz.interaction.rules.BankRules;

public class RBIRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BankRules bankRules = new CanaraBank();
				RBI RBI = new RBI(bankRules);
				RBI.checking();
	}

}
