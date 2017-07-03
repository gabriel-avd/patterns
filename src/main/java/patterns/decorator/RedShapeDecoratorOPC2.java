package patterns.decorator;

public class RedShapeDecoratorOPC2 implements Shape{
	Shape decoratedShape;
	public RedShapeDecoratorOPC2(Shape decoratedShape){
		//super(decoratedShape);
		this.decoratedShape = decoratedShape;
	}
	
	@Override
	public void draw(){
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color: Red");
	}

}
