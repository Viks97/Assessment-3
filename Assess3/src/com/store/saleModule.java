package com.store;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class saleModule {
	List<stockModule> s;
	Scanner sc;
	public saleModule() {
		this.s=new ArrayList<>();
		this.sc=new Scanner(System.in);
		
	}
	public void add() {
		int code=0;;
		String name="";
		float price=0;
		int quantity;
		System.out.println("\\~~~~The items are being added into the stock~~~~//");
		System.out.println("Enter a three digit product code");
		code=sc.nextInt();
		System.out.println("Enter the name of the product");
		name=sc.next();
		System.out.println("Enter the cost per item");
		price=sc.nextFloat();
		System.out.println("Enter the quantity you want to add to stock");
		quantity=sc.nextInt();
		stockModule d= new stockModule(code,name,price,quantity);
		s.add(d);
	}
	
	public void update() {
		System.out.println("Enter item name whose details you want to update:");
		String name=sc.next();
		int index=0;
		for(stockModule i:s) {
			if(name.equals(i.getName()))
			{
				index=s.indexOf(i);	
				break;
			}
		}
		int code=0;
		String nam="";
		float cos=0;
		int quan=0;
		System.out.println("Enter a three digit product code");
		code=sc.nextInt();
		System.out.println("Enter the name of the product");
		nam=sc.next();
		System.out.println("Enter the cost per item");
		cos=sc.nextFloat();
		System.out.println("Enter the quantity you are adding to the stock");
		quan=sc.nextInt();
		stockModule d= new stockModule(code,nam,cos,quan);
		s.set(index, d);
	}
	public void invoice() {
		int icode=0;
		int iquantity=0;
		float tCost=0;
		System.out.println("Enter code of product you want to buy");
		icode=sc.nextInt();
		for(stockModule i:s) {
			if(icode==i.getCode()) {
				System.out.println("Enter quantity required");
				iquantity=sc.nextInt();
				if(i.getQuantity()>iquantity) {
				tCost=iquantity*i.getPrice()+tCost;
				i.setQuantity(i.getQuantity()-iquantity);
				System.out.println("\\~~~~Your Bill is~~~~// \n" + "Rs. " +tCost);
				
			}else
				System.out.println("The quantity required is insufficient!! Sorry!!");
			
			}else
				System.out.println("Item Code is invalid");
		}
	}
}
