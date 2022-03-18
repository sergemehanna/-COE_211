import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	System.out.println("Input the first number: ");
	int num1 = scan.nextInt();

	System.out.println("Input the operator: ");
	String operator = scan.nextLine();

	System.out.println("Input the second number: ");
	int num2 = scan.nextInt();
	scan.nextLine();

	switch(operator) {
	case "+":
	System.out.println(add(num1, num2));
        break;
        case "-":
        System.out.println(subtract(num1, num2));
        break;
        case "/":
        System.out.println(divide(num1, num2));
        break;
        case "*":
        System.out.println(multiply (num1,num2));
        break;
        }

    }

    public String add(int a, int b) {
        return a + "+" + b + "=" + (a+b);
        
    }

    public String subtract(int a, int b) {
        return a + "-" + b + "=" + (a-b);
    }

    public String multiply(int a, int b) {
        return a + "*" + b + "=" + (a*b);
    }

    public String divide(int a, int b) {
        return a + "/" + b + "=" + (a/b);
    }
   
}
	


	

	