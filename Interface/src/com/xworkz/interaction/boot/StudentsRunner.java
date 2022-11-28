package com.xworkz.interaction.boot;
import com.xworkz.interaction.bridge.Vinoda;

import com.xworkz.interaction.rules.Students;

public class StudentsRunner {
	public static void main(String[] args) 
	{
		
		Vinoda ref = new Vinoda();
		ref.completingTask();
		ref.name();
		ref.presentations();
		ref.attendance();
		ref.notToArguee();
		
		System.out.println("-----------------------------------------");
		
		Students ref1= new Vinoda();
		ref1.completingTask();
		ref1.name();
		ref1.presentations();
		ref1.attendance();
		ref1.notToArguee();
}

}
