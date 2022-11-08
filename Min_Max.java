// WAP to find Min and Max value from the array

public class Min_Max 
 {
  public static void main(String[] args)
	{
	  int[] ar = {78,41,26,35,45,31,69,74,54};
	  int Min = ar[0];
	  for(int i = 0; i < ar.length; i++)
	  {
		  if(ar[i] < Min)
		  {
			 Min = ar[i]; 
		  } 
	  }
	  System.out.println("Max value in array is " + Min); 
      
	  int Max = ar[0];
	  for(int i = 0; i < ar.length; i++)
	  {
		  if(ar[i] > Max)
		  {
			 Max = ar[i]; 
		  } 
	  }
	  System.out.println("Max value in array is " + Max); 
	}

}
