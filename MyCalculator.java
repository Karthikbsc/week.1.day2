package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calobj = new Calculator();
		calobj.add();
		calobj.sub();
		calobj.mul();
		calobj.div();
		
int result = calobj.add();
System.out.println(result);
int result1 = calobj.sub();
System.out.println(result1);
int result2 = calobj.mul();
System.out.println(result2);
int result3 = calobj.div();
System.out.println(result3);

	}

}
