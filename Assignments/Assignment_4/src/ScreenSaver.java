// Imports
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ScreenSaver {

	// Variables
	Random random = new Random();
	private JFrame frmAndrewsScreensaver;
	ShapePanel shapePanel = new ShapePanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenSaver window = new ScreenSaver();
					window.frmAndrewsScreensaver.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenSaver() {
		frmAndrewsScreensaver = new JFrame();
		frmAndrewsScreensaver.setTitle("Andrew's Screensaver");
		frmAndrewsScreensaver.setBounds(100, 100, 803, 517);
		frmAndrewsScreensaver.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		shapePanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				shapePanel.setMouseCoords(arg0.getX(), arg0.getY());
				shapePanel.setShapeToSpawn(random.nextInt(4) + 1);
			}
		});
		shapePanel.setBounds(0, 0, 788, 481);
		shapePanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				shapePanel.setPanelWidthAndHeight(shapePanel.getHeight(), shapePanel.getWidth());
			}
		});

		shapePanel.setBackground(Color.BLACK);
		shapePanel.setPanelWidthAndHeight(shapePanel.getHeight(), shapePanel.getWidth());
		
		frmAndrewsScreensaver.getContentPane().add(shapePanel);
	}
}
