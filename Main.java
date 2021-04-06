//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class Main
{
	public static void main ( String[] args )
	{
		ListFunHouseTwo funHouse = new ListFunHouseTwo(); 
		
		funHouse.add("go");
		funHouse.add("on");
		funHouse.add("at");
		funHouse.add("34");
		funHouse.add("2.1");
		funHouse.add("-a-2-1");
		funHouse.add("up");		       		
		funHouse.add("over");
			 			
		out.println("Original list values\n");	
		System.out.println(funHouse);
		out.println("\n");
		
		out.println("num nodes = " + funHouse.nodeCount());

		out.println("\nList values after calling nodeCount\n");	
		System.out.println(funHouse);
		out.println();		

		funHouse.doubleLast();		
		out.println("\nList values after calling doubleLast\n");							
		System.out.println(funHouse);
		out.println();				


		funHouse.doubleFirst();		
		out.println("\nList values after calling doubleFirst\n");							
		System.out.println(funHouse);
		out.println();	
				
    //not originally included in the main method
    funHouse.skipEveryOther();		
		out.println("\nList values after calling skipEveryOther\n");							
		System.out.println(funHouse);
		out.println();	
		
		funHouse.removeXthNode(2);		
		out.println("\nList values after calling removeXthNode(2)\n");					
		System.out.println(funHouse);
		out.println();			
		
		
		funHouse.setXthNode(2,"one");		
		out.println("\nList values after calling setXthNode(2,one)\n");										
		System.out.println(funHouse);
		out.println();				
	}
}
