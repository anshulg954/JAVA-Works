package data_structures;
import java.util.Scanner;
class LinkList{
	Node first, head;
	class Node{
		String Name;
		String Branch;
		String RollNo;
		String Year;
		Node next;
		Node()
		{
			
		}
		Node(String a,String b, String c, String d)
		{
			Name = a;
			Branch=b;
			RollNo=c;
			Year=d;
			next = null;
		}
	}
	public static LinkList insert(LinkList list,String a,String b,String c,String d)
	{
		if(list.first == null)
		{
			Node h = list.new Node(a,b,c,d);
			list.first = h;
			list.head = h;
			return list;
		}
		else
		{
			list.first.next = list.new Node(a,b,c,d); 
			list.first = list.first.next;
			return list;
		}
	}
	public static LinkList insertatBeg(LinkList list,String a,String b,String c,String d)
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
	public static LinkList insertatend(LinkList list,String a,String b,String c,String d)
	{
		Node h = list.new Node(a,b,c,d);
		Node temp = list.head;
		if(list.head == null)
		{
			list.head = h;
			return list;
		}
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = h;
		return list;
	}
	public static LinkList deleteatBeg(LinkList list)
	{
		if(list.head == null)
		{
			return list;
		}
		else
		{
			Node h = list.head;
			list.head = list.head.next;
			return list;
		}
	}
	public static LinkList beg(LinkList list)
	{
		if(list.head != null)
			return list;
		else
			return list;
	}
	public static LinkList printList(LinkList list){
		while(list.head != null)
		{
			System.out.print(list.head.Name + "->");
			System.out.print(list.head.Branch + "->");
			System.out.print(list.head.RollNo + "->");
			System.out.print(list.head.Year + "->");
			System.out.print("\n");
			list.head = list.head.next;
		}
		return list;
	}
}
 class LinkedList{
    public static void main(String[] args) {
        LinkList list = new LinkList();
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
        list=list.printList(list); 
        list=list.insertatend(list,"Random i/p","CSE","29","2nd");
        list=list.insertatBeg(list,"xyz","CSE","30","2nd");
        list=list.printList(list);         
    }	  
}
