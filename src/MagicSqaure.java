import java.util.Scanner;
public class MagicSqaure {
	
	static String checkNumber(int [][]arr) {
		int sum_r=0,sum_c=0,sum_dl=0,sum_dr=0,n=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			sum_r=sum_r+arr[i][j];	
			sum_c=sum_c+arr[j][i];
			
			}
			sum_dl=sum_dl+arr[i][i];
			sum_dr=arr[i][n-1];
			n=n-1;
		}	
		if(sum_r==sum_c && sum_dr==sum_dl && sum_r==sum_dr && sum_c==sum_dl)
			return "MagicSqaure";
		else
			return "Not MagicSqaure";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		System.out.println("enter the elements ");
		for(int outer=0;outer<n;outer++) {
			for(int inner=0;inner<n;inner++) {
				arr[outer][inner]=sc.nextInt();
			}
		}
		String op= checkNumber(arr);
		System.out.println(op);
	}

}
