package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sonuc_ekranı;
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
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
	public calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sonuc_ekranı = new JTextField();
		sonuc_ekranı.setBounds(10, 32, 343, 64);
		contentPane.add(sonuc_ekranı);
		sonuc_ekranı.setColumns(10);
		
		JButton btn_b = new JButton("DEL");
		btn_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonuc_ekranı.setText(null);
			
			}
		});
		btn_b.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_b.setBounds(10, 127, 66, 57);
		contentPane.add(btn_b);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_7.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_7.setBounds(10, 192, 66, 57);
		contentPane.add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_4.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_4.setBounds(10, 259, 66, 57);
		contentPane.add(btn_4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn1.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(10, 326, 66, 57);
		contentPane.add(btn1);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_0.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_0.setBounds(10, 393, 66, 57);
		contentPane.add(btn_0);
		
		JButton btn_C = new JButton("C");
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonuc_ekranı.setText(null);
			}
		});
		btn_C.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_C.setBounds(96, 127, 66, 57);
		contentPane.add(btn_C);
		
		JButton BTN_00 = new JButton("00");
		BTN_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+BTN_00.getText();
				sonuc_ekranı.setText(number);
			}
		});
		BTN_00.setFont(new Font("Tahoma", Font.BOLD, 15));
		BTN_00.setBounds(184, 127, 66, 57);
		contentPane.add(BTN_00);
		
		JButton btn_arti = new JButton("+");
		btn_arti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(sonuc_ekranı.getText());
				sonuc_ekranı.setText("");
				operation="+";
			}
		});
		btn_arti.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_arti.setBounds(271, 127, 66, 57);
		contentPane.add(btn_arti);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_9.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_9.setBounds(184, 192, 66, 57);
		contentPane.add(btn_9);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_8.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_8.setBounds(96, 192, 66, 57);
		contentPane.add(btn_8);
		
		JButton btn_eksi = new JButton("-");
		btn_eksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(sonuc_ekranı.getText());
				sonuc_ekranı.setText("");
				operation="-";
			}
		});
		btn_eksi.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_eksi.setBounds(271, 192, 66, 57);
		contentPane.add(btn_eksi);
		
		JButton btn_carpi = new JButton("X");
		btn_carpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(sonuc_ekranı.getText());
				sonuc_ekranı.setText("");
				operation="*";
			}
		});
		btn_carpi.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_carpi.setBounds(271, 259, 66, 57);
		contentPane.add(btn_carpi);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_6.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_6.setBounds(184, 259, 66, 57);
		contentPane.add(btn_6);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_5.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_5.setBounds(96, 259, 66, 57);
		contentPane.add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_2.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_2.setBounds(96, 326, 66, 57);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_3.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_3.setBounds(184, 326, 66, 57);
		contentPane.add(btn_3);
		
		JButton btn_bolu = new JButton("/");
		btn_bolu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(sonuc_ekranı.getText());
				sonuc_ekranı.setText("");
				operation="/";
			}
		});
		btn_bolu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_bolu.setBounds(271, 326, 66, 57);
		contentPane.add(btn_bolu);
		
		JButton btn_nokta = new JButton(".");
		btn_nokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=sonuc_ekranı.getText()+btn_nokta.getText();
				sonuc_ekranı.setText(number);
			}
		});
		btn_nokta.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_nokta.setBounds(96, 393, 66, 57);
		contentPane.add(btn_nokta);
		
		JButton btn_esit = new JButton("=");
		btn_esit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(sonuc_ekranı.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					sonuc_ekranı.setText(answer);
				}
				else if(operation=="-") 
				{
					result=first-second;
					answer=String.format("%.2f",result);
					sonuc_ekranı.setText(answer);
				}
				
				else if(operation=="*") 
				{
					result=first*second;
					answer=String.format("%.2f",result);
					sonuc_ekranı.setText(answer);
				}
				
				else if(operation=="/") 
				{
					result=first/second;
					answer=String.format("%.2f",result);
					sonuc_ekranı.setText(answer);
				}
				
				else if(operation=="%") 
				{
					result=first%second;
					answer=String.format("%.2f",result);
					sonuc_ekranı.setText(answer);
				}
				
				
				
				
				
				
				
			}
		});
		btn_esit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_esit.setBounds(184, 393, 66, 57);
		contentPane.add(btn_esit);
		
		JButton btn_yuzde = new JButton("%");
		btn_yuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(sonuc_ekranı.getText());
				sonuc_ekranı.setText("");
				operation="%";
			}
		});
		btn_yuzde.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_yuzde.setBounds(271, 393, 66, 57);
		contentPane.add(btn_yuzde);
	}
}
