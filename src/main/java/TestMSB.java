/****************************************************************************
	Simple suite of testers for the MyStringBuilder
	Hans Yuan 
	CSE 8B Winter 2017

	This file contains an example tester for ways you might want to test 
	your data structure. The idea of testing a data structure is very 
	similar to testing a method:

	Give it some inputs, and determine what the result is. In this 
	assignment, everything is public so you can print out the data
	directly. The difference here is that the result is not 
	necessarily PRINTED or RETURNED. Rather, what we are concerned about
	is the STATE of the data structure. For example:

	Declare a new MSB. Assume this is an empty MSB with no nodes:
	{}

	MSB.add('a');
	MSB.add('b');

	Suppose this is the MSB after running the above two lines of code. 
	{ ['a'] --> ['b'] --> [''] }

	Look at the above representation of the MyStringBuilder. This is 
	WRONG. I only added two chars, yet there are three nodes! Your testers
	must be able to tell you the state of your data structure. Write 
	many test cases and tackle your data structure as much as possible.

****************************************************************************/
	public class TestMSB {



	/************************************************
	**************** Field Variables ****************
	*************************************************/ 
	MyStringBuilder msb = new MyStringBuilder();    // One instance of MSB



	/************************************************
	******** Main method for MyStringBuilder ********
	*************************************************/ 

	public static void main (String[] arg) 
	throws Exception {								// REFER TO THE METHOD DEFINITIONS BELOW
		
		TestMSB test = new TestMSB();
		test.testAdd     	('g');					// Add a 'g' to MSB, check it was added
		test.testToString	();						// Should use the STRING print 
		test.testChange  	('z', 0);				// Change 'g' to 'z'
		test.testToString	();						// Should use the STRING print 
	
	}


	/************************************************
	*** Simple test functions for MyStringBuilder ***
	*************************************************/ 

	/* 
	testAdd
	Input: 
		char toAdd
	Print: 
		When the tests start and end
		What char was passed in
		The character at the first node
	Return: 
		void - nothing is returned
	*/
		public void testAdd(char toAdd) {				 
		System.out.println							// This method will add to MSB the char
		("START TEST ADD. Char is " + toAdd);		// it was passed in (char toAdd). Then,
		msb.add(toAdd);                     		// it will print out the first node's 
		char firstChar = msb.firstNode.data;		// internal data. This internal data 
		print(firstChar);							// should match the passed in toAdd.
		System.out.println("END   TEST ADD.\n\n");	// Note you must modify this tester to 
	}												// work beyond the first node. 


	/* 
	testChange
	Input: 
		position - where you want to change the char
		toChange - the char that will replace to original
	Print: 
		When the tests start and end
		The character at the first node
	Return: 
		void - nothing is returned
	*/
	public void testChange							// This method changes the char at the 
	(char toChange, int position) throws Exception { // node at the given position. Then, it
													// will print out the char at the first 		
		System.out.println							// node. Again, modify the code for more
		("START TEST CHANGE. " + 					// functionality. 
			"Pos and char are: " + 
			position + " " + toChange);						
		
		msb.change(toChange, position);
		print( msb.firstNode.data );

		System.out.println
		("END   TEST CHANGE.\n\n");
	}


	/* 
	testChange
	Input: none
	Print: 
		When the tests start and end
		The character at the first node
	Return: 
		void - nothing is returned
	*/
	public void testToString() {					// This method tests the MSB's toString()
		System.out.println							// The String is stored just for visiblity.
		("START TEST TOSTRING.");					// Then it is passed to the print methods.

		String toPrint = msb.toString();
		print (toPrint);
		System.out.println

		("END   TEST TOSTRING.\n\n");
	}

	/* Overloaded print statements to determine whether
	a char or a String was printed. You can use this to
	help you debug since this implementation will tell you
	which method was called. 
	*/
	public static void print(String p){
		System.out.println("A STRING WAS PASSED:");
		System.out.println(p);
	}
	public static void print(char p){
		System.out.println("A CHARACTER WAS PASSED:");
		System.out.println(p);
	}

	// TODO Add your own tests! (Not for credit, but is for correctness.)


}