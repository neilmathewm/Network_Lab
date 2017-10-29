import java.util.Scanner;
class Pgm1_a {
	public static int fact(int f) {
		int i;
		int g =1;
		for(i=1;i<f+1;i++)
			g=g*i;
		return g;
	} 
	public static void main(String args[]) {
		System.out.print("Enter n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter r :");
		int r = sc.nextInt();
		int a,b,c;
		a = fact(n);
		b = fact(r);
		c=fact(n-r);
		System.out.println("nCr is "+a/(c*b));
		System.out.println("nPr is "+a/c);
	}
}