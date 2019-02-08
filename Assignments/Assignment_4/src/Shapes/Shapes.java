package Shapes;

// Imports
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public abstract class Shapes {
	
	// Define Properties
	private Color color;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int width;
	private int height;
	
	// Constructor
	public Shapes (int x, int y) { 
		this.x = x;
		this.y = y;
		Random random = new Random();
		this.width = random.nextInt(50 - 25) + 25;
		this.height = random.nextInt(50 - 25) + 25;
		// Set direction for objects to move
		do {
		dx = random.nextInt(3) - 1;
		dy = random.nextInt(3) - 1;
		} while(dx == 0 && dy == 0);
		
	}

	// Getters and setters for colors
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Getters and setters for x and y coordinates
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void changeXDirection() {
		this.dx = dx * -1;
	}
	public void changeYDirection() {
		this.dy = dy * -1;
	}
	public int getDX() {
		return dx;
	}
	public void setDX(int dx) {
		this.dx = dx;
	}
	public int getDY() {
		return dy;
	}
	public void setDY(int dy) {
		this.dy = dy;
	}
	public void move() {
		x += dx;
		y += dy;
	}
	
	// Getters and setters for height and width
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	// Abstract draw method
	public abstract void draw(Graphics2D g);
	
}
