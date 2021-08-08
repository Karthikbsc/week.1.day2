package week1.day2;



public class Calculator {

	public int add() {
	int a=5,b=6,c=7;
	int add = a+b+c;
	return add;
	
	}		
	
	public int sub() {
		int a=5,b=2;
		int sub=a-b;
		return sub;
	}
	
	public int mul() {
		int a=5,b=2;
		int mul =a*b;
		return mul;
	}
	
	public int div() {
		int a=5,b=2;
		int div =a/b;
		return div;
	}
public static void main(String[] args) {
	Calculator obj =new Calculator();
	int result = obj.add();
	System.out.println("sum "+result);
	
	int result1 = obj.sub();
	System.out.println("sub "+ result1);
	
	int result2 = obj.mul();
	System.out.println("mul "+ result2);
	
	int result3 = obj.div();
	System.out.println("div "+ result3);
}
}

	