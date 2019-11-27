package com.manthan.musicplayer;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		int n = 0;
	
		boolean flag=true;
		while(flag) {
			
		System.out.println("press 0 to exit");
		System.out.println("press 1 to show songs");
		System.out.println("press 2 to update songs");
		System.out.println("press 3 to delete songs");
		System.out.println("press 4 to search songs");
		System.out.println("press 5 to add songs");
		Scanner sc1 = new Scanner(System.in);
    	System.out.println("Enter value :");
		int value1 = sc1.nextInt();

		if( value1 ==1) {
			DisplayAllSongs j1 = new DisplayAllSongs();
			j1.displaySongs();
		}
		else if( value1 ==2){
			UpdateSongs j2= new UpdateSongs();
			j2.updateSongs();
		}
		else if(value1==3) {
			DeleteSongs j3 = new DeleteSongs();
			j3.deleteSongs(3);
			
		}
		else if( value1 ==4) {
			SearchSongs j4 = new SearchSongs();
			j4.searchSongs(2);
		}
		else if( value1 ==5) {
			AddSongs j5 = new AddSongs();
			j5.addSong();
		}
		else if(value1==0) {
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




