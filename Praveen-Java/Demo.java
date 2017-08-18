import java.io.PrintStream;
class Demo{

public static void main(String[] args){



//for(int i=0;i<args.length;i++)
//System.out.println(args[i]);

// for each
 int sum=0;

 for(String s1:args){
	sum=sum+Integer.parseInt(s1);       
 }
 System.out.println("Sum is "+sum);


}

}