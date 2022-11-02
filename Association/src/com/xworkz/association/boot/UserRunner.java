package com.xworkz.association.boot;

import com.xworkz.association.Wedges;

public class UserRunner {

	public static void main(String[] args) {
		
		System.out.println(Wedges.getType);
		Wedges wedgesUser= new Wedges();
		System.out.println(Wedges.getType);
		wedgesUser.useWedges(wedgesUser);
		wedgesUser.gettype();

			}

	}

