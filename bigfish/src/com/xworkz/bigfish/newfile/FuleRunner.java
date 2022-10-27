package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.constant.Fule;
import com.xworkz.bigfish.boot.constant.Type;

public class FuleRunner {

	private static Type PETROL;

	public static void main(String[] args) {
		
				  Fule fuel = new Fule(true, 1, 2,"fule", PETROL);
				 fuel.showOff();
			}

		}

