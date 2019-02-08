package Shapes;

// Imports
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends Shapes{

	// Properties
	private String type = "Circle";
	
	// Constructor
	public Circle(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		g2d.setPaint(Color.RED);
		g2d.fill(new Ellipse2D.Double(this.getX(), this.getY() ,this.getHeight(), this.getWidth()));	
	}	
}
