import java.util.Scanner;
class Pgm1_c {
	public static void main(String args[]) {
		System.out.print("Enter n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j,i,temp;
		int a[]=new int[10]; 
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(i=0;i<n;i++)
 		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}			
		}
		//System.out.println("SORTED ARRAY IS:");
		//for(i=0;i<n;i++)
		//System.out.println(a[i]);
		System.out.print("SECOND LARGEST ELEMENT IS:");	
		for(i=0;i<n;)
		{
			if(a[i]!=a[i+1])
			{
				System.out.println(a[i+1]);	
				break;
			}
			else
			i++;
			
		}
		}
		}	
	
