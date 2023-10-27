import java.util.*;
public class Main
{

//Function to reverse the string of binary numbers
    public static String MyReverseString(String s)
    {
       int lenS = s.length();
       String s1 = "";
       for (int i = lenS - 1; i >= 0; i --)
       {
           s1 = s1 + s.charAt(i);
        
       }
    
    return s1;
    
    }
    
    
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int inputNum = input.nextInt();
		String b = "";
		
	//While loop to say while the number that the user inputted is greater than 0  while being divided by 2 keep finding the remainder of the number when dividing by 2
		while (inputNum / 2 > 0)
		{
		    int r = inputNum % 2;
		    inputNum = inputNum / 2;
		    b = b + Integer.toString(r);
		}
		b = b + Integer.toString(inputNum);
		
		String b1 = MyReverseString(b);
		System.out.println(b1);
	}
}


