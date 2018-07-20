package barrenmoor;
import java.util.Scanner;

public class Compass implements Moves{
               
String  north;
String  south;
String  east;
String  west;

String firstmove;
String secondmove;
String thirdmove;
String fourthmove;
String fifthmove;

int meters;


public void moves(String firstmove, String secondmove, String thirdmove, String fourthmove, String fifthmove) {
	
}

public void UserDirections(String north, String south, String east, String west) {
	this.north = north;
	this.east = east;
	this.west = west;
	this.south = south;
	
}

public String firstMove() {
	
	Scanner move = new Scanner(System.in);
	String firstmove = move.nextLine();
	this.firstmove = firstmove;
	
	if(firstmove.equals("east")) {
	
	return "The dial now reads 4.5 meters";
	
	}
	else if(firstmove.equals("west")) {
		return "The dial now reads 6 meters";
	}
	else if(firstmove.equals("south")) {
		return "The dial now reads 4.7 meters";
	}
	else if(firstmove.equals("north")) {
		return "The dial now reads 7 meters";
			
	}
	return "Enter your next move" ;
}

public String secondMove( ){
	
	Scanner newmove = new Scanner(System.in);
	String nextmove = newmove.nextLine();
	this.secondmove = nextmove;
	if ( nextmove.equals("east") && firstmove.equals("east")) {
		return "The dial now reads 4 meters";
	}
	else if (nextmove.equals("west")) {
		return "The dial now reads 6.5 meters";
	}
	else if(nextmove.equals("south")) {
		
	}
	else if(nextmove.equals("north")) {
		
	}
	else {
		return "wrong";
	}
	return nextmove;
}







@Override
public String thirdMove() {
	// TODO Auto-generated method stub
	return null;
}



@Override
public String fourthMove() {
	// TODO Auto-generated method stub
	return null;
}



@Override
public String fifthMove() {
	// TODO Auto-generated method stub
	return null;
}





}
