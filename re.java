import java.io.*;
import java.util.*;
class re
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int r=0;
			while(n>0)
			{
				r=r*10+(n%10);
				n=n/10;
			}
				System.out.println(r);
		}
	}
