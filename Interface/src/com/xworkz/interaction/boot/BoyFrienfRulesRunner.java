package com.xworkz.interaction.boot;

import com.xworkz.interaction.bridge.GirlFriend;
import com.xworkz.interaction.rules.BoyFriendRules;

public class BoyFrienfRulesRunner {

	public static void main(String[] args) 
	{
		
		GirlFriend ref = new GirlFriend();
		ref.noMaleBestFriends();
		ref.pickCallAtAnyCost();
		ref. turnOffDataWhileSleeping();
		ref.notToBeLate();
		ref.boyFriendName();
		System.out.println("___________________________________");
		BoyFriendRules ref1= new GirlFriend();
		ref1.noMaleBestFriends();
		ref1.pickCallAtAnyCost();
		ref1.turnOffDataWhileSleeping();
		ref1.notToBeLate();
		ref1.boyFriendName();
}
}