package com.store;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int option=0;
		saleModule sm=new saleModule();
		do {
			System.out.println("\\~~~~Stock Section~~~~//");
			System.out.println("MENU");
			System.out.println("1.Add new items in stock");
			System.out.println("2.Show all available items in stock");
			System.out.println("3.Update Details in stock");
			System.out.println("\\~~~~Customer Section~~~~//");
			System.out.println("MENU");
			System.out.println("4. Buy items and get bill");
			System.out.print("\nOption > ");
			option = s.nextInt();
			switch (option) {
			case 1:

				sm.add();

				break;
			case 2:
				System.out.println("These are the items available in the stock");
				for (stockModule i:sm.s) {
					System.out.println(i);
				}

				break;
			case 3:
				sm.update();	
				break;
			case 4:
				sm.invoice();
				break;
			case 5:

				break;
			case 6:

				break;
			default:
				option = 8;
				break;
			}

		} while (option != 8);

	}

}
