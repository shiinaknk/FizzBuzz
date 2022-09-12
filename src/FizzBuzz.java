
public class FizzBuzz {
	public static void main(String[] args) {
	  for(int number=1;number<=100;number++) {
		  
		  if(number%3==0) {
		  System.out.println("Fizz");
		  }
		  if(number%5==0) {
		  System.out.println("Buzz");
		  }
		  if(number%3==0&&number%5==0) {
		  System.out.println("FizzBuzz");
		  }
		  
		  else {
		  System.out.println(number);
		  }	 
		  
		  }
		  
	  }
	}

