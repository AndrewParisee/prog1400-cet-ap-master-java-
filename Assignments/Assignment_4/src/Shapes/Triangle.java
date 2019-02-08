package Shapes;

// Imports
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Triangle extends Shapes{

	// Properties
	private String type = "Triangle";
	int xx[]= {10, 30, 50};
    int yy[]= {50, 20, 50};
	
	// Constructor
	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics2D g2d) {	

		int[] drawx = {xx[0] + getX(),xx[1] + getX(),xx[2] + getX()};
	    int[] drawy = {yy[0] + getY(),yy[1] + getY(),yy[2] + getY()};
		g2d.setPaint(Color.GRAY);
		Polygon p = new Polygon(drawx,drawy,3);
		g2d.fillPolygon(p);
	}
	
}
