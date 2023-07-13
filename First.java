public class First {

	// SPACE DETECTOR
	// **************
	static void space_detector(String split)
    {  
		int count = 0;
		// String[] str1;
		 System.out.println("SPACE DETECTOR");
	     System.out.println("**************");
		for (int i= 0; i<split.length(); i++)
		{
			if (split.charAt(i) == ' ')
			{
				//ASK
				count++;
			}
		}
		// System.out.println(s);
		System.out.println("Total space found: " + count);
    }
	
	// FIBONACCI SERIES
	// ****************
	static void  fibonacci(int n)
    {
        int i = 1, n1 =0, n2 = 1, n3;
        System.out.println("\nFIBONACCI SERIES");
        System.out.println("****************");
        System.out.println(n1); 
        System.out.println(n2);
        while (i < n)
            {
                n3 = n1 + n2;
                System.out.println(n3);
                n1 = n2;
                n2 = n3;
                i++;
            }
    }
	
	// REPEATED CHARACTERS
	// *******************
	
	static void  repeat(String str)
    { 
        String arr = "";
        System.out.println("\nREPEATED CHARACTERS");
        System.out.println("*******************");
        System.out.println("Input String: " + str);
        for (int i = 0 ; i < str.length(); i++)
        {
        	for (int j = i + 1; j < str.length(); j++)
        	{
        		if (str.charAt(i) == str.charAt(j))
        		{
        			arr += str.charAt(i) + " ";
        		}
        	}
        }System.out.println("\n" + arr);
    }

	// PALINDROME
	// **********
	
	static void palindrome(String str_o)
    {
        String str_r = "";
        System.out.println("\nCHECKING PALINDROME");
        System.out.println("*******************");
        for (int i = str_o.length() -1 ; i >= 0; i--)
            {
                str_r += str_o.charAt(i);
            }
        if (str_o.matches(str_r))
        {
        	System.out.println("\n" + str_o + " " + str_r);
        	System.out.println("PALINDROME");
        }
        else
        {
        	System.out.println("\n" + str_o + " " + str_r);
      		System.out.println("NOT PANLINDROME");
      	}
    }
	
	// FACTORIAL
	// *********
	
	static void factorial(int n)
    { 
		int fact = 1;
		 System.out.println("\nFACTORIAL");
	     System.out.println("*********");
	     if (n < 0)
	     {
	    	 System.out.println("Please enter positive integer.");
	     }
	     else if (n == 0)
	     {
	    	 System.out.println("Factoiral of " + n + " is: " + 1);
	     }
	     else
	     {
	    	 int input = n;
        while (n > 0)
            {
                fact *= n;
                n--;
            }
        System.out.println("Factoiral of " + input + " is: " + fact);
	     }
	     
    }
	
	// REVERSED STRING
	// ***************
		
		static void reverse(String str_o)
	    {
	        String str_r = "";
	        System.out.println("\nREVERSED STRING");
	        System.out.println("***************");
	        for (int i = str_o.length() -1 ; i >= 0; i--)
	            {
	                str_r += str_o.charAt(i);
	            }
	        System.out.println("Input String: " + str_o);
	        System.out.println("Reversed String: " + str_r);   
	    }
		
		// MIN, MAX, LENGTH, ASCENDING ORDER, DESCENDING ORDER OF ARRAY
		// ************************************************************
		
		static void selectionSort(int arr[]) {
		    int min, temp;
		    System.out.println("\nINITIAL ARRAY");
		    System.out.println("*************");
		    for (int i = 0; i < arr.length; i++)
		    {
		    	if (arr[i] != arr[arr.length -1])
		    	{
		    		System.out.print(arr[i] + ",");
		    	}
		    	else
		    	{
		    		System.out.print(arr[i]);
		    	}
		    }
		    for (int i = 0; i < arr.length; i++) {  
		        min = i;
		        for (int j = i + 1; j < arr.length; j++) {
		            if (arr[j] < arr[min]) {
		                min = j;
		            }
		        }
		        if (min != i) {
		          temp = arr[min];
		          arr[min] = arr[i];
		          arr[i] = temp;
		        }
		    } 
		    System.out.println("\n\nMinimum value: " + arr[0] + " Maximum value: " + arr[arr.length -1] + "\nLength of an Array: " + arr.length);
		    System.out.println("\nASCENDING ORDER");
		    System.out.println("***************");
		    for (int i = 0; i < arr.length; i++)
		    {
		    	if (arr[i] != arr[arr.length -1])
		    	{
		    		System.out.print(arr[i] + ", ");
		    	}
		    	else
		    	{
		    		System.out.print(arr[i]);
		    	}
		    }
		    System.out.println("\nDESCENDING ORDER");
		    System.out.println("****************");
		    for (int i = arr.length -1; i >= 0; i--)
		    {

		    	if (arr[i] != arr[0])
		    	{
		    		System.out.print(arr[i] + ", ");
		    		
		    	}
		    	else
		    	{
		    		System.out.print(arr[i]);
		    	}
		    }
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		space_detector(" Hell o ");
		fibonacci(5);
		repeat("HELLO WORLD");
		palindrome("AMMA");
		palindrome("YELLOW");
		factorial(0);
		factorial(-1);
		factorial(5);
		reverse("GIANT");
		int  arr[] = {10000,2,-7,4,99};
		selectionSort(arr);
	}

}