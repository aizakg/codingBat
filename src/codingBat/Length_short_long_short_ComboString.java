package codingBat;

public class Length_short_long_short_ComboString {
	public static void main(String[] args) {
		/*
		 * Given 2 strings, a and b, return a string of the form short+long+short,
		 * with the shorter string on the outside and the longer string on the
		 *  inside. The strings will not be the same length, but they may be 
		 *  empty (length 0).
		 *  */
		String a = "hi";
		String b="hello";
	  if(a.length()<=b.length()) {
		  System.out.println(a+b+a);
	  }	else {
		  System.out.println(b+a+b);
	  }
	}

}
