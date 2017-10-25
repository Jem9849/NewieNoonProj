package newie.controller;

import java.util.List;
import java.util.ArrayList;


public class NewieController
{
	//private ArrayList<String> myRats;
	private String[] rats = { "", "", "", "Austrailian Swamp Rat", "Bulldog Rat"};
	//private ArrayList<Integer> myCount;
	private int[] count;
	
	public NewieController()
	{
		//rats = new String [5];
		count = new int [10];
	}
	
	public void start()
	{
		/*
		System.out.println(myRats);
		System.out.println(myCount);
		System.out.println("TACO TUESDAY!");
		System.out.println("RAWR");
		System.out.println("TUACAN");
		System.out.println("BIRDS");
		System.out.println("Squirells");
		System.out.println("RACOONS");
		System.out.println("TRASH HAT");
		System.out.println("NIAGRA FALLS");
		*/
		
		rats[0] = "Capybara";
		rats[1] = "Guinea Pig";
		rats[2] = "Ricefield Rat";
		
		
		for (String current : rats)
		{
			System.out.println(current);
		}
		
		for (int index = 0; index < count.length; index+= 1)
		{
			count[index] = index + 1;
			
			System.out.println(count[index]);
		}
		
		//rats = new String [] {"one", "two", "three", "four", "five"};
		}
		
		//myRats = new ArrayList<String>();
		
		//myCount = new ArrayList<Integer>();
		
		
	}
}
