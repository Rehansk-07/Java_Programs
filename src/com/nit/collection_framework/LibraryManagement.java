package com.nit.collection_framework;

import java.util.Iterator;
import java.util.Vector;

record Book(Integer id, String title, String author) {
	
}

class Library{
	public void displayAvailableBooks(Vector<Book> v) {
		IO.println("Available Books in the Library");
		v.forEach(IO::println);
	}
	
	public void isseBook(Vector<Book>v, int find) {
		boolean isFound=false;
		Iterator<Book>itr = v.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			if(b.id()==find) {
				itr.remove();
				isFound=true;
			}
			
		}
		if(isFound==false) {
			IO.println("not found");
		}
	}
	public void searchBook(Vector<Book>v, String find) {
		boolean isFound=false;
		for(Book books:v) {
			if(books.title().equalsIgnoreCase(find) || books.author().equalsIgnoreCase(find)) {
				IO.println(books);
				isFound=true;
				break;
			}
			
		}
		if(!isFound) {
			IO.println("No matching book found");
		}
	}
}


public class LibraryManagement {

	public static void main(String[] args) {
		
		Vector<Book>v = new Vector<>();
		v.add(new Book(100,"Core java","Mr.James"));
		v.add(new Book(101,"Adv java" , "Mr. Robert"));
		v.add(new Book(102,"Head First java","Miss kathy sierra"));
		v.add(new Book(103,"Programming in C","Mr Denis"));
		
		IO.println("Select from the Menu:");
		IO.println("1) Display Books Available in the Library");
		IO.println("2) Search a Book in the Library");
		IO.println("3) Issue a Book from the library");
		IO.println("4) Exit from the application");
		int choice =0;
		while(choice!=4) {
			choice = Integer.parseInt(IO.readln("Enter Your choice"));
			
			Library l = new Library();
			if(choice==1) {
				l.displayAvailableBooks(v);
			}
			else if(choice==2) {
				String find = IO.readln("Enter keyword to search by title or author");
				l.searchBook(v, find);
				
			}
			else if(choice==3) {
				int id = Integer.parseInt(IO.readln("Enter book id which for Book issue"));
				l.isseBook(v, id);
				
			}
			else if(choice==4) {
				System.exit(0);
			}
			else {
				IO.println("Invalid choice");
			}
			
		}
		
	}

}
