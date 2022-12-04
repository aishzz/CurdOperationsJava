package com.xworkz.interaction.follower;

import com.xworkz.interaction.rules.BankRules;

public class CanaraBank implements BankRules{
	
		@Override
		public boolean wearMask() {
			System.out.println("running wearmask method");
			return false;
		}

		@Override
		public double balance() {
			System.out.println("running balance method");
			return 0;
		}

	
}
