package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;



/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private static  int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private static  float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private static  String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private static  Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();


	public static   void setItemsReceived(int x) {
		itemsReceived = x;
	}

	public static  int getItemsReceived() {
		if (itemsReceived > 0) {
			return itemsReceived;
		}
		return 0;
	}

	public static  void setDegreesTurned(float x) {
		if (x >= 0.0 && x <= 360.0) {
			degreesTurned = x;
		}
	}

	public static  float getDegreesTurned() {
		return degreesTurned;
	}

	public static  void setNomenclature(String s){
		if(s!="") {
			nomenclature=s;
		}else {
			nomenclature=" ";
		}
	}
	public static  String getNomenclature() {
			return nomenclature;
	}
	
	public static Object getObi() {
		return memberObj;
	}
	
	public static void setObi(Object o) {
		if(o instanceof String) {
			memberObj=null;
		}else {
			memberObj=o;
		}
	}
}
