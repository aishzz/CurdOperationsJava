package com.xworkz.interaction.bridge;

import com.xworkz.interaction.rules.BoyFriendRules;

public class GirlFriend implements BoyFriendRules{
	public String noMaleBestFriends() {
		System.out.println("noMaleBestFriends");
		return null;
		
	}
	public  String pickCallAtAnyCost() {
		System.out.println("pickCallAtAnyCost");
		return null;
		
	}
	public boolean turnOffDataWhileSleeping() {
		System.out.println("turnOffDataWhileSleeping");
		return false;
		
	}
	public boolean notToBeLate() {
		System.out.println("notToBeLate");
		return false;
		
	}
	public String boyFriendName() {
		System.out.println(" boyFriendName");
		return null;
		
	}
	
	
}