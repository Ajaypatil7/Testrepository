package com.Array2;

public class A1 {
		static int[] createArray(int size)
		{
			System.out.println("+++++++");
			int[] array=new int[size];
			for(int i=0;i<array.length;i++)
			{
				array[i]=i+1; 
			}
			System.out.println("+++++++");
			return array; 
		}
	public static void main(String[] args) {
		System.out.println("___________");
		int[] array=createArray(10);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("___________");
	}

}
