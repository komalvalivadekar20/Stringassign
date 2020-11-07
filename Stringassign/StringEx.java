//String handling
//=========================================
/*public class StringEx
{
	public static void main(String args[])
	{
		String s1="java";
		char ch[]={'k','o','m','a','l'};
		String s2=new String(ch);
		String s3=new String("valivadekar");
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
      		String helloString = new String(helloArray);  
		System.out.println( helloString );
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}*/

//String Length

/*public class StringEx
{
	public static void main(String args[])
	{
		String palindrome="hello i m komal";
		int len=palindrome.length();
		
		System.out.println("String Length is:" +len);
	}
}*/

//String compareTo

/*class StringEx
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2="hello";
		String s3="hemlo";
		String s4="flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
	}
}*/

//ReplaceString

/*public class StringEx
{
	public static void main(String args[])
	{
		String s1="hello how are you";
		String replaceString=s1.replace('h','t');
		System.out.println(replaceString);
	}
}*/
//StringToCharArray
class StringEx
{
	public static void main(String args[])
	{
		String s1="Welcome to Edureka";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	
	}	
}


		