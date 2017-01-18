import java.util.Scanner;

public class PatternX {
public static void main(String args[]){
	
	System.out.println("enter number of lines the pattern should consists");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j||i+j==n-1)
				System.out.print("X");
			else
				System.out.print("_");
		}
		System.out.println("");
	}
}
}
