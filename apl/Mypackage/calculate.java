import Mypackage.vedant;
import java.util.Scanner;
public class calculate
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
vedant t = new vedant();
System.out.println("press 1 for addition \n Press 2 for subtraction \n");
int s = scanner.nextInt();
switch(s){
	case 1:
		add = t.add();
		System.out.println("Addition is " + sum);
	case 2:
		sub = t.sub();
		System.out.println("Subtraction is " + sum);
}
}
}
