package test;

import static org.junit.Assert.*;

import org.junit.Test;

import barrenmoor.*;

public class test {

@Test

public void testmain() {
	
	main testing = new main();
	assertNull("Error no class created", testing);

}

public void testmove() {

	main testmove = new main();
	assertEquals("Wrong way!", "You have found the treasure!",
			testmove.move("east","east", "south","south","east"));

}


public void testgetName() {

	Player getnametest = new Player();
	getnametest.setName("example");
	assertEquals("example",getnametest.getName());
}

public void readcompasstest() {
	
	Compass testcompassread = new Compass();
	assertNotNull(testcompassread.readCompass());

}

public void testIntroText() {
	
	//main testintro = new main();
	//assertNull(main.introText());
}

}


}