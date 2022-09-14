import java.util.Scanner;
public class FindRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements ");
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		
		int min=10000,max=0;
		for(int i:arr) {
			if(i>max)
				max=i;
			else if(i<min)
				min=i;
		}
		System.out.println("Range is "+(max-min));
	}

}
