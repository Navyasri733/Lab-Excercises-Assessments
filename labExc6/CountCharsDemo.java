package labExc6;

import java.util.HashMap;
import java.util.*;

public class CountCharsDemo {

	private static void main(String[] args) {
		
		HashMap<Character, Integer> charCount = new HashMap<>();
		String str = "Navyasri";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if (charCount.containsKey(str.charAt(i))) {
				int count = charCount.get(str.charAt(i));
				charCount.put(str.charAt(i), ++count);
			}
			else {
				charCount.put(str.charAt(i), 1);
			}
			
		}
		System.out.println(charCount);

	}

}


