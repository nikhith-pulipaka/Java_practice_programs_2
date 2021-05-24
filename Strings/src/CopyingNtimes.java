import java.util.*;
public class CopyingNtimes {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		int n = str.length();
		
		String repeater = "";
		
		if (n < 2) repeater = str;
		else repeater = str.substring(0, 2);
		
		String output = "";
		
		for (int i = 0; i < n; i++) {
			output += repeater;
		}
		
		System.out.println(output);

	}

}
