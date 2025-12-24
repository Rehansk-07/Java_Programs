package java.nit.collections;
import java.util.*;

record Student() {}
record Employee() {}
record Player() {}

public class CollectionDemo {
	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(new Student());
		v.add(new Employee());
		v.add(new Player());
		v.add(12);
		IO.println(v);
		
	}

}
