import java.util.Scanner;
 public class TowerOfHanoi
 {
  public  void toh(int n, char frompeg, char topeg, char auxpeg ) {
     if (n==1)    
     {
	   System.out.println("Move disk " + n+"  from peg " + frompeg + " to " + topeg );
     }
     else  
     {
            toh(n-1, frompeg, auxpeg, topeg);
            System.out.println("Move disk " + n+"  from peg " + frompeg + " to " + topeg );
            toh(n-1,auxpeg,topeg,frompeg);
       }
  }
    public static void main(String[] args) {
		
		TowerOfHanoi t = new TowerOfHanoi();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		t.toh(n,'A','C','B');
	}

}
