package data_structures;
import java.util.Scanner;
public class LinkedList{
	Node first, head;
	class Node{
		String Name;
		String Branch;
		String RollNo;
		String Year;
		Node next;
		Node(String a,String b, String c, String d)
		{
			Name = a;
			Branch=b;
			RollNo=c;
			Year=d;
			next = null;
		}
	}
	public static LinkedList insert(LinkedList list,String a,String b,String c,String d)
	{
		Node h = list.new Node(a,b,c,d);
		h.next=null;
		if(list.head == null)
		{
			list.head = h;
		}
		else
		{
			Node curr = list.head;
			while(curr.next != null)
			{
				curr = curr.next;
			}
			curr.next=h;
		}
		return list;
	}
	public static LinkedList insertatBeg(LinkedList list,String a,String b,String c,String d)
	{
		if(list.head == null)
		{
			Node h = list.new Node(a,b,c,d);
			list.head = h;
		}
		else
		{
			Node h = list.new Node(a,b,c,d);
			h.next = list.head;
			list.head = h;
		}
		return list;
	}
	public static LinkedList insertatend(LinkedList list,String a,String b,String c,String d)
	{
		Node h = list.new Node(a,b,c,d);
		Node temp = list.head;
		if(list.head == null)
		{
			list.head = h;
			h.next=null;
		}
		else{
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = h;
		h.next=null;
		}
		return list;
	}
	public static LinkedList deleteatBeg(LinkedList list)
	{
		if(list.head == null)
		{
	        System.out.println("Empty list");
		}
		else
		{
			Node h = list.head;
			list.head = list.head.next;
		}
		return list;
	}
	public static LinkedList deleteatend(LinkedList list)
	{
		if(list.head == null)
		{
	        System.out.println("Empty list");
		}
		else
		{
			Node curr=list.head;
			while(curr.next != null)
			{
				curr.next=null;
			}
		}
		return list;
	}
	public static void printList(LinkedList list){
		Node temp;
		temp=list.head;
		while(temp != null)
		{
			System.out.print( "->"+temp.Name);
			System.out.print( "->"+temp.Branch);
			System.out.print( "->"+temp.RollNo);
			System.out.print( "->"+temp.Year);
			System.out.print("\n");
			temp = temp.next;
		}
	}
   public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner inputNum = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students to input");
        int num=inputNum.nextInt();
        int i=1;
        while(i<=num){
        System.out.println("Enter details of student "+i);	
        System.out.println("Enter name of student");
        String x=input.nextLine();
        System.out.println("Enter branch of student");
        String y=input.nextLine();
        System.out.println("Enter rollno of student");
        String z=input.nextLine();
        System.out.println("Enter year of student");
        String k=input.nextLine();
        i++;
        list=list.insert(list,x,y,z,k); 
        }
        System.out.println("LIST INITIALLY");
        list.printList(list); 
        System.out.println("ENTER RECORD FOR INSERTION AT THE BEGINNING");
        System.out.println("Enter name of student");
        String c=input.nextLine();
        System.out.println("Enter branch of student");
        String d=input.nextLine();
        System.out.println("Enter rollno of student");
        String e=input.nextLine();
        System.out.println("Enter year of student");
        String f=input.nextLine();
        list=list.insertatBeg(list,c,d,e,f);
        System.out.println("LIST AFTER INSERTION AT BEG");
        list.printList(list);
        System.out.println("ENTER RECORD FOR INSERTION AT THE END");
        System.out.println("Enter name of student");
        String g=input.nextLine();
        System.out.println("Enter branch of student");
        String h=input.nextLine();
        System.out.println("Enter rollno of student");
        String ii=input.nextLine();
        System.out.println("Enter year of student");
        String j=input.nextLine();
        list=list.insertatend(list,g,h,ii,j);
        System.out.println("LIST AFTER INSERTION AT THE END");
        list.printList(list); 
        System.out.println("LIST AFTER DELETION FROM THE BEG");
        list=list.deleteatBeg(list);
        list.printList(list);
        System.out.println("LIST AFTER DELETION FROM THE END");
        list=list.deleteatend(list);
        list.printList(list);
    }	  
}