package shape;

public class Rectangle extends Shape{
	
	private int width, height;
	
	public Rectangle() {
		super();
	}

	public Rectangle() {
		super();
	}

	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println("가로 "+width+ ", ");
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateRound() {
		// TODO Auto-generated method stub
		
	}
	
		

}
