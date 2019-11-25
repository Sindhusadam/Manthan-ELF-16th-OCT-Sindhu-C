package com.manthan.emp;

public class Crush {

	void receive(Phone P)
	{
		if (P instanceof MI)
		{
			System.out.println("Thank you brother");
		}

		else if(P instanceof Pixel)
		{
			System.out.println("thank you dear");
		}
		else if(P instanceof Iphone)
		{
			System.out.println("i love u");
		}
		else
		{
			System.out.println("non sence");
		}

	}


}
