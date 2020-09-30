import java.lang.*;
import java.util.*;

class SString
{
	int freq(String str)
	{
		char arr[] = str.toCharArray();
		
		int sum=0;
		
		int i=0;
		
		while(i<arr.length)
		{
			if(i<arr.length && arr[i]==' ')
			{
				while(i<arr.length && arr[i]==' ')
				{
					i++;
				}
			}
			if(i<arr.length && arr[i]!=' ')
			{
				while(i<arr.length && arr[i]!=' ')
				{
					i++;
				}
				sum++;
			}
		}
		return sum;
	}
}

class Demo
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string");
		String str = sobj.nextLine();
		
		SString obj = new SString();
		int ret = obj.freq(str);
		System.out.println("Words are : "+ret);		
	}
}
