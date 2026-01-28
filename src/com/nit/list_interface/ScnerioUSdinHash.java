package com.nit.list_interface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ScnerioUSdinHash {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Set<String> bookTitles = new HashSet<>();
		
		Map<Integer,String> bookMap = new HashMap<>();
		
		while(true)
		{
			IO.println("\n-----Library Menu-----");
			IO.println("1. Add Book");
			IO.println("2. View All Books");
			IO.println("3. Remove Book");
			IO.println("4. Exit");
			IO.println("Enter Choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Book Id: ");
				int id = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter book title: ");
				String title = sc.nextLine();
				
				if(bookTitles.add(title))
				{
					bookMap.put(id, title);
					IO.println("Book added successfully!!!");
				}
				else
				{
					IO.println("Dupilicate book title not allowed");
				}
				break;
			case 2:
				if(bookMap.isEmpty()) 
				{
					IO.println("Library is empty");
				}
				else
				{
					IO.println("Book in library");
					for(Map.Entry<Integer,String> entry : bookMap.entrySet())
					{
						IO.println(entry.getKey() + "->"+ entry.getValue());
					}
				}
				break;
			}
		}
		
	}

}
