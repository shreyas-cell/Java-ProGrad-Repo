import java.util.Scanner;
public class ArrayType {
	
static int arrayType(int arr[]) {
	boolean even=false,odd=false;
	for(int i:arr) {
		if(i%2==0)
		even=true;
		else
			odd=true;
	}
	if(even==true && odd==false)
	return 1;
	else if(odd==true && even==false)
		return 2;
	else if(even==true && odd==true)
		return 3;
	return 0;
}
	
public static void main(String[] args) {
System.out.println("enter array size");

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];

System.out.println("enter elements ");

for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
int type=arrayType(arr);

if(type==1)
	System.out.println("Even");
else if(type==2)
	System.out.println("Odd");
else
	System.out.println("Mixed");
}
}
