package patterns.decorator;

public class RedShapeDecoratorOPC1 extends ShapeDecorator{
	public RedShapeDecoratorOPC1(Shape decoratedShape){
		super(decoratedShape);
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
