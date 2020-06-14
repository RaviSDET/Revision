package Strings;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		String[] s = { "Testing", "SDET", "SDET" };
		Set<String> set = new HashSet<String>();
		for (String s1 : s) {
			if(set.add(s1)==false)
			System.out.println(s1);
		}

	}
}
