package test2_20514;

public class Rectangle extends Shape{
	
	double width;
	double height;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		
		System.out.println("가로 "+width+" 세로 "+height+"인 "+name+"을 그립니다.");
	}
	
	

}
