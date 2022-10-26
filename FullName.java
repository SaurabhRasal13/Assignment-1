
public class FullName 
 {

	public static void main(String[] args)
	 { 
		int n = 11;
		
		// SAURABH
		
	    for(int i = 0; i < n; i++)
	    {
 // For S
		 for(int j = 0; j < n; j++)
	     {
		  if((i == 0 && j <= n-2 && j > 0)|| (i == (n-1)/2 && j < n-2 && j > 0)|| (i == n-1 &&  j < n-2 )||
			 (j == 0 && i < (n-1)/2 && i > 0)|| (j == n-2 && i > (n-1)/2 && i < n-1))
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     } 
// For A
         for(int j = 0; j < n; j++)
	     {
		  if((j == 0 && i > 0 ) || (j == (n-1) && i >0) ||
			  i == (n-1)/2 || (i == 0 && j > 0 && j < n-1))
		   
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     }
// For U
         for(int j = 0; j < n; j++)
	     {
		  if(j == 1 && i < n-1 || j == n-1 && i < n-1 || i == n-1
			 && j > 1 && j < n-1)
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 }
// For R
         for(int j = 0; j < n; j++)
	     {
		  if(j == 1 || j == n-1 && i < (n-1)/2 && i > 0 || (i == j && i >= (n-1)/2) ||
			 i == 0 && j > 1 && j < n-1 || i == (n-1)/2 && j!=0 && j< n-1)
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 } 
// For A
         for(int j = 0; j < n; j++)
	     {
		  if((j == 1 && i > 0 ) || (j == (n-1) && i > 0) ||
			  (i == (n-1)/2 && j >= 1)|| (i == 0 && j > 1 && j < n-1))
		   
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     }
// For B
         for(int j = 0; j < n; j++)
	     {
		  if((j == 1  ) || (j == (n-1) && i > 0 && i < n-1 && i != (n-1)/2) || 
			 (i == (n-1)/2 && j >= 1 && j < (n-1)) || (i == n-1 && j < (n-1) && j >=1)|| (i == 0 && j > 1 && j < n-1))
		   
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     }
// For H
         for(int j = 0; j < n; j++)
	     {
		  if(j == 1 || j == (n-1)  ||
			 (i == (n-1)/2 && j >= 1))
		   
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     }
			System.out.println();
			
	     }
	    
	    
	    System.out.println();
	    System.out.println();
	    
	    // SURESH
	    
	    
	    
	    for(int i = 0; i < n; i++)
	    {
 // For S
		 for(int j = 0; j < n; j++)
	     {
		  if((i == 0 && j <= n-2 && j > 0)|| (i == (n-1)/2 && j < n-2 && j > 0)|| (i == n-1 &&  j < n-2 )||
			 (j == 0 && i < (n-1)/2 && i > 0)|| (j == n-2 && i > (n-1)/2 && i < n-1))
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     } 
// For U
         for(int j = 0; j < n; j++)
	     {
		  if(j == 1 && i < n-1 || j == n-1 && i < n-1 || i == n-1
			 && j > 1 && j < n-1)
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 }
// For R
         for(int j = 0; j < n; j++)
	     {
		  if(j == 1 || j == n-1 && i < (n-1)/2 && i > 0 || (i == j && i >= (n-1)/2) ||
			 i == 0 && j > 1 && j < n-1 || i == (n-1)/2 && j!=0 && j< n-1)
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 } 
//For E
		 for(int j = 0; j < n; j++)
	     {
		  if((j == 1 && i!= 0)|| (i == 0 && j!= 0) || 
		     (i == (n-1)/2 && j!= 0) || (i == n-1 && j!= 0))
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 } 
		    
 // For S
		 for(int j = 0; j < n; j++)
	     {
		  if((i == 0 && j <= n-2 && j > 1)|| (i == (n-1)/2 && j < n-2 && j > 1)||
			(i == n-1 &&  j < n-2  && j >=1) || (j == 1 && i < (n-1)/2 && i > 0)|| (j == n-2 && i > (n-1)/2 && i < n-1))
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     } 
// For H
		 for(int j = 0; j < n; j++)
		 {
		  if(j == 1 || j == (n-1)  ||
			 (i == (n-1)/2 && j >= 1))
		   
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 }
		
		
		 System.out.println();
	    
	    }
	    
	    System.out.println();
	    System.out.println();
	    
	   // RASAL 
	    
	    
// For R
	    for(int i = 0; i < n; i++)
	    {
        for(int j = 0; j < n; j++)
	     {
		  if(j == 0 || j == n-1 && i < (n-1)/2 && i > 0 || (i == j && i >= (n-1)/2) ||
			 i == 0 && j > 0 && j < n-1 || (i == (n-1)/2  && j< n-1))
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 }
// For A
        for(int j = 0; j < n; j++)
	     {
		  if((j == 1 && i > 0 ) || (j == (n-1) && i > 0) ||
			  (i == (n-1)/2 && j > 1) || (i == 0 && j > 1 && j < n-1))
		   
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     }
// For S
		 for(int j = 0; j < n; j++)
	     {
		  if((i == 0 && j <= n-2 && j > 1)|| (i == (n-1)/2 && j < n-2 && j > 1)||
			(i == n-1 &&  j < n-2  && j >=1) || (j == 1 && i < (n-1)/2 && i > 0)|| (j == n-2 && i > (n-1)/2 && i < n-1))
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     } 
// For A
        for(int j = 0; j < n; j++)
	     {
		  if((j == 1 && i > 0 ) || (j == (n-1) && i > 0) ||
			  (i == (n-1)/2 && j > 1) || (i == 0 && j > 1 && j < n-1))
		   
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
	     }
//For L
		 for(int j = 0; j < n; j++)
	     {
		  if((j == 1 )|| (i == n-1 && j!= 0))
		  {
			 System.out.print("*");
		  }
		  else
		  {
			 System.out.print(" ");
		  }
		 } 
        
        System.out.println();
	    }
	}
 }
 	
	
