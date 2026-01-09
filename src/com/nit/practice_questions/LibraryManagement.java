package com.nit.practice_questions;
import java.util.*;

record Book(Integer id, String title, String author) {
	
}

class Library{
	public void displayAvailableBooks(Vector<Book>v) {
		IO.print("Available Books in the library");
		v.forEach(IO::println);
	}
	public void issueBook(Vector<Book>v, int find) {
		boolean isfound = false;
		Iterator<Book>itr = v.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			if(b.id()==find) {
				
				itr.remove();
				isfound = true;
				
			}
		}
		if(isfound==false) {
			IO.print("not found");
		}
	}
	
	public void searchBook(Vector<Book>v,String find) {
		boolean isFound = false;
		for(Book books:v) {
			if(books.title().equalsIgnoreCase(find) || books.author().equalsIgnoreCase(find)) {
				IO.println(books);
				isFound= true;
				break;
			}
		}
		if(!isFound) {
			IO.println("No matching found");
		}
	}
}



public class LibraryManagement {

	public static void main(String[] args) {
		Vector<Book>v = new Vector<>();
		v.add(new Book(1,"Rich Dad Poor Dad","Mr james"));
		v.add(new Book(2,"wing of fire","Mr kalam"));
		v.add(new Book(3,"why not me","Mr anubhav"));
		v.add(new Book(4,"if we are together","Mr rehan"));
		
		IO.println("Select from the Menu");
		IO.println("...............................");
		IO.println("1) Display Books Available in the Library");
		IO.println("2) Search a Books  in the Library");
		IO.println("3) Issue Books from the Library");
		IO.println("4)  Exit from the Library");
		
		int choice=0;
		while(choice!=4) {
			choice = Integer.parseInt(IO.readln("Enter your choice:"));
			Library l1 = new Library();
			if(choice==1) {
				l1.displayAvailableBooks(v);
			}
			else if(choice==2) {
				String find = IO.readln("Enter keyword to search by title or author:");
				l1.searchBook(v, find);
			}
			else if(choice==3) {
				int id = Integer.parseInt(IO.readln("Enter book id which for book issue:"));
				l1.issueBook(v, id);
			}
			else if(choice==4) {
				IO.println("thank you for visiting!!!!");
				System.exit(0);
			}
			else {
				IO.println("Invalid choice");
			}
		}
		
		
		
	}

}
