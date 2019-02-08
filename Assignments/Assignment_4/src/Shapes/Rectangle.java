package Shapes;

// Imports
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shapes{

	// Properties
	private String type = "Rectangle";
	
	// Constructor
	public Rectangle(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		g2d.setPaint(Color.BLUE);
		g2d.fill(new Rectangle2D.Double(this.getX(), this.getY() ,this.getHeight(), this.getWidth()));	
	}	
}
