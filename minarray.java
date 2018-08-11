import java.util.*;
public class maxarr {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the size of array :");
		Scanner a = new Scanner(System.in);
		n = a.nextInt();
		int d[] = new int [n];
		
		System.out.println("enter the elements of an array :");
		for(int i=0;i<n;i++)
		{ 
			d[i]=a.nextInt();
		}
		int min= d[0];
		for(int j=0;j<n;j++)
		{
			if(min> d[j])
				min = d[j];
		}
		System.out.println("the min in array is :");
		System.out.println(min);
		

	}

}
