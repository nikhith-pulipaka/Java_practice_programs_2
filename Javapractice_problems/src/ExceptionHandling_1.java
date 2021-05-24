
public class ExceptionHandling_1 {
	public static void main(String[] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);// code that throws exception
	    } catch (Exception e) {
	      System.out.println("Something went wrong.");// catch the exception that is occured in try block 
	    } finally {
	      System.out.println("The 'try catch' is finished.");// finally block is executed at any cost
	    }
	  }

}
