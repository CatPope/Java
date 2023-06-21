package test2_20514;

public class Circle extends Shape{
	
	double radius;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		
		System.out.println("반지름이 "+radius+"인 "+name+"을 그립니다.");
	}

}
