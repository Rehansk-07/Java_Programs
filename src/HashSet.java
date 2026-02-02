import java.util.Iterator;
import java.util.TreeSet;

public class HashSet 
{
      public static void main(String[] argv) 
      {
           TreeSet set = new TreeSet();
           for (int i = 0; i < 5; i++)
                set.add(Math.random());

           Iterator iter = set.iterator();
           while (iter.hasNext())
                System.out.println(iter.next());

     }
}

