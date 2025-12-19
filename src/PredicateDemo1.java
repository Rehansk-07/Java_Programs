// program for voting eligibility....


import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = age-> age>=18;
		int myage = Integer.parseInt(IO.readln("Enter Your ege :"));
		IO.println("your age is "+myage+" you are elgible for voting :"+p1.test(myage));
	
	}

}
