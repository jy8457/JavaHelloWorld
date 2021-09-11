package com.example.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruits List (Ordered by name)");
		Fruit s1=new Fruit(101,"Apple",1000);
		fl.add(s1);
		Fruit s2=new Fruit(102,"Orange",1500);
				fl.add(s2);
		Fruit s3=new Fruit(103,"Kiwi",2000);
				fl.add(s3);
		Fruit s4=new Fruit(104,"Avocado",2500);
				fl.add(s4);
		Fruit s5=new Fruit(105,"Grape",2700);
				fl.add(s5);
		Fruit s6=new Fruit(106,"Melon",3000);
				fl.add(s6);
		Fruit s7=new Fruit(107,"Watermelon",3500);
				fl.add(s7);
		Fruit s8=new Fruit(108,"Leech",2000);
				fl.add(s8);
		Fruit s9=new Fruit(109,"Banana",3000);
				fl.add(s9);
		Fruit s10=new Fruit(110,"Peach",2800);
				fl.add(s10);
				
				
		Collections.sort(fl,new FruitComparator());
		for(Fruit s: fl) {
			System.out.println(s.toString());
		}
		
		

	}

}