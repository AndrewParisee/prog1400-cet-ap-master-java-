// Imports
import javax.swing.JPanel;
import javax.swing.Timer;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.RoundRectangle;
import Shapes.Shapes;
import Shapes.Triangle;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;

public class ShapePanel extends JPanel {
	public ShapePanel() {
	}
	
	//Properties
	int panelWidth;
	int panelHeight;
	int mouseX;
	int mouseY;
	private Timer timer = new Timer(9, new TimerAction());
	private int shapeToSpawnNumber;
	private List<Shapes> shapes = new ArrayList<Shapes>();
	private Rectangle rectangle;
	private Circle circle;
	private Triangle triangle;
	private RoundRectangle roundRectangle;
	Random random = new Random();

	@Override 
	public void paintComponent(Graphics g) {
		timer.start();
		super.paintComponent(g);//prevents graphics errors
		Graphics2D g2d = (Graphics2D) g;
		
		if (shapeToSpawnNumber == 1) {
			Rectangle rectangle = new Rectangle(mouseX, mouseY);
			rectangle.draw(g2d);
			shapes.add(rectangle);
			shapeToSpawnNumber = 0;
		}
		else if (shapeToSpawnNumber == 2) {
			Circle circle = new Circle(mouseX, mouseY);
			circle.draw(g2d);
			shapes.add(circle);
			shapeToSpawnNumber = 0;
		}
		else if (shapeToSpawnNumber == 3) {
			RoundRectangle roundRectangle = new RoundRectangle(mouseX, mouseY);
			roundRectangle.draw(g2d);
			shapes.add(roundRectangle);
			shapeToSpawnNumber = 0;
		}
		else if (shapeToSpawnNumber == 4) {
			Triangle triangle = new Triangle(mouseX, mouseY);
			triangle.draw(g2d);
			shapes.add(triangle);
			shapeToSpawnNumber = 0;
		}
		
		for(int i = 0; i < shapes.size(); i ++)
		{	 
			if (shapes.get(i) instanceof Rectangle)
			{
				rectangle = (Rectangle)shapes.get(i);
				rectangle.draw(g2d);
			}
			else if (shapes.get(i) instanceof Circle)
			{
				circle = (Circle)shapes.get(i);
				circle.draw(g2d);
			}
			else if (shapes.get(i) instanceof RoundRectangle)
			{
				roundRectangle = (RoundRectangle)shapes.get(i);
				roundRectangle.draw(g2d);
			}
			else if (shapes.get(i) instanceof Triangle)
			{
				triangle = (Triangle)shapes.get(i);
				triangle.draw(g2d);
			}
			// Call move methods
			shapes.get(i).move();
			
			// Call screen collison check method
			checkScreenCollision(i);
			
			// Call shape collison check method
			shapeCollision(i);
		}
	}
	
	// Timer
		public class TimerAction implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				ShapePanel.this.repaint();
			}	
		}
	// Set screen height and width
	public void setPanelWidthAndHeight(int height, int width) {
		this.panelHeight = height;
		this.panelWidth = width;
		
	}
	// Determine which shape spawns
	public void setShapeToSpawn(int shapeToSpawnNumber) {
		this.shapeToSpawnNumber = shapeToSpawnNumber;
	}
	// Set mouse x and y coordinates
	public void setMouseCoords(int x, int y) {
		mouseX = x;
		mouseY = y;
		
	}
	
	// See if shapes collide with the screen
	public void checkScreenCollision(int x) {
		if((shapes.get(x).getX() + shapes.get(x).getWidth()) >= panelWidth) {
			shapes.get(x).changeXDirection();
			shapes.get(x).setX(panelWidth - shapes.get(x).getWidth());
		}
		else if((shapes.get(x).getX()) <= 0) {
			shapes.get(x).changeXDirection();
			shapes.get(x).setX(0);
		}
		
		if((shapes.get(x).getY() + shapes.get(x).getHeight()) >= panelHeight) {
			shapes.get(x).changeYDirection();
			shapes.get(x).setY(panelHeight - shapes.get(x).getHeight());
		}
		else if((shapes.get(x).getY()) <= 0) {
			shapes.get(x).changeYDirection();
			shapes.get(x).setY(0);
		}
	}
	
	// See if shapes collide and set to move in opposite direction
	public void shapeCollision(int i) 
	{
		for(int x = 0; x < shapes.size(); x ++)
		{
			
			if(x != i)
			{
				//Change x direction if they collide				
				if(((shapes.get(x).getY() + shapes.get(x).getHeight()/2)  >= (shapes.get(i).getY() - shapes.get(i).getHeight()/2)) && 
				   ((shapes.get(x).getY() - shapes.get(x).getHeight()/2) <= (shapes.get(i).getY() + shapes.get(i).getHeight()/2)))
				{
					if((shapes.get(x).getX() - shapes.get(x).getWidth()/2 == (shapes.get(i).getX() + shapes.get(i).getWidth()/2) ||
					    shapes.get(x).getX() + shapes.get(x).getWidth()/2 == (shapes.get(i).getX() - shapes.get(i).getWidth()/2)))
					{
						if(shapes.get(i).getDX() == 0)
						{
							shapes.get(i).setDX(shapes.get(x).getDX() * -1);
							shapes.get(x).setDX(shapes.get(i).getDX() * -1);
						}
						shapes.get(i).changeXDirection();
						shapes.get(x).changeXDirection();
						}
					
					//Check if an object is inside another
					if((shapes.get(x).getX() <= (shapes.get(i).getX() + shapes.get(i).getWidth()/2) &&
					   (shapes.get(x).getX() >= (shapes.get(i).getX() - shapes.get(i).getWidth()/2))) &&
					   (shapes.get(x).getY() <= (shapes.get(i).getY() + shapes.get(i).getHeight()/2) &&
					   (shapes.get(x).getY() >= (shapes.get(i).getY() - shapes.get(i).getHeight()/2))))
					{
						shapes.get(x).setX(random.nextInt(panelWidth));
						shapes.get(x).setY(random.nextInt(panelHeight));
					}
				}
				
				//Change y direction if they collide
				if(((shapes.get(x).getX() + shapes.get(x).getWidth()/2)  >= (shapes.get(i).getX() - shapes.get(i).getWidth()/2)) && 
				   ((shapes.get(x).getX() - shapes.get(x).getWidth()/2) <= (shapes.get(i).getX() + shapes.get(i).getWidth()/2)))
				{
					if((shapes.get(x).getY() - shapes.get(x).getHeight()/2 == (shapes.get(i).getY() + shapes.get(i).getHeight()/2) ||
						shapes.get(x).getY() + shapes.get(x).getHeight()/2 == (shapes.get(i).getY() - shapes.get(i).getHeight()/2)))
					{	
						if(shapes.get(i).getDY() == 0)
						{
							shapes.get(i).setDY(shapes.get(x).getDY() * -1);
							shapes.get(x).setDY(shapes.get(i).getDY() * -1);
						}
						shapes.get(i).changeYDirection();
						shapes.get(x).changeYDirection();
					}
				}
			}
		}
	}
}
