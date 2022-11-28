package com.xworkz.programs;

public class StringMethods {
	
		public static void main(String[] args) {

String ref1 = "Working On String";
System.out.println(ref1);
ref1 = ref1 + " STRING";
String ref2 = ref1.concat(",Immutable");
System.out.println(ref2);

int custom = ref1.indexOf(2);//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index//
System.out.println(custom);

			String content = ref1.intern();
			System.out.println(content);
			System.out.println(System.lineSeparator());
			//-----------------------------------------------//
			boolean ref31 = ref1.isEmpty();
			System.out.println(ref31);
			//------------------------------------------------------//
			
			int ref41 = ref1.lastIndexOf(2);
			System.out.println(ref41);
			System.out.println(System.lineSeparator());
                          //--------------------------------------------------------------//
			boolean ref51 = ref1.contains("INSTITUTE IS IN RAJAJINAGAR");
			System.out.println(ref51);
			System.out.println(System.lineSeparator());
                        //-----------------------------------------------------------------//
			boolean ref61 = ref1.contentEquals("WELCOM TO XWORKZ");
			System.out.println(ref61);
			System.out.println(System.lineSeparator());
			//------------------------------------------//
			int ref71 = ref1.codePointAt(1);
			System.out.println(ref71);
			System.out.println(System.lineSeparator());
//--------------------------------------------------------------//
			int ref81 = ref1.codePointBefore(1);
			System.out.println(ref81);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			int ref91 = ref1.codePointCount(14, 16);
			System.out.println(ref91);
			System.out.println(System.lineSeparator());
//-----------------------------------//
			int ref12 = ref21.compareTo(ref1);
			System.out.println(ref12);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			boolean ref22 = ref1.contains("LEARNING JAVA");
			System.out.println(ref22);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			boolean ref23 = ref1.contentEquals("LEARINING HTML ");
			System.out.println(ref23);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			boolean ref24 = ref1.endsWith("J");
			System.out.println(ref24);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			int ref25 = ref1.hashCode();
			System.out.println(ref25);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			char ref26 = ref1.charAt(1);
			System.out.println(ref26);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			boolean ref27 = ref1.matches(" WELCOM TO XWORKZ");
			System.out.println(ref27);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			String ref28 = ref1.replace('L', 'A');
			System.out.println(ref28);
			System.out.println(System.lineSeparator());
		
			//-----------------------------------//
			
			int ref29 = ref1.length();
			
			System.out.println(ref29);
			String ref311 = ref1.replace("KRISHNA", "LOKI");
			System.out.println(ref311);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			String ref32 = ref1.replaceAll("CSS", "LOKI");
			System.out.println(ref32); //Returns a string resulting from replacing all occurrences of oldChar in this string with newChar//
		        System.out.println(modedifedString);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			boolean ref33 = ref1.startsWith("CS");
			System.out.println(ref33);
			System.out.println(System.lineSeparator());
			//-----------------------------------//
			
			boolean ref34 = ref1.startsWith("CSS", 0);
			System.out.println(ref34);
			
			//-----------------------------------//
			
			char[] ref35 = ref1.toCharArray();
			System.out.println(ref35);
			System.out.println(System.lineSeparator());

			//-----------------------------------//
			
			String ref36 = ref1.toLowerCase();
			System.out.println(ref36);
			System.out.println(System.lineSeparator());

		}
	}
