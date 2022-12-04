package com.xworkz.interaction.follower;

import com.xworkz.interaction.rules.LibraryRules;

public class Readers implements LibraryRules {

		@Override
		public boolean reading() {
			System.out.println("running reading method");
			return false;
		}

		@Override
		public boolean wearMask() {
			System.out.println("running wearMask method");
			return false;
		}

}
