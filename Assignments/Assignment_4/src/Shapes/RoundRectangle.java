package Shapes;

// Imports
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class RoundRectangle extends Shapes{

	// Properties
	private String type = "Rounded Rectangle";
	
	// Constructor
	public RoundRectangle(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void draw(Graphics2D g2d) {
		g2d.setPaint(Color.GREEN);
		g2d.fill(new RoundRectangle2D.Double(this.getX(), this.getY(), this.getHeight() + 15, this.getHeight() + 15 ,this.getHeight(), this.getWidth()));	
	}
	
}
