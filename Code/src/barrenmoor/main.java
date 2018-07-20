	package barrenmoor;
	import java.util.ArrayList;
import java.util.Scanner;
	
	public class main {
	
		public static void main(String[] args) {
			
			
		Scanner playername = new Scanner(System.in);
		System.out.println("Enter your name : ");
	
		 
		Player player = new Player(playername); 
		player.setName(playername.nextLine());
		System.out.println("Welcome" + "  " + player.getName() + "  " + 
		"you awaken to find yourself in a barren moor... " + "Try look");
		introText();
		
		
		Compass directions = new Compass();
		
		System.out.println(directions.firstMove());
		System.out.println(directions.secondMove());
		
		
		
		
		TreasureChest locationdetails = new TreasureChest("east","east", "south","south","east");

		ArrayList<TreasureChest> array= new ArrayList<TreasureChest>(); 
		array.add(locationdetails);
		
	
}
		
		public static void introText() {
	
		String text = "Grey foggy clouds float opressively close to you reflected in the murky grey water which reaches up your shins. \nSome black plants barely poke out of the shallow water. \nTry 'north', 'south', 'east', or 'west' \nYou notice a small watch-like device in your left hand.\nIt has hands like a watch, but the hands don't seem to tell the time.\"";
		
		Scanner enter = new Scanner(System.in);
		String enterlook = enter.nextLine();
		
		
		if ( enterlook.equals("look")) {
	
		System.out.println(text);
		System.out.println("The dial reads 5m currently");
		System.out.println("Enter your first move :");	
		}
		
		else {
		
		System.out.print("Please type look");

		Scanner reenter = new Scanner(System.in);
		String reenterlook = reenter.nextLine();
		
		if(reenterlook.equals("look")) {

		System.out.println(text);
		}
			enter.close();
			reenter.close();
		
		}
			
		}
	}
	
