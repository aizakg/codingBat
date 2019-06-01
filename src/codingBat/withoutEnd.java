package codingBat;

public class withoutEnd {
	public static void main(String[] args) {
		
		/*
		 * Given a string, return a version without the first and last char, so 
		 * "Hello" yields "ell".
		 *  The string length will be at least 2.
		 */
    	String str="aizada";
		String firstLastRemove=str.substring(1,str.length()-1);
		System.out.println(firstLastRemove);
	}

}
