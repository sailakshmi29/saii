package calci;
import calci1.*;
import java.util.Scanner;
public class calculator 
{
	public static void main(String[] args)
	{
		calculator1 ca=new calculator1();
		char c;
		int a,d;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		d=s.nextInt();
		c=s.next().charAt(0);
		switch(c)
		{
		case '+':
			ca.add(a,d);
			break;
		case '-':
			ca.sub(a,d);
			break;
		case '*':
			ca.mul(a,d);
			break;
		case '/':
			ca.div(a,d);
			break;
		default:
			System.out.println("wrong input");
			break;
		}
		s.close()
	}

}
