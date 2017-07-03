package patterns.main;

import patterns.decorator.Circle;
import patterns.decorator.Rectangle;
import patterns.decorator.RedShapeDecoratorOPC1;
import patterns.decorator.RedShapeDecoratorOPC2;
import patterns.decorator.Shape;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
        //SpringApplication.run(App.class, args);
		
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecoratorOPC1(new Circle());
		Shape redRectangle = new RedShapeDecoratorOPC1(new Rectangle());
		
		System.out.println("========================= Option #1\n");
		System.out.println("Circle #1 with normal border");
		circle.draw();
		
		System.out.println("\nCircle #1 of red border");
		redCircle.draw();
		
		System.out.println("\nRectangle #1 of red border");
		redRectangle.draw();
		
		Shape circleOpt2 = new Circle();
		Shape redCircleOpt2 = new RedShapeDecoratorOPC2(new Circle());
		Shape redRectangleOpt2 = new RedShapeDecoratorOPC2(new Rectangle());
		
		System.out.println("========================= Option #2\n");
		System.out.println("Circle #2 with normal border");
		circleOpt2.draw();
		
		System.out.println("\nCircle #2 of red border");
		redCircleOpt2.draw();
		
		System.out.println("\nRectangle #2 of red border");
		redRectangleOpt2.draw();
    }
}
