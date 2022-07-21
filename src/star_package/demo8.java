package star_package;

public class demo8
{
/*
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4 
 5
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5 
 */
public static void main(String[] args)
{
		
for(int i=1;i<=5;i++)
{
	for(int j=5;j>=i;j--)
	{
		System.out.print(" "+j);
	}
	System.out.println();
}
for(int r=1; r<=5;r++)
{
for( int s=1;s<=r;s++)
{
	System.out.print(" "+s);
}
System.out.println();
}

}
}
