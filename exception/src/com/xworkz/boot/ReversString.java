package com.xworkz.boot;

public class ReversString {
public static void main(String[] args) {
String str="aish",nstr="";
char ch;
System.out.println("original word:");
System.out.println(str);
for(int i=0;i<str.length();i++) {
	ch= str.charAt(i);
	nstr=ch+nstr;
}
System.out.println("reverse word:"+nstr);
}
}