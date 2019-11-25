package com.manthan.collection.lamda;

public class TestC {

	public static void main(String[] args) {

		testB ref = a -> {
			int f =1 ;
			for(int i=0;i<a;i++)
			{
				f=f*i;
			}
			return f;
			
		};
	}

}
