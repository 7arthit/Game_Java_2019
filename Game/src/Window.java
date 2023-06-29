import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {
	public static void main(String[] args) {
		ran rd = new ran();
		rd.setVisible(true);
	}
}

@SuppressWarnings("serial")
class ran extends JFrame implements ActionListener {
	Icon xIcon1 = new ImageIcon(this.getClass().getResource("finnish.JPG"));
	Icon xIcon2 = new ImageIcon(this.getClass().getResource("lane.JPG"));
	Icon xIcon3 = new ImageIcon(this.getClass().getResource("stiltguy.gif"));
	JButton Button_Newgame = new JButton("New Game");
	JButton Button_Startstop = new JButton("Start/Stop");
	JButton xButton_Startstop = new JButton("Start/Stop");
	JLabel Label_Finnish = new JLabel();
	JLabel Label_Winner = new JLabel();
	JLabel Label_linefinnish = new JLabel(xIcon1);
	JLabel Label_linelane1 = new JLabel(xIcon2);
	JLabel Label_linelane2 = new JLabel(xIcon2);
	JLabel Label_linelane3 = new JLabel(xIcon2);
	JLabel Label_linestiltguy1 = new JLabel(xIcon3);
	JLabel Label_linestiltguy2 = new JLabel(xIcon3);
	JLabel Label_linestiltguy3 = new JLabel(xIcon3);
	JLabel Label_linestiltguy4 = new JLabel(xIcon3);
	JLabel one = new JLabel();
	JLabel two = new JLabel();
	JLabel three = new JLabel();
	JLabel four = new JLabel();
	Run th1, th2, th3, th4, Four_sleep;
	boolean flag;
	int sleep1, sleep2, sleep3, sleep4, sleep_min, sleep_max;
	int no_1, no_2, no_3, no_4;
	JLabel winner = new JLabel();

