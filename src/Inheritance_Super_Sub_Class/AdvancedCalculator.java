package Inheritance_Super_Sub_Class;

public class AdvancedCalculator extends calculator {
	int res=0;
 public int square(int x) {
	 res = mul(x,x);
	 System.out.println(res);
	 return res;
 }
 public int rectangle(int x, int y) {
	 res = mul(x,y);
	 System.out.println(res);
	 return res;
 }
}