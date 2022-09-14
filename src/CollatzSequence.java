import java.util.Scanner;
class Main
{
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n==1){
	    System.out.println(n);
	    System.out.println(0);
	}
	else{
	 while (n != 1)
		{
			System.out.println(n);
			if (n%2!= 0)
				n = 3 * n + 1;
			else
            n = n / 2;
        }

System.out.print(n);   
	}
	
}
}

