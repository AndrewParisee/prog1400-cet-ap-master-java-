import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.*;

public class TestPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public TestPanel() {
		setLayout(null);
		
		JLabel lblTestPanel = new JLabel("Test Panel");
		lblTestPanel.setBounds(10, 10, 680, 25);
		lblTestPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestPanel.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(lblTestPanel);

	}
	
	@Override public void paintComponent(Graphics g)
	{
		super.paintComponent(g);//prevents graphics errors
		Graphics2D g2d = (Graphics2D) g;
		
		// Shape #1
		g2d.setPaint(new GradientPaint(5,30,Color.BLUE,35,100,Color.YELLOW,true));
		g2d.fill(new Ellipse2D.Double(310,35,65,100));
		
		// Shape #2
		g2d.setPaint(Color.BLUE);
		g2d.fill(new Rectangle2D.Double(95,30,85,100));
		
		// Shape #3
		g2d.setPaint(Color.GREEN);
		g2d.draw(new Line2D.Double(425,75,326,160));
		
		// Shape #4
		BufferedImage buffImage = new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
		Graphics2D gg = buffImage.createGraphics();		
		gg.setColor(Color.BLACK);
		gg.fillRect(0,0,10,10);
		gg.setColor(Color.CYAN);
		gg.drawRect(1, 1, 6, 6);
		gg.setColor(Color.GREEN);
		gg.fillRect(1, 1, 6, 6);

		g2d.setPaint(new TexturePaint(buffImage,new Rectangle(10,10)));
		g2d.fill(new RoundRectangle2D.Double(155,175,75,100,50,50));
		
		// Shape #5
		BufferedImage buffImage2 = new BufferedImage(10,10,BufferedImage.TYPE_INT_RGB);
		Graphics2D gg1 = buffImage2.createGraphics();		
		gg1.setColor(Color.BLACK);
		gg1.fillRect(0,0,10,10);
		gg1.setColor(Color.GREEN);
		gg1.drawRect(1, 1, 6, 6);
		gg1.setColor(Color.CYAN);
		gg1.fillRect(1, 1, 6, 6);

		g2d.setPaint(new TexturePaint(buffImage2,new Rectangle(10,10)));
		g2d.fill(new RoundRectangle2D.Double(455,175,75,100,25,25));

	}
}
