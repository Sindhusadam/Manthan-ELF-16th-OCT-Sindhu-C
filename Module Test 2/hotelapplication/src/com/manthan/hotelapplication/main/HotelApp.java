package com.manthan.hotelapplication.main;

import java.util.Scanner;

import com.manthan.hotelapplication.AddFoodItem;
import com.manthan.hotelapplication.DeleteFoodItem;
import com.manthan.hotelapplication.DisplayMenu;
import com.manthan.hotelapplication.ModifyFoodItem;
import com.manthan.hotelapplication.TotalBill;

public class HotelApp {

	public static void main(String[] args) {

		boolean flag=true;
		while(flag) {
		System.out.println("press 1 to display menu");
		System.out.println("press 2 to give orders");
		System.out.println("press 3 to add or deleted or modify food items");
		System.out.println("press 4 to get bill");
		System.out.println("press 0 to end order");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :");
		int value = sc.nextInt();

		if(value==1) {
			DisplayMenu display = new DisplayMenu();
			display.displayMenu();	
			
		}else if(value==2){
			
				Scanner sc2= new Scanner(System.in);
				System.out.println("enter item code =");
				int value2 = sc2.nextInt();	
				
										
		}else if(value==3) {
			
			System.out.println("press A to add food item");
			System.out.println("press B to remove food item");
			System.out.println("press C to modify food item");
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter value :");
			String value3 = sc.next();
			
			if(value3=="A") {
				AddFoodItem add = new AddFoodItem();
				add.addItem();
			}else if(value3=="B"){
				DeleteFoodItem delete = new DeleteFoodItem();
				delete.deleteItem();
			}else {
				ModifyFoodItem modify = new ModifyFoodItem();
				modify.modifyItem();		
			}
			}else if (value==4) {
				
				TotalBill bill = new TotalBill();
				bill.total();
				
			}else if(value==0) {
				flag=false;
				break;
			}
			else {
				System.out.println("invalid input, please choose the correct option");
			}
			
			}
			System.out.println("Thank you");
			
		}
	}
