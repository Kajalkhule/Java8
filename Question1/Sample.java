package Question1;

import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {
		int num =235;
         int num1 = IntStream.iterate(num, i -> i / 10).map(n -> n % 10).limit(String.valueOf(num).length())
                  .reduce(0, (a, b) -> a = a * 10 + b);
          if (num == num1) {
              System.out.println("The palindrome number is " + num1);
          } else {
              System.out.println(num + " is not a palindrome number ");
          }
      
	}

}
