package blabla;
import java.util.Scanner;
public class Assert {

	public static void main(String[] args) {

		int balance = 1000;
System.out.println("amount");
Scanner sc = new Scanner (System.in);
int amount=sc.nextInt();

assert amount >=0;

balance=balance+amount;

System.out.println(balance);

	}

}
