import java.io.*;
class MultiCatch2 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis=new FileInputStream("abc.txt");
			int len=args.length;
			int a=10;
			int c[]=new int [2];
			if(len==0)
			{
				System.out.println("No Argument");
				int b=a/len;
			}
			else{
	System.out.println("One or more argument");
				c[1]=len;
			}
			
		}catch(ArithmeticException ae){
				System.out.println("Failed Due To "+ae);
			}catch(ArrayIndexOutOfBoundsException aobe){
				System.out.println("catching an Arrayindexoutof bounds exception exception");
			}
			catch(IOException e){
				System.out.println("File Not Found "+e);

			}
			catch(Exception e){
			System.out.println("....");
			}
			catch(Throwable t){
			System.out.println("..");
			}
				System.out.println("After my/catch block");
	}
}
