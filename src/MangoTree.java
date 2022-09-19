package com.p;
import java.util.Scanner;
public class MangoTree {

	public static void main(String[] args) {

		int number_rows, number_columns, number_tree;
        System.out.println("Enter the number of rows and columns: ");
        Scanner sc = new Scanner(System.in);
        number_rows = sc.nextInt();
        number_columns = sc.nextInt();
        System.out.println("Enter the position number of the tree: ");
        number_tree = sc.nextInt();
        if(number_tree>number_rows*number_columns){
            System.out.println("this tree does not belong to Dora");
        }

        else if(number_tree>=1 && number_tree<=number_columns || number_tree%number_columns==0 || number_tree%number_columns==1){
            System.out.println("its a mango tree!");
        }

        else{
            System.out.println("not a mango tree!");
        }

	}

}
