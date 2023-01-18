package com.xworkz.boot;
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import com.xworkz.streems.CakeDto;
public class CakeRunner {
		public static void main(String[] args) {
			
			CakeDto cakeDto1=new CakeDto("pastry", 5, "black", "cube");
			CakeDto cakeDto2=new CakeDto("pastry", 5, "black", "cube");

			Set<CakeDto> set=new LinkedHashSet<CakeDto>();
			set.add(cakeDto2);
			set.add(cakeDto1);
			
			for (CakeDto cakeDto : set) {
				System.out.println(cakeDto);
				System.out.println("old : "+cakeDto.hashCode());
				System.out.println("new : "+System.identityHashCode(cakeDto));
			}
			System.out.println(System.lineSeparator());
			//sort
			Set<String> set1=new TreeSet();
			set1.add("aishu");
			set1.add("krishna");
			set1.add("maaa");
			set1.add("chiru");
			set1.add("aishu");
			
			System.out.println(set1.size());
			for (String string : set1) {
				System.out.println(string);
			}
			System.out.println(System.lineSeparator());
			LinkedList<String> list=new LinkedList<String>();
			list.add("p");
			list.add("q");
			list.add("r");
			list.add("s");
			list.add("t");
			//listIterator interface child of Iterator
			ListIterator<String> listIterator=list.listIterator(2);//index backward approach
			while (listIterator.hasPrevious()) {
				String element = (String) listIterator.previous();
				System.out.println("backward approach : "+element);
			}
			ListIterator<String> listIterator1=list.listIterator(2);//index forward approach
			while (listIterator1.hasNext()) {
				String element1 = (String) listIterator1.next();
				System.out.println("forward approach : "+element1);
			}
		}
		

}