	public ran() {
		setSize(640, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setVisible(true);

		Button_Newgame.setForeground(Color.DARK_GRAY);
		Button_Newgame.setFont(new Font("Arial", Font.BOLD, 8));
		Button_Newgame.setBounds(15, 15, 80, 25);
		getContentPane().add(Button_Newgame);

		Button_Startstop.setBackground(SystemColor.control);
		Button_Startstop.setForeground(Color.GRAY);
		Button_Startstop.setFont(new Font("Arial", Font.BOLD, 8));
		Button_Startstop.setBounds(100, 15, 80, 25);
		getContentPane().add(Button_Startstop);

		Label_Finnish.setText("Finnish");
		Label_Finnish.setForeground(Color.DARK_GRAY);
		Label_Finnish.setFont(new Font("Arial", Font.BOLD, 10));
		Label_Finnish.setBounds(575, 0, 650, 355);
		getContentPane().add(Label_Finnish);

		Label_Winner.setText("Winner");
		Label_Winner.setForeground(Color.DARK_GRAY);
		Label_Winner.setFont(new Font("Arial", Font.BOLD, 10));
		Label_Winner.setBounds(200, 0, 650, 50);
		getContentPane().add(Label_Winner);

		Label_linefinnish.setBounds(230, 10, 650, 355);
		getContentPane().add(Label_linefinnish);

		Label_linelane1.setBounds(40, -25, 485, 300);
		getContentPane().add(Label_linelane1);

		Label_linelane2.setBounds(40, 50, 485, 300);
		getContentPane().add(Label_linelane2);

		Label_linelane3.setBounds(40, 125, 485, 300);
		getContentPane().add(Label_linelane3);

		Label_linestiltguy1.setBounds(5, 30, 30, 100);
		getContentPane().add(Label_linestiltguy1);

		Label_linestiltguy2.setBounds(5, 85, 30, 150);
		getContentPane().add(Label_linestiltguy2);

		Label_linestiltguy3.setBounds(5, 135, 30, 200);
		getContentPane().add(Label_linestiltguy3);

		Label_linestiltguy4.setBounds(5, 185, 30, 250);
		getContentPane().add(Label_linestiltguy4);

		one.setText("1");
		one.setForeground(Color.DARK_GRAY);
		one.setFont(new Font("Arial", Font.BOLD, 30));
		one.setBounds(275, 75, 650, 25);
		getContentPane().add(one);

		two.setText("2");
		two.setForeground(Color.DARK_GRAY);
		two.setFont(new Font("Arial", Font.BOLD, 30));
		two.setBounds(275, 150, 650, 25);
		getContentPane().add(two);

		three.setText("3");
		three.setForeground(Color.DARK_GRAY);
		three.setFont(new Font("Arial", Font.BOLD, 30));
		three.setBounds(275, 225, 650, 25);
		getContentPane().add(three);

		four.setText("4");
		four.setForeground(Color.DARK_GRAY);
		four.setFont(new Font("Arial", Font.BOLD, 30));
		four.setBounds(275, 300, 650, 25);
		getContentPane().add(four);

		th1 = new Run(Label_linestiltguy1, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th1.setSleep(new Random().nextInt(20) + 20);
		th1.start();
		th2 = new Run(Label_linestiltguy2, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th2.setSleep(new Random().nextInt(20) + 20);
		th2.start();
		th3 = new Run(Label_linestiltguy3, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th3.setSleep(new Random().nextInt(20) + 20);
		th3.start();
		th4 = new Run(Label_linestiltguy4, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th4.setSleep(new Random().nextInt(20) + 20);
		th4.start();
		this.flag = true;
		this.flag = false;
		Button_Newgame.addActionListener(this);
		xButton_Startstop.addActionListener(this);
		winner.setBounds(250, 15, 200, 20);
		winner.setFont(new Font("Arial", Font.BOLD, 10));
		getContentPane().add(winner);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Button_Newgame) {
			Newgame();
			start_stop();
			if (flag == true) {
				start_stop();
				flag = false;
			}
			score();

			xButton_Startstop.setForeground(Color.DARK_GRAY);
			xButton_Startstop.setFont(new Font("Arial", Font.BOLD, 8));
			xButton_Startstop.setBounds(100, 15, 80, 25);
			getContentPane().add(xButton_Startstop);

			Button_Startstop.setFont(new Font("Arial", Font.BOLD, 0));
			Button_Startstop.setBounds(0, 0, 0, 0);
		}
		if (e.getSource() == xButton_Startstop) {
			if (flag == false) {
				flag = true;
				th1.setFlag(true);
				th2.setFlag(true);
				th3.setFlag(true);
				th4.setFlag(true);
			} else {
				start_stop();
				flag = false;
			}
		}
	}

	private void Newgame() {
		Label_linestiltguy1.setLocation(5, 30);
		Label_linestiltguy2.setLocation(5, 85);
		Label_linestiltguy3.setLocation(5, 135);
		Label_linestiltguy4.setLocation(5, 185);

	}

	private void start_stop() {
		th1.setFlag(false);
		th2.setFlag(false);
		th3.setFlag(false);
		th4.setFlag(false);
	}

	private void score() {
		sleep1 = new Random().nextInt(50) + 1;
		sleep2 = new Random().nextInt(50) + 1;
		sleep3 = new Random().nextInt(50) + 1;
		sleep4 = new Random().nextInt(50) + 1;

		sleep_min = sleep1;

		for (int i = 0; i <= 4; i++) {

			if (sleep_min > sleep2) {
				sleep_min = sleep2;
			} else if (sleep_min > sleep3) {
				sleep_min = sleep3;
			} else if (sleep_min > sleep4) {
				sleep_min = sleep4;
			}

		}
		for (int i = 0; i <= 4; i++) {

			if (sleep_max < sleep2) {
				sleep_max = sleep2;
			} else if (sleep_max < sleep3) {
				sleep_max = sleep3;
			} else if (sleep_max < sleep4) {
				sleep_max = sleep4;
			}

		}
		if (sleep1 == sleep_min) {
			no_1++;
		} else if (sleep2 == sleep_min) {
			no_2++;
		} else if (sleep3 == sleep_min) {
			no_3++;
		} else if (sleep4 == sleep_min) {
			no_4++;
		}
		th1 = new Run(Label_linestiltguy1, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th1.setSleep(sleep1);
		th1.start();
		th2 = new Run(Label_linestiltguy2, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th2.setSleep(sleep2);
		th2.start();
		th3 = new Run(Label_linestiltguy3, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th3.setSleep(sleep3);
		th3.start();
		th4 = new Run(Label_linestiltguy4, winner, sleep1, sleep2, sleep3, sleep4, no_1, no_2, no_3, no_4, sleep_min,
				sleep_max);
		th4.setSleep(sleep4);
		th4.start();
	}
}

class Run extends Thread {
	JLabel jLabel;
	JLabel winner;
	private int sleep = 0;
	private boolean flag = false;
	int sleep1, sleep2, sleep3, sleep4;
	int sleep_min, sleep_max;
	int no_1, no_2, no_3, no_4;

	public Run(JLabel label, JLabel winner, int one, int two, int three, int four, int sum1, int sum2, int sum3,
			int sum4, int min, int max) {
		this.jLabel = label;
		this.winner = winner;
		this.sleep1 = one;
		this.sleep2 = two;
		this.sleep3 = three;
		this.sleep4 = four;
		this.no_1 = sum1;
		this.no_2 = sum2;
		this.no_3 = sum3;
		this.no_4 = sum4;
		this.sleep_min = min;
		this.sleep_max = max;
	}

	@Override
	public void run() {
		while (true) {
			if (flag) {
				jLabel.setLocation(jLabel.getX() + 1, jLabel.getY());
				if (jLabel.getX() > 575) {
					jLabel.setLocation(575, jLabel.getY());
				}
				if (jLabel.getX() > 545) {
					winner.setText("No.1 : " + no_1 + " No2 :  " + no_2 + " No3 :  " + no_3 + " No4 : " + no_4);
				}
			}
			try {
				Thread.sleep(sleep);
			} catch (Exception e) {
			}
		}
	}

	int getSleep() {
		return sleep;
	}

	void setSleep(int sleep) {
		this.sleep = sleep;
	}

	boolean isFlag() {
		return flag;
	}

	void setFlag(boolean flag) {
		this.flag = flag;
	}
}