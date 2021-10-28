package BasicCoreProgram;

import java.util.Scanner;

public class Line_Conversion_day8 {
	double x1;
	double x2;
	double y1;
	double y2;
double calculate(double x1,double x2,double y1,double y2) {
	double result=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
	double result1=Math.sqrt(result);
	return result1;
}
public static void main(String[] args) {
	Line_Conversion_day8 obj=new Line_Conversion_day8();
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the Value of x1:" );
	obj.x1=inp.nextDouble();
	System.out.println("Enter the Value of x2:" );
	obj.x2=inp.nextDouble();
	System.out.println("Enter the Value of y1:" );
	obj.y1=inp.nextDouble();
	System.out.println("Enter the Value of y2:" );
	obj.y2=inp.nextDouble();
	System.out.println("Length of Coordinates is "+obj.calculate(obj.x1, obj.x2, obj.y1, obj.y2));
}
}

