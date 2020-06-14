package Strings;

public class DuplicateWordCount {

	public static void main(String[] args) {
		String s = "Testing is Testing";
		String s1 = "Testing";
		String[] s2 = s.split(" ");
		
		int count=0;
		for(int i=0;i<s2.length;i++) {
			if(s1.equals(s2[i]))
			
				count++;
			
		}
           System.out.println(count);
	}

}
