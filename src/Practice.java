

public class Practice {
	
	Practice()
	{
		System.out.println("Constructor Called..");
	}
	
	public String palindrome(String original)
	{
		String rev = "";
		
		for(int i=original.length()-1; i >= 0; i--)
		{
			rev = rev+original.charAt(i);
		}
		
		return rev;
	}
	
	public int revNum(int number)
	{
		int rev=0,r, armstrong=0, temp;
		
		while(number>0)
		{
			r = number%10;
			
			rev = (rev*10)+r;
			
			temp = r*r*r;
			
			armstrong = armstrong+temp;
			
			//temp = 0;
			
			number = number/10;
			
		}
		
		
		return armstrong;
	}
	
	public int fact(int num)
	{
		int fact = 1;
		
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
			
		}
		
		return fact;
	}

	public int factorial(int n)
	{
		if(n==0)
		
			return 1;
		else
		
			return n*factorial(n-1);
	}
	
	public void display()
	{
		System.out.println("Displaying..");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Practice p = new Practice();
		
		p.display();
		//System.out.println("This is main method..");
		
		//System.out.println("Rev of Maruti is: "+p.palindrome("Maruti"));
		
		//System.out.println("Reverse Number is: "+p.revNum(3571));
		
//		System.out.println("Armstrong is : "+p.revNum(371));
	
		System.out.println(p.fact(5));
	
		System.out.println(p.factorial(5));
		
	/*	int arr[] = new int[4];
		
		arr[0]=100;//initialization  
		arr[1]=20;  
		arr[2]=70;  
		arr[3]=40;  
		
		int temp;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j = 1; j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					
					arr[j-1] = arr[j];
					
					arr[j] = temp;
				}
			}
		}
	
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(arr[(arr.length-2)]);
	*/
	
	
	
	}
	
	
	public static void main() {
		// TODO Auto-generated method stub

		System.out.println("Without Args");
	}
	
	public static void main(String args) {
		
		System.out.println("Another method..");
	}

}
