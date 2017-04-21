import jaco.mp3.player.MP3Player;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Window.Type;


public class SplashScreen extends JFrame {

	int progressValue=0;
	private JPanel contentPane;
	boolean isVisible=true;
	JLabel lblTicTacToe = new JLabel("Tic Tac Toe 2016");
	JProgressBar progressBar = new JProgressBar();
	Timer timer;
	 MP3Player mp3=new MP3Player(SplashScreen.class.getResource("bmb.mp3"));
	Icon icon=new ImageIcon(SplashScreen.class.getResource("giphy.gif"));
	public static void main(String[] args) throws InterruptedException {
		SplashScreen Screen=new SplashScreen();
		Screen.setVisible(true);
		Screen.playsong();
		Screen.doAnimation();
		
	}

	public SplashScreen() {
		setType(Type.UTILITY);
		setTitle("TicTacToe");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 386);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel imglbl = new JLabel("");
		imglbl.setIcon(icon);
		imglbl.setBounds(38, 21, 429, 220);
		getContentPane().add(imglbl);

		lblTicTacToe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicTacToe.setForeground(Color.RED);
		lblTicTacToe.setFont(new Font("Magneto", Font.PLAIN, 30));
		lblTicTacToe.setBackground(Color.GREEN);
		lblTicTacToe.setBounds(76, 252, 337, 36);
		contentPane.add(lblTicTacToe);
		
		progressBar.setStringPainted(true);
		progressBar.setBounds(109, 299, 274, 20);
		contentPane.add(progressBar);
		
		
		
	}
   void playsong(){
	 
	  mp3.play();
	  
  }
  private void doAnimation() throws InterruptedException{
	
	 for(progressValue=0;progressValue<=100;progressValue++){
	    progressBar.setValue(progressValue);
	    lblTicTacToe.setVisible(isVisible);
	    Thread.sleep(125L);
	    isVisible=!isVisible;
	 }
	 if(progressValue>100){
			SplashScreen.this.setVisible(false);
			SplashScreen.this.dispose();
			Game toe = new Game();
			toe.setVisible(true);
			mp3.stop();
	 }
		
		
	 }

		 
	 
	  
  }

