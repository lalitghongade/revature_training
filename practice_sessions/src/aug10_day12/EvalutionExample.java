package aug10_day12;
import java.util.TreeSet;
import java.util.Iterator;

public class EvalutionExample {
	public static void main(String[] args) {
		
			/* TODO 
			Problem Statement:
			 
			WAP to find  find the numbers less than 7 in a tree set */
		 	 
		 	 
		   //creating TreeSet objects here  
		   TreeSet <Integer>ts = new TreeSet<Integer>();
		   TreeSet <Integer>ths = new TreeSet<Integer>();
		     
		   // Adding numbers in the treeset
		   ts.add(1);
		   ts.add(2);
		   ts.add(3);
		   ts.add(4);
		   ts.add(5);
		   ts.add(6);
		   ts.add(7);
		   ts.add(8);
		   ts.add(9);
		   ts.add(10);
		   
		   //checking number 7 is in list or not
		   System.out.println("treeset containd number 7 :"+ts.contains(7));
		   ;
		   // Find numbers less than 7
		   ths = (TreeSet)ts.headSet(7);  

		   // create an iterator
		   Iterator it;
		   it = ths.iterator();
		     
		   //Displaying the the numbers less than 7
		   System.out.println("Numbers less than 7 in TreeSet: ");     
		   while (it.hasNext()){
			   //printed in same line
		   System.out.print(it.next() + " ");
		   }
		   }    
	
	
	
		}