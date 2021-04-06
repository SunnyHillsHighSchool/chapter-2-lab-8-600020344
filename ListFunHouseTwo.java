//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
    theList = new ListNode();
	}
	
	public void add(Comparable data)
	{
    if (theList.getValue() == null)
    {
      theList.setValue(data);
    } else {
      theList = new ListNode(data, theList);
    }
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
    int count=0;
    if (theList != null)
      count++;
     ListNode current = theList;
     while (current.getNext()!=null)
     {
       current = current.getNext();
       count++;
     }
   	return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
    ListNode duplicate = new ListNode(theList.getValue(), theList.getNext());
    theList.setNext(duplicate);	
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
       ListNode last = theList;
       while (last.getNext() != null)
       {
         last = last.getNext();
       }
      last.setNext(new ListNode(last.getValue(), null));
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
    ListNode prev = theList;
    ListNode current = theList.getNext();
    while(current!=null && prev!=null)
    {
      prev.setNext(current.getNext());
      current = null;
      prev = prev.getNext();
      if (prev!=null)
        current = prev.getNext();
    }
	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
    int count=0;
    if (theList != null)
      count++;
     ListNode current = theList;
     while (current.getNext()!=null)
     {
       current = current.getNext();
       count++;
       if(count%x==0)
        current.setValue(value);
     }	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
    ListNode prev = null;
    ListNode current = theList;
   int count=0;
     while (current!=null)
     {
       count++;
       if(count%x==0)
       {
        prev.setNext(current.getNext());
       }
        if(count%x!=0)
        {
          prev = current;
          current = prev.getNext();
        }
     }
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output="";
    ListNode current = theList;
     while (current!=null)
     {
      output += current.getValue() + " ";
      current = current.getNext();
     }
   	return output;
   }			
	
}
