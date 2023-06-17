package com.java.basics;

public class A10_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling method using Parameters
		int sum = MyAdd(5,10);
		System.out.println("The Sum of two numbers is : " + sum);

		sum = MyAdd(115,12340);
		System.out.println("The Sum of two numbers is : " + sum);

		//Calling method Passing Array
		int[] arr = {11,22,33,44,55,66,77,88,99,110};
		sum = Addarr(arr);
		System.out.println("The Sum of Array numbers is : " + sum);

		//Calling method Passing Array
		sum = AddArrornum(arr);
		System.out.println("The Sum of Array numbers in ... is : " + sum);

		//Calling method using unlimited parameters
		sum = AddArrornum(14,12,34,56,77,44,32,55,77,99,456);
		System.out.println("The Sum of Array numbers in ... is : " + sum);

		//Calling method returns Array
		int[] b = retMulValues(10, 2);
		for(int i = 0; i < b.length ; i++)
			System.out.println(b[i]);

	}

	/////////Passing Parameters
	public static int MyAdd(int a, int b)
	{
		int result = a + b;
		return result;
	}

	//////////////Passing Array
	public static int Addarr(int[] arr)
	{
		int result = 0;
		for(int i : arr)
			result = result + i;
		return result;
	}

	/////////////Passing Array or any number of parameters
	public static int AddArrornum(int... arr)
	{
		int result = 0;
		for(int i = 0 ; i < arr.length ; i++)
			result = result + arr[i];
		return result;
	}

	////////////////Return multiple values
	public static int[] retMulValues(int a, int b)
	{
		int[] arr = new int[4];
		arr[0] = a + b;
		arr[1] = a - b;
		arr[2] = a * b;
		arr[3] = a / b;

		return arr;
	}

}