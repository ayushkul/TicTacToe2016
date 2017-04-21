import jaco.mp3.player.MP3Player;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Game extends JFrame {

	private JPanel contentPane;

	JButton btn1 = new JButton("");
	JButton btn2 = new JButton("");
	JButton btn3 = new JButton("");
	JButton btn4 = new JButton("");
	JButton btn5 = new JButton("");
	JButton btn6 = new JButton("");
	JButton btn7 = new JButton("");
	JButton btn8 = new JButton("");
	JButton btn9 = new JButton("");
	boolean print=false;
	public static void main(String[] args) {
		
					Game frame = new Game();
					frame.setVisible(true);
				
	}

	public Game() {
		setTitle("TicTAcToe 2016");
		setBackground(Color.YELLOW);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 317);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXor0(btn1);
			}
		});
		btn1.setBounds(10, 11, 100, 81);
		contentPane.add(btn1);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn2);
			}
		});
		btn2.setBounds(120, 11, 100, 81);
		contentPane.add(btn2);
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn3);
			}
		});
		btn3.setBounds(230, 11, 100, 81);
		contentPane.add(btn3);
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn4);
			}
		});
	    btn4.setBounds(10, 103, 100, 81);
		contentPane.add(btn4);
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn5);
			}
		});
		btn5.setBounds(120, 103, 100, 81);
		contentPane.add(btn5);
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn6);
			}
		});
		btn6.setBounds(230, 100, 100, 84);
		contentPane.add(btn6);
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn7);
			}
		});
		btn7.setBounds(10, 195, 100, 81);
		contentPane.add(btn7);
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn8);
			}
		});
		btn8.setBounds(120, 195, 100, 81);
		contentPane.add(btn8);
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              printXor0(btn9);
			}
		});
		btn9.setBounds(230, 195, 100, 81);
		contentPane.add(btn9);
		
		JLabel lblNewLabel = new JLabel("Tic\n");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		lblNewLabel.setBounds(386, 56, 65, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tac");
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(386, 115, 65, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblToe = new JLabel("Toe");
		lblToe.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
		lblToe.setBounds(386, 173, 65, 36);
		contentPane.add(lblToe);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 RESET();
			}
		});
		btnReset.setBounds(412, 253, 89, 23);
		contentPane.add(btnReset);
		RESET();
	}
   private void printXor0(JButton btn){
	   if(btn.getText().trim().length()==0){
		   if(print)
		    btn.setText("X");
	   else
		   btn.setText("0");
       btn.setFont(new Font("Showcard Gothic",Font.PLAIN,28));
   }
   print=!print;
   result(btn);
   
   }
   
   private void result(JButton btn){
	   String c=btn.getText();
	   if((btn2.getText()==btn5.getText()&&btn5.getText()==btn8.getText())||
		  (btn1.getText()==btn2.getText()&&btn2.getText()==btn3.getText()||
		  (btn4.getText()==btn5.getText()&&btn5.getText()==btn6.getText())||
		  (btn7.getText()==btn8.getText()&&btn8.getText()==btn9.getText())||
		  (btn1.getText()==btn4.getText()&&btn4.getText()==btn7.getText())||
		  (btn3.getText()==btn6.getText()&&btn6.getText()==btn9.getText())||
		  (btn1.getText()==btn5.getText()&&btn5.getText()==btn9.getText())||
		  (btn3.getText()==btn5.getText()&&btn5.getText()==btn7.getText()))  ){
		   MP3Player mp3=new MP3Player(Game.class.getResource("win.mp3"));
		   mp3.play();
		    JOptionPane.showMessageDialog(this, "Player "+c+" Won :)");
	   }
   }
   private void RESET(){
		btn1.setText("");
		btn2.setText(" ");
		btn3.setText("  ");
		btn4.setText("  ");
		btn5.setText(" ");
		btn6.setText("");
		btn7.setText(" ");
		btn8.setText("  ");
		btn9.setText("  ");
		
   }
}
