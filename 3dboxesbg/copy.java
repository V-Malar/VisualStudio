public class Main {
static void display()
{
int arr[] = {1,2,3,4,5};
for (int i:arr)
{
System.out.println(i);
}
int arr2[] = {1,-2,3,40,5};
int min = arr2[0];
for (int i=0; i<arr2.length; i++) { if (min> arr2[i])
  {
  min = arr2[i];
  }
  }
  int max = arr2[0];
  for (int i=0; i<arr2.length; i++) { if (max < arr2[i]) { max=arr2[i]; } } System.out.println("Minimum value: " + min);
        System.out.println(" Maximum value: " + max);
	}
    static void printArray(int arr[])
    {
    	for (int i:arr)
        {
        	System.out.println(i);
        }
   	}
    static int[] pass()
    {
    	return new int[]{21, 31, 41, 51, 61};
    }
    static void multiply()
    {
    //creating two matrices    
int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
//creating another matrix to store the multiplication of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//multiplying and printing multiplication of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}//end of k loop  
System.out.print(c[i][j]+" ");  //printing matrix element  
}//end of j loop  
System.out.println();//new line    
}    
}
static void add()
{
//creating two matrices  
int a[][]={{1,3,4},{3,4,5}};  
int b[][]={{1,3,4},{3,4,5}};  
  
//creating another matrix to store the sum of two matrices  
int c[][]=new int[2][3];  
  
//adding and printing addition of 2 matrices  
for(int i=0;i<2;i++){  
for(int j=0;j<3;j++){  
c[i][j]=a[i][j]+b[i][j];  
System.out.print(c[i][j]+" ");  
}  
System.out.println();//new line  
}  
}
static void equals()
{
int arr[]={33,3,4,5};  
System.out.println(" Printing original array:"); for(int i:arr) System.out.println(i); System.out.println("Printing
    clone of the array:"); int carr[]=arr.clone(); for(int i:carr) System.out.println(i); System.out.println("Are both
    equal?"); System.out.println(arr==carr); } static void array_copy() { //declaring a source array char[]
    copyFrom={ 'd' , 'e' , 'c' , 'a' , 'f' , 'f' , 'e' , 'i' , 'n' , 'a' , 't' , 'e' , 'd' }; //declaring a destination
    array char[] copyTo=new char[7]; //copying array using System.arraycopy() method System.arraycopy(copyFrom, 2,
    copyTo, 0, 7); //printing the destination array System.out.println(String.valueOf(copyTo)); } static void
    array_class() { int arr[]={4,4,5}; //getting the class name of Java array Class c=arr.getClass(); String
    name=c.getName(); //printing the class name of Java array System.out.println(name); } public static void
    main(String[] args) { display(); printArray(new int[]{11,22,33,44,55}); int result_pass[]=pass(); for (int
    i:result_pass) { System.out.println(i); } //int arr[]={50,60,70,80}; //for(int
    i=0;i<=arr.length;i++)//ArrayIndexOutOfBoundsException //{ //System.out.println(arr[i]); //} int
    arr[][]={{1,2,3},{2,4,5},{4,4,5}}; for(int i=0;i<3;i++){ for(int j=0;j<3;j++){ System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
multiply();
add();
equals();
array_copy();
array_class();
  }
}