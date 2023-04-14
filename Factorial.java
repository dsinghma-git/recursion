package recursion;
import java.util.Scanner;

public class Factorial {
    
	int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n * fact(n-1);
	}
	
	
	public static void main(String[] args) {
		
		Factorial fobj = new Factorial();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		System.out.println(" Factorial of "+ n + "  = "+ fobj.fact(n));
	}

}
