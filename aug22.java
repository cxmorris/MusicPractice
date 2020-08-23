import java.util.*;
public class toDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = makeList();
		myList.add(welcome());
		adder(myList,body(myList));
		print(myList);
		String var2=extend();
		//need to clean this part up
		while (!var2.equals("d")) {
		if (var2.equals("c")) {
				
				print(myList);
				
		}  else if (var2.equals("a")) {
			adder(myList,var2);
		} else if (var2.equals("b")) {
			adder(myList, var2);
		}
		var2=extend();
		}

		
	}
	
	//method that starts the list
	public static ArrayList<String> makeList() {
		ArrayList <String> list = new ArrayList <>();
		return list;
	}
	
	//method to print out the list
	public static void print (ArrayList<String> l) {
		System.out.println("Your to-do list:");
		System.out.println();
		for (String i:l) {
			System.out.println(i);
		}
	}
	
	//puts first entry in list
	public static String welcome () {
		System.out.println("Welcome to your very own practice journal!");
		System.out.println("Here you can create a practice to do list to go through for the day.");
		System.out.println("Enter one piece or exercise you need to work on today:");
		Scanner con = new Scanner (System.in);
		String a = con.next();
		System.out.println("Yeah, that "+a+" DOES need some work...");
		return a;
	
	}
	
	//method for selecting next actions, after initial entry
	public static String body (ArrayList <String> li) {
		
		System.out.println("What do you want to do next?");
		System.out.println("a) add another item to practice list");
		System.out.println("b) delete an item from the list");
		System.out.println("c) view to-do list");
		Scanner con = new Scanner (System.in);
		String b = con.next();
		return b;
		
	}
	
	//method for carrying out actions after selection
	public static ArrayList <String> adder (ArrayList <String> li, String let) {
		if (let.equals("a")) {
			System.out.println("What piece do you want to add? (no spaces pls)");
			Scanner con = new Scanner (System.in);
			String b = con.next();
			li.add(b);
			System.out.println("Yeah, that "+b+" DOES need some work...");
			adder(li, body(li));
			
		} else if (let.equals("b")) {
			System.out.println("What piece do you want to delete?");
			Scanner con1 = new Scanner (System.in);
			String c = con1.next();
			li.remove(c);
			System.out.println("Got it! "+c+" has been deleted.");
			adder(li, body(li));
			
		} 
		return li;
	} 
	
	//method to be used only after to-do list is printed
	public static String extend () {
		System.out.println("Need to make another edit?");
		System.out.println("a) add another item to practice list");
		System.out.println("b) delete an item from the list");
		System.out.println("c) view to-do list");
		System.out.println("d) I'm done for the day- end this program");
		Scanner con = new Scanner (System.in);
		String b = con.next();
		return b;
	}

}
