package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Invitation;

public class InvitationRunner {
	
		public static void main(String[] args) {
			Invitation invitation = new Invitation();
			System.out.println(System.lineSeparator());
			Invitation invitation2 = new Invitation(null, 0, 0);
			System.out.println(System.lineSeparator());

			Invitation invitation3 = new MarriageInvitation();
			System.out.println(System.lineSeparator());

			Invitation invitation4 = new MarriageInvitation("MarriageInvitation", 6788, 7000, "Invitaion", 7000,
					"Bangalore");
		}
	

}
