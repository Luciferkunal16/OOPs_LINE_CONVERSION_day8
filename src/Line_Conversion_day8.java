package BasicCoreProgram;

import java.util.Scanner;

public class Line_Conversion_day8 {
	double x1;
	double x2;
	double y1;
	double y2;
	Scanner inp=new Scanner(System.in);
double calculate(double x1,double x2,double y1,double y2) {
	double result=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
	double result1=Math.sqrt(result);
	return result1;
}
void input() {
	System.out.println("Enter the Value of x1:" );
	x1=inp.nextDouble();
	System.out.println("Enter the Value of x2:" );
	x2=inp.nextDouble();
	System.out.println("Enter the Value of y1:" );
	y1=inp.nextDouble();
	System.out.println("Enter the Value of y2:" );
	y2=inp.nextDouble();
}
void equalLine() {
	System.out.println("Enter Coordinates  of line 1");
	input();
	double lengthLine1=calculate(x1,x2,y1,y2);
	System.out.println("Enter Coordinates  of line 2");
	input();
	double lengthLine2=calculate(x1,x2,y1,y2);
	System.out.println("Length of Line 1 is "+lengthLine1);
	System.out.println("Length of Line 2 is "+ lengthLine2);
	Integer val1=new Integer((int)lengthLine1);
	Integer val2=new Integer((int)lengthLine2);

	System.out.println(val1.equals(val2));
}
public static void main(String[] args) {
	Line_Conversion_day8 obj=new Line_Conversion_day8();
	obj.equalLine();
	

	
}

}

