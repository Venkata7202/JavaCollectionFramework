//LinkedListDemo.java
import java.util.*;
class LinkedListDemo1 {
public static void main(String args[]) {
	// Create an array list.
	LinkedList<Float> al = new LinkedList<Float>();
	System.out.println("Initial size of al: " +al.size());
    // Add elements to the array list.
    al.add(3.6F);
    al.add(7.7F);
    al.add(6.8F);
    al.add(5.9F);
    al.add(4.2F);
    al.add(3.1F);
	al.add(9.3F);
	al.add(9.3F);// boolean remove(Object Element); boolean remove(int index)
    System.out.println("Size of al after additions: " +al.size());
    // Display the array list.
    System.out.println("Contents of al: " + al);
    // Remove elements from the array list.
    al.remove(3.6F);
    System.out.println("Contents of al after deleting 3.6: " + al);
	System.out.println("Size of al after deletions: " +al.size());
    System.out.println("Contents of al: " + al);
	al.remove(5);
	System.out.println("Contents of al after deleting 3.6: " + al);
	System.out.println("Size of al after deletions: " +al.size());
    System.out.println("Contents of al: " + al);
  }
}
/*
Output
********
F:\BHAVAJAVA\Collections>javac ArrayListDemo.java
F:\BHAVAJAVA\Collections>java ArrayListDemo
Initial size of al: 0
Size of al after additions: 7
Contents of al: [C, A2, A, E, B, D, F]
Size of al after deletions: 5
Contents of al: [C, A2, E, B, D]
*/