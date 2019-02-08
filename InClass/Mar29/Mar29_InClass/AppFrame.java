import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;


public class AppFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmpType;
	private JTextField txtTotalPay;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFrame frame = new AppFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppFrame() {
		setTitle("Poly Cracker Company Payroll System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_16570159639999");
		panel_1.setLayout(null);
		
		final JComboBox cboName = new JComboBox();
		cboName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		cboName.setModel(new DefaultComboBoxModel(new String[] {"Bob Loblaw", "Sue Me", "Tina Zena", "Richard Rich"}));
		cboName.setBounds(29, 70, 128, 29);
		panel_1.add(cboName);
		
		
		txtEmpType = new JTextField();
		txtEmpType.setBounds(187, 70, 105, 29);
		panel_1.add(txtEmpType);
		txtEmpType.setColumns(10);
		
		JLabel lblEmpType = new JLabel("Employee Type:");
		lblEmpType.setBounds(187, 45, 105, 14);
		panel_1.add(lblEmpType);
		
		JLabel lblNewLabel = new JLabel("Employee Name");
		lblNewLabel.setBounds(29, 42, 122, 20);
		panel_1.add(lblNewLabel);
		
		JButton btnCalcPay = new JButton("Calc Pay");
		btnCalcPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCalcPay.setBounds(29, 138, 128, 29);
		panel_1.add(btnCalcPay);
		
		JLabel lblTotalPay = new JLabel("Total Pay:");
		lblTotalPay.setBounds(187, 120, 105, 14);
		panel_1.add(lblTotalPay);
		
		txtTotalPay = new JTextField();
		txtTotalPay.setColumns(10);
		txtTotalPay.setBounds(187, 138, 105, 29);
		panel_1.add(txtTotalPay);
		
		JLabel lblPayRpt = new JLabel("Payroll Report:");
		lblPayRpt.setBounds(354, 45, 105, 14);
		panel_1.add(lblPayRpt);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(315, 93, 270, 187);
		panel_1.add(scrollPane);
		
		final JTextArea textAreaReport = new JTextArea();
		scrollPane.setViewportView(textAreaReport);
		
		JButton btnPayRpt = new JButton("Make Report");
		btnPayRpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnPayRpt.setBounds(29, 278, 128, 23);
		panel_1.add(btnPayRpt);
		

		
	
	}
}
