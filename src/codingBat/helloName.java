package codingBat;

public class helloName {
	public static void main(String[] args) {
		//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	String name="Bob";
	System.out.println("Hello "+name+"!");
	 
	/*
	 * Given two strings, a and b, return the result of putting them together 
	 * in the order abba, e.g."Hi" and "Bye" returns "HiByeByeHi".
	 */
	String a="Hi";
	String b="Bye";
	System.out.println(a+b+b+a);
	
	/*
	 * make tags
	 * The web is built with HTML strings like "<i>Yay</i>" which draws
	 *  Yay as italic text. In this example, the "i" tag makes <i> and </i> which
	 *   surround the word "Yay". Given tag and word strings, create the
	 *  HTML string with tags around the word, e.g. "<i>Yay</i>".
	 */
	String tag="i";
   String word="Hello";
	String makeTags="<"+tag+">"+word+"</"+tag+">";
	System.out.println(makeTags);
	}

}
