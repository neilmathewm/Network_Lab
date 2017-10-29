import java.util.Scanner;
class Pgm1_b {
	public static void main(String args[]) {
		System.out.print("Enter n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j;
		
		int a,b,c;
		a = 0;
		b = 1;
		if(n>2)
		{	System.out.print("The fibonacci series :"+a+" "+b +" ");
			for(j=2;j<n;j++) {
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}		

		}
		else if (n==1)
			System.out.print("The fibonacci series : 0");
		
		else if (n==2)
			System.out.print("The fibonacci series : 0 1");		
	}
}