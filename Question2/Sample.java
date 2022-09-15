package Question2;

import java.util.Arrays;

//WAP to check the given sequence of character in given string. Suppose 
//that you are given following string “Taj is situated in Agra.” And you 
//have to find following sequence AST. AST should be one after another. If 
//you found sta, or tas, or tsa it should print string not found. 

public class Sample {

	public static void main(String[] args) {
			String given[] = {"Taj is situated in Agra"};
			String find="ast";
			boolean anyMatch = Arrays.stream(given).anyMatch(s->s.contains(find));
			//System.out.println(anyMatch);
			if(anyMatch==true) {
				System.out.println(find+" String found");
			}
			System.out.println(find+" String not found");
			
	}

}
