package Strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String s = "Testing is Testing";
		String s1 = s.toLowerCase();
		String s2[] = s1.split(" ");

		for (int i = 0; i < s2.length; i++) {
			int count = 1;
			for (int j = i + 1; j < s2.length; j++) {
				if (s2[i].equals(s2[j])) {
					count++;
					
				}
			}
			if (count > 1 ) {
				System.out.println(s2[i]);
			}
		}

	}

}
