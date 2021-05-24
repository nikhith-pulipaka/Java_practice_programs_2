import java.util.*;
public class RepeatLastNchars {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str = s.nextLine();
		int n = s.nextInt();
		s.close();
		
		StringBuffer sb = new StringBuffer();
			
		for (int i = 0; i < n; i++) 
		{
			sb.append(str.substring(str.length() - n));
		}

		System.out.println(sb);
	}

}
