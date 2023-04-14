
import java.util.Scanner;

public class Fibonacci {
    
	int fibo(int n)
	{
		if(n==1 || n==2)
			return 1;
		else
			return fibo(n-1) + fibo(n-2);
	}
	
	
	public static void main(String[] args) {
		
		Fibonacci fobj = new Fibonacci();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		System.out.println(n + "th term of fibonacci seuqunece is = "+ fobj.fibo(n));
	}

}
