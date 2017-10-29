import java.util.Scanner;
class Pgm1_d {
	public static void main(String args[]) {
		System.out.print("Enter The String : ");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int i,j,n;
		n=S.length();
		String S1 = new StringBuffer(S).reverse().toString();
		System.out.println(S1);
		if(S.equals(S1))
		System.out.println("PALINDROME");		
		else
		System.out.println("NOT PALINDROME");
		}
	}
		
		