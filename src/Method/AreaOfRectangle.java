package Method;

public class AreaOfRectangle {
	double AreaOfRectangle;
	//Creating a method to calculate Area of rectangles
	public double areaOfRectangle() {
		double length=5.6;
		double width=7.7;
		AreaOfRectangle=length*width;
		return AreaOfRectangle;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle area=new AreaOfRectangle()
;		System.out.println(area.areaOfRectangle());
	}

}
