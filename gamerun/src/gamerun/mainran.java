package gamerun;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainran {
	public static void main(String[] args) {
		ran rd = new ran();
		rd.setVisible(true);
	}
}

class ran extends JFrame implements ActionListener {
	Icon xIcon1 = new ImageIcon(this.getClass().getResource("Stadiumd.png"));
	Icon xRun1 = new ImageIcon(this.getClass().getResource("cookie1.gif"));
	Icon xRun2 = new ImageIcon(this.getClass().getResource("cookie2.gif"));
	Icon xRun3 = new ImageIcon(this.getClass().getResource("cookie3.gif"));
	Icon xRun4 = new ImageIcon(this.getClass().getResource("cookie4.gif"));
	Icon xRun5 = new ImageIcon(this.getClass().getResource("cookie5.gif"));
	Icon xRun6 = new ImageIcon(this.getClass().getResource("cookie6.gif"));
	Icon xRun7 = new ImageIcon(this.getClass().getResource("cookie7.gif"));
	Icon xRun8 = new ImageIcon(this.getClass().getResource("cookie8.gif"));
	Icon xRun9 = new ImageIcon(this.getClass().getResource("cookie9.gif"));
	Icon xRun10 = new ImageIcon(this.getClass().getResource("cookie10.gif"));
	Icon xRun11 = new ImageIcon(this.getClass().getResource("cookie11.gif"));
	Icon xRun12 = new ImageIcon(this.getClass().getResource("cookie12.gif"));
	JButton startBtn = new JButton("start");
	JLabel Label_Stadium = new JLabel(xIcon1);
	JLabel Label_runner1_1 = new JLabel(xRun1);
	JLabel Label_runner1_2 = new JLabel(xRun2);
	JLabel Label_runner1_3 = new JLabel(xRun3);
	JLabel Label_runner2_1 = new JLabel(xRun4);
	JLabel Label_runner2_2 = new JLabel(xRun5);
	JLabel Label_runner2_3 = new JLabel(xRun6);
	JLabel Label_runner3_1 = new JLabel(xRun7);
	JLabel Label_runner3_2 = new JLabel(xRun8);
	JLabel Label_runner3_3 = new JLabel(xRun9);
	JLabel Label_runner4_1 = new JLabel(xRun10);
	JLabel Label_runner4_2 = new JLabel(xRun11);
	JLabel Label_runner4_3 = new JLabel(xRun12);
	JLabel winner = new JLabel();
	JLabel winner1 = new JLabel();
	JLabel winner2 = new JLabel();
	JLabel winner3 = new JLabel();
	JLabel winner_finish = new JLabel();
	JLabel time = new JLabel();
	JLabel Label_Time1 = new JLabel();
	JLabel Label_Time2 = new JLabel();
	JLabel Label_Time3 = new JLabel();
	JLabel Label_Winner = new JLabel();

	int xsleep;

	Run t1, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
	Run1 t2 ;
	private boolean flag;
	int sleep1, sleep2, sleep3, sleep4, sleep_min, sleep_max;
	int no_1, no_2, no_3, no_4;

	public ran() {
		setTitle("Cookie Run");
		setSize(1064, 544);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setVisible(true);

		startBtn.setForeground(Color.DARK_GRAY);
		startBtn.setFont(new Font("Arial", Font.BOLD, 10));
		startBtn.setBounds(50, 15, 80, 25);
		getContentPane().add(startBtn);

		Label_Time1.setText("Time1");
		Label_Time1.setForeground(Color.DARK_GRAY);
		Label_Time1.setFont(new Font("Arial", Font.BOLD, 10));
		Label_Time1.setBounds(350, 0, 650, 50);
		getContentPane().add(Label_Time1);

		Label_Time2.setText("Time2");
		Label_Time2.setForeground(Color.DARK_GRAY);
		Label_Time2.setFont(new Font("Arial", Font.BOLD, 10));
		Label_Time2.setBounds(500, 0, 650, 50);
		getContentPane().add(Label_Time2);

		Label_Time3.setText("Time3");
		Label_Time3.setForeground(Color.DARK_GRAY);
		Label_Time3.setFont(new Font("Arial", Font.BOLD, 10));
		Label_Time3.setBounds(650, 0, 650, 50);
		getContentPane().add(Label_Time3);

		Label_Winner.setText("Winner");
		Label_Winner.setForeground(Color.DARK_GRAY);
		Label_Winner.setFont(new Font("Arial", Font.BOLD, 10));
		Label_Winner.setBounds(900, 0, 650, 50);
		getContentPane().add(Label_Winner);

		Label_runner1_1.setBounds(100, 125, 500, 500);
		getContentPane().add(Label_runner1_1);

		Label_runner1_2.setBounds(170, 175, 500, 500);
		getContentPane().add(Label_runner1_2);

		Label_runner1_3.setBounds(240, 225, 500, 500);
		getContentPane().add(Label_runner1_3);

		Label_runner2_1.setBounds(655, 30, 500, 500);
		getContentPane().add(Label_runner2_1);

		Label_runner2_2.setBounds(715, -30, 500, 500);
		getContentPane().add(Label_runner2_2);

		Label_runner2_3.setBounds(775, -100, 500, 500);
		getContentPane().add(Label_runner2_3);

		Label_runner3_1.setBounds(425, -70, 500, 500);
		getContentPane().add(Label_runner3_1);

		Label_runner3_2.setBounds(365, -120, 500, 500);
		getContentPane().add(Label_runner3_2);

		Label_runner3_3.setBounds(305, -170, 500, 500);
		getContentPane().add(Label_runner3_3);

		Label_runner4_1.setBounds(-100, 30, 500, 500);
		getContentPane().add(Label_runner4_1);

		Label_runner4_2.setBounds(-160, 100, 500, 500);
		getContentPane().add(Label_runner4_2);

		Label_runner4_3.setBounds(-220, 170, 500, 500);
		getContentPane().add(Label_runner4_3);

		Label_Stadium.setBounds(-262, -50, 1574, 668);
		getContentPane().add(Label_Stadium);

		xsleep = new Random().nextInt(40) + 20;

		t1 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t1.setSleep(xsleep);
		t1.start();

		t2 = new Run1(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t2.setSleep(xsleep);
		t2.start();

		t3 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t3.setSleep(xsleep);
		t3.start();

		t4 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t4.setSleep(xsleep);
		t4.start();

		t5 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t5.setSleep(xsleep);
		t5.start();

		t6 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t6.setSleep(xsleep);
		t6.start();

		t7 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t7.setSleep(xsleep);
		t7.start();

		t8 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t8.setSleep(xsleep);
		t8.start();

		t9 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t9.setSleep(xsleep);
		t9.start();

		t10 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t10.setSleep(xsleep);
		t10.start();

		t11 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t11.setSleep(xsleep);
		t11.start();

		t12 = new Run(Label_runner1_1, Label_runner1_2, Label_runner1_3, Label_runner2_1, Label_runner2_2,
				Label_runner2_3, Label_runner3_1, Label_runner3_2, Label_runner3_3, Label_runner4_1, Label_runner4_2,
				Label_runner4_3, winner, winner1, winner2, winner3, winner_finish);
		t12.setSleep(xsleep);
		t12.start();

		this.flag = true;
		this.flag = false;
		startBtn.addActionListener(this);

		winner.setBounds(200, 15, 200, 20);
		winner.setFont(new Font("Arial", Font.BOLD, 10));
		getContentPane().add(winner);

		winner1.setBounds(350, 35, 200, 20);
		winner1.setFont(new Font("Arial", Font.BOLD, 10));
		getContentPane().add(winner1);

		winner2.setBounds(500, 35, 200, 20);
		winner2.setFont(new Font("Arial", Font.BOLD, 10));
		getContentPane().add(winner2);

		winner3.setBounds(650, 35, 200, 20);
		winner3.setFont(new Font("Arial", Font.BOLD, 10));
		getContentPane().add(winner3);

		winner_finish.setBounds(900, 18, 650, 50);
		winner_finish.setFont(new Font("Arial", Font.BOLD, 10));
		getContentPane().add(winner_finish);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startBtn) {
			if (flag == false) {
				flag = true;
				t1.setFlag(true);
				t2.setFlag(true);
				t3.setFlag(true);
				t4.setFlag(true);
				t5.setFlag(true);
				t6.setFlag(true);
				t7.setFlag(true);
				t8.setFlag(true);
				t9.setFlag(true);
				t10.setFlag(true);
				t11.setFlag(true);
				t12.setFlag(true);
				startBtn.setText("STOP");
			} else {
				stop();
				startBtn.setText("START");
				flag = false;
			}
		}
	}

	private void stop() {
		t1.setFlag(false);
		t2.setFlag(false);
		t3.setFlag(false);
		t4.setFlag(false);
		t5.setFlag(false);
		t6.setFlag(false);
		t7.setFlag(false);
		t8.setFlag(false);
		t9.setFlag(false);
		t10.setFlag(false);
		t11.setFlag(false);
		t12.setFlag(false);
	}

}

class Run extends Thread {
	JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11,
			jLabel12, jwinner, jwinner1, jwinner2, jwinner3, jwinner_finish;
	private int sleep = 0;
	private boolean flag = false;
	public int first = 0, first1, first2, first3, sss;
	public int min = 0, min1, min2, min3;
	public int sec = 0, sec1, sec2, sec3;
	public int ms = 0, ms1, ms2, ms3;

	public Run(JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JLabel label6, JLabel label7,
			JLabel label8, JLabel label9, JLabel label10, JLabel label11, JLabel label12, JLabel winner, JLabel winner1,
			JLabel winner2, JLabel winner3, JLabel finish) {
		this.jLabel1 = label1;
		this.jLabel2 = label2;
		this.jLabel3 = label3;
		this.jLabel4 = label4;
		this.jLabel5 = label5;
		this.jLabel6 = label6;
		this.jLabel7 = label7;
		this.jLabel8 = label8;
		this.jLabel9 = label9;
		this.jLabel10 = label10;
		this.jLabel11 = label11;
		this.jLabel12 = label12;
		this.jwinner = winner;
		this.jwinner1 = winner1;
		this.jwinner2 = winner2;
		this.jwinner3 = winner3;
		this.jwinner_finish = finish;
	}

	@Override
	public void run() {
		while (true) {
			if (flag) {
				String msFm = String.format("%02d", ms);
				String secFm = String.format("%01d", sec);
				String minFm = String.format("%01d", min);
				String msFm1 = String.format("%01d", ms1);
				String secFm1 = String.format("%01d", sec1);
				String minFm1 = String.format("%01d", min1);
				String msFm2 = String.format("%01d", ms2);
				String secFm2 = String.format("%01d", sec2);
				String minFm2 = String.format("%01d", min2);
				String msFm3 = String.format("%01d", ms3);
				String secFm3 = String.format("%01d", sec3);
				String minFm3 = String.format("%01d", min3);

				if (jLabel12.getX() < 295) {
					first++;
					ms = first;
				} else {
					first = 0;
					sleep = 0;
				}
				if (first > 59) {
					first = 0;
					ms++;
					sec++;

				} else if (sec > 59) {
					sec = 0;
					min++;
				} else {
				}

				if (jLabel10.getX() < 295) {
					first1++;
					ms1 = first1;
				} else
					first1 = 0;
				if (first1 > 59) {
					first1 = 0;
					ms1++;
					sec1++;

				} else if (sec1 > 59) {
					sec1 = 0;
					min1++;
				} else {
				}

				if (jLabel11.getX() < 295) {
					first2++;
					ms2 = first2;
				} else
					first2 = 0;
				if (first2 > 59) {
					first2 = 0;
					ms2++;
					sec2++;

				} else if (sec2 > 59) {
					sec2 = 0;
					min2++;
				} else {
				}

				if (jLabel12.getX() < 295) {
					first3++;
					ms3 = first3;
				} else
					first3 = 0;
				if (first3 > 59) {
					first3 = 0;
					ms3++;
					sec3++;

				} else if (sec3 > 59) {
					sec3 = 0;
					min3++;
				} else {
				}
				jwinner.setText(minFm + ":" + secFm + ":" + msFm);

				jLabel1.setLocation(jLabel1.getX() + 1, jLabel1.getY());
				jLabel2.setLocation(jLabel2.getX() + 1, jLabel2.getY());
				jLabel3.setLocation(jLabel3.getX() + 1, jLabel3.getY());
				if (jLabel1.getX() > 650) {
					jLabel1.setLocation(650, jLabel1.getY());
					jLabel1.setLocation(jLabel1.getX(), jLabel1.getY() - 1);

					if (jLabel1.getY() < 30) {
						jLabel1.setLocation(jLabel1.getX(), 30);
						jLabel4.setLocation(jLabel4.getX(), jLabel4.getY() - 1);

						if (jLabel4.getY() < -65) {
							jLabel4.setLocation(jLabel4.getX(), -65);
							jLabel4.setLocation(jLabel4.getX() - 1, jLabel4.getY());

							if (jLabel4.getX() < 430) {
								jLabel4.setLocation(430, jLabel4.getY());
								jLabel7.setLocation(jLabel7.getX() - 1, jLabel7.getY());

								if (jLabel7.getX() < -100) {
									jLabel7.setLocation(-100, jLabel7.getY());
									jLabel7.setLocation(jLabel7.getX(), jLabel7.getY() + 1);

									if (jLabel7.getY() > 30) {
										jLabel7.setLocation(jLabel7.getX(), 30);
										jLabel10.setLocation(jLabel10.getX(), jLabel10.getY() + 1);

										if (jLabel10.getY() > 125) {
											jLabel10.setLocation(jLabel10.getX(), 125);
											jLabel10.setLocation(jLabel10.getX() + 1, jLabel10.getY());

											if (jLabel10.getX() > 295) {
												jLabel10.setLocation(295, jLabel10.getY());

												jwinner1.setText(minFm1 + ":" + secFm1 + ":" + msFm1);

											}

										}
									}

								}
							}
						}
					}
				}
				if (jLabel2.getX() > 705) {
					jLabel2.setLocation(705, jLabel2.getY());

					jLabel2.setLocation(jLabel2.getX(), jLabel2.getY() - 1);

					if (jLabel2.getY() < -30) {
						jLabel2.setLocation(jLabel2.getX(), -30);
						jLabel5.setLocation(jLabel5.getX(), jLabel5.getY() - 1);

						if (jLabel5.getY() < -120) {
							jLabel5.setLocation(jLabel5.getX(), -120);
							jLabel5.setLocation(jLabel5.getX() - 1, jLabel5.getY());

							if (jLabel5.getX() < 375) {
								jLabel5.setLocation(375, jLabel5.getY());
								jLabel8.setLocation(jLabel8.getX() - 1, jLabel8.getY());

								if (jLabel8.getX() < -165) {
									jLabel8.setLocation(-165, jLabel8.getY());
									jLabel8.setLocation(jLabel8.getX(), jLabel8.getY() + 1);

									if (jLabel8.getY() > 100) {
										jLabel8.setLocation(jLabel8.getX(), 100);
										jLabel11.setLocation(jLabel11.getX(), jLabel11.getY() + 1);

										if (jLabel11.getY() > 175) {
											jLabel11.setLocation(jLabel11.getX(), 175);
											jLabel11.setLocation(jLabel11.getX() + 1, jLabel11.getY());

											if (jLabel11.getX() > 295) {
												jLabel11.setLocation(295, jLabel11.getY());

												jwinner2.setText(minFm2 + ":" + secFm2 + ":" + msFm2);
											}

										}
									}
								}
							}
						}
					}

				}
				if (jLabel3.getX() > 765) {
					jLabel3.setLocation(765, jLabel3.getY());
					jLabel3.setLocation(jLabel3.getX(), jLabel3.getY() - 1);

					if (jLabel3.getY() < -100) {
						jLabel3.setLocation(jLabel3.getX(), -100);
						jLabel6.setLocation(jLabel6.getX(), jLabel6.getY() - 1);

						if (jLabel6.getY() < -165) {
							jLabel6.setLocation(jLabel6.getX(), -165);
							jLabel6.setLocation(jLabel6.getX() - 1, jLabel6.getY());

							if (jLabel6.getX() < 315) {
								jLabel6.setLocation(315, jLabel6.getY());
								jLabel9.setLocation(jLabel9.getX() - 1, jLabel9.getY());

								if (jLabel9.getX() < -225) {
									jLabel9.setLocation(-225, jLabel9.getY());
									jLabel9.setLocation(jLabel9.getX(), jLabel9.getY() + 1);

									if (jLabel9.getY() > 170) {
										jLabel9.setLocation(jLabel9.getX(), 170);
										jLabel12.setLocation(jLabel12.getX(), jLabel12.getY() + 1);

										if (jLabel12.getY() > 225) {
											jLabel12.setLocation(jLabel12.getX(), 225);
											jLabel12.setLocation(jLabel12.getX() + 1, jLabel12.getY());

											if (jLabel12.getX() > 295) {
												jLabel12.setLocation(295, jLabel12.getY());
												jwinner3.setText(minFm3 + ":" + secFm3 + ":" + msFm3);
											}
										}
									}
								}
							}
						}
					}

				}

				if (min1 < min2 && min1 < min3) {
					jwinner_finish.setText("Team1");
				} else if (min2 < min1 && min2 < min3) {
					jwinner_finish.setText("Team2");
				} else if (min3 < min1 && min3 < min2) {
					jwinner_finish.setText("Team3");
				} else {
					if (sec1 < sec2 && sec1 < sec3) {
						jwinner_finish.setText("Team1");
					} else if (sec2 < sec1 && sec2 < sec3) {
						jwinner_finish.setText("Team2");
					} else if (sec3 < sec1 && sec3 < sec2) {
						jwinner_finish.setText("Team3");
					} else {
						if (ms1 < ms2 && ms1 < ms3) {
							jwinner_finish.setText("Team1");
						} else if (ms2 < ms1 && ms2 < ms3) {
							jwinner_finish.setText("Team2");
						} else if (ms3 < ms1 && ms3 < ms2) {
							jwinner_finish.setText("Team3");
						}
					}
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
class Run1 extends Thread {
	JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11,
			jLabel12, jwinner, jwinner1, jwinner2, jwinner3, jwinner_finish;
	private int sleep = 0;
	private boolean flag = false;
	public int first = 0, first1, first2, first3, sss;
	public int min = 0, min1, min2, min3;
	public int sec = 0, sec1, sec2, sec3;
	public int ms = 0, ms1, ms2, ms3;

	public Run1(JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JLabel label6, JLabel label7,
			JLabel label8, JLabel label9, JLabel label10, JLabel label11, JLabel label12, JLabel winner, JLabel winner1,
			JLabel winner2, JLabel winner3, JLabel finish) {
		this.jLabel1 = label1;
		this.jLabel2 = label2;
		this.jLabel3 = label3;
		this.jLabel4 = label4;
		this.jLabel5 = label5;
		this.jLabel6 = label6;
		this.jLabel7 = label7;
		this.jLabel8 = label8;
		this.jLabel9 = label9;
		this.jLabel10 = label10;
		this.jLabel11 = label11;
		this.jLabel12 = label12;
		this.jwinner = winner;
		this.jwinner1 = winner1;
		this.jwinner2 = winner2;
		this.jwinner3 = winner3;
		this.jwinner_finish = finish;
	}

	@Override
	public void run() {
		while (true) {
			if (flag) {
				String msFm = String.format("%02d", ms);
				String secFm = String.format("%01d", sec);
				String minFm = String.format("%01d", min);
				String msFm1 = String.format("%01d", ms1);
				String secFm1 = String.format("%01d", sec1);
				String minFm1 = String.format("%01d", min1);
				String msFm2 = String.format("%01d", ms2);
				String secFm2 = String.format("%01d", sec2);
				String minFm2 = String.format("%01d", min2);
				String msFm3 = String.format("%01d", ms3);
				String secFm3 = String.format("%01d", sec3);
				String minFm3 = String.format("%01d", min3);

				if (jLabel12.getX() < 295) {
					first++;
					ms = first;
				} else {
					first = 0;
					sleep = 0;
				}
				if (first > 59) {
					first = 0;
					ms++;
					sec++;

				} else if (sec > 59) {
					sec = 0;
					min++;
				} else {
				}

				if (jLabel10.getX() < 295) {
					first1++;
					ms1 = first1;
				} else
					first1 = 0;
				if (first1 > 59) {
					first1 = 0;
					ms1++;
					sec1++;

				} else if (sec1 > 59) {
					sec1 = 0;
					min1++;
				} else {
				}

				if (jLabel11.getX() < 295) {
					first2++;
					ms2 = first2;
				} else
					first2 = 0;
				if (first2 > 59) {
					first2 = 0;
					ms2++;
					sec2++;

				} else if (sec2 > 59) {
					sec2 = 0;
					min2++;
				} else {
				}

				if (jLabel12.getX() < 295) {
					first3++;
					ms3 = first3;
				} else
					first3 = 0;
				if (first3 > 59) {
					first3 = 0;
					ms3++;
					sec3++;

				} else if (sec3 > 59) {
					sec3 = 0;
					min3++;
				} else {
				}
				jwinner.setText(minFm + ":" + secFm + ":" + msFm);

				jLabel1.setLocation(jLabel1.getX() + 1, jLabel1.getY());
				jLabel2.setLocation(jLabel2.getX() + 1, jLabel2.getY());
				jLabel3.setLocation(jLabel3.getX() + 1, jLabel3.getY());
				if (jLabel1.getX() > 650) {
					jLabel1.setLocation(650, jLabel1.getY());
					jLabel1.setLocation(jLabel1.getX(), jLabel1.getY() - 1);

					if (jLabel1.getY() < 30) {
						jLabel1.setLocation(jLabel1.getX(), 30);
						jLabel4.setLocation(jLabel4.getX(), jLabel4.getY() - 1);

						if (jLabel4.getY() < -65) {
							jLabel4.setLocation(jLabel4.getX(), -65);
							jLabel4.setLocation(jLabel4.getX() - 1, jLabel4.getY());

							if (jLabel4.getX() < 430) {
								jLabel4.setLocation(430, jLabel4.getY());
								jLabel7.setLocation(jLabel7.getX() - 1, jLabel7.getY());

								if (jLabel7.getX() < -100) {
									jLabel7.setLocation(-100, jLabel7.getY());
									jLabel7.setLocation(jLabel7.getX(), jLabel7.getY() + 1);

									if (jLabel7.getY() > 30) {
										jLabel7.setLocation(jLabel7.getX(), 30);
										jLabel10.setLocation(jLabel10.getX(), jLabel10.getY() + 1);

										if (jLabel10.getY() > 125) {
											jLabel10.setLocation(jLabel10.getX(), 125);
											jLabel10.setLocation(jLabel10.getX() + 1, jLabel10.getY());

											if (jLabel10.getX() > 295) {
												jLabel10.setLocation(295, jLabel10.getY());

												jwinner1.setText(minFm1 + ":" + secFm1 + ":" + msFm1);

											}

										}
									}

								}
							}
						}
					}
				}
				if (jLabel2.getX() > 705) {
					jLabel2.setLocation(705, jLabel2.getY());

					jLabel2.setLocation(jLabel2.getX(), jLabel2.getY() - 1);

					if (jLabel2.getY() < -30) {
						jLabel2.setLocation(jLabel2.getX(), -30);
						jLabel5.setLocation(jLabel5.getX(), jLabel5.getY() - 1);

						if (jLabel5.getY() < -120) {
							jLabel5.setLocation(jLabel5.getX(), -120);
							jLabel5.setLocation(jLabel5.getX() - 1, jLabel5.getY());

							if (jLabel5.getX() < 375) {
								jLabel5.setLocation(375, jLabel5.getY());
								jLabel8.setLocation(jLabel8.getX() - 1, jLabel8.getY());

								if (jLabel8.getX() < -165) {
									jLabel8.setLocation(-165, jLabel8.getY());
									jLabel8.setLocation(jLabel8.getX(), jLabel8.getY() + 1);

									if (jLabel8.getY() > 100) {
										jLabel8.setLocation(jLabel8.getX(), 100);
										jLabel11.setLocation(jLabel11.getX(), jLabel11.getY() + 1);

										if (jLabel11.getY() > 175) {
											jLabel11.setLocation(jLabel11.getX(), 175);
											jLabel11.setLocation(jLabel11.getX() + 1, jLabel11.getY());

											if (jLabel11.getX() > 295) {
												jLabel11.setLocation(295, jLabel11.getY());

												jwinner2.setText(minFm2 + ":" + secFm2 + ":" + msFm2);
											}

										}
									}
								}
							}
						}
					}

				}
				if (jLabel3.getX() > 765) {
					jLabel3.setLocation(765, jLabel3.getY());
					jLabel3.setLocation(jLabel3.getX(), jLabel3.getY() - 1);

					if (jLabel3.getY() < -100) {
						jLabel3.setLocation(jLabel3.getX(), -100);
						jLabel6.setLocation(jLabel6.getX(), jLabel6.getY() - 1);

						if (jLabel6.getY() < -165) {
							jLabel6.setLocation(jLabel6.getX(), -165);
							jLabel6.setLocation(jLabel6.getX() - 1, jLabel6.getY());

							if (jLabel6.getX() < 315) {
								jLabel6.setLocation(315, jLabel6.getY());
								jLabel9.setLocation(jLabel9.getX() - 1, jLabel9.getY());

								if (jLabel9.getX() < -225) {
									jLabel9.setLocation(-225, jLabel9.getY());
									jLabel9.setLocation(jLabel9.getX(), jLabel9.getY() + 1);

									if (jLabel9.getY() > 170) {
										jLabel9.setLocation(jLabel9.getX(), 170);
										jLabel12.setLocation(jLabel12.getX(), jLabel12.getY() + 1);

										if (jLabel12.getY() > 225) {
											jLabel12.setLocation(jLabel12.getX(), 225);
											jLabel12.setLocation(jLabel12.getX() + 1, jLabel12.getY());

											if (jLabel12.getX() > 295) {
												jLabel12.setLocation(295, jLabel12.getY());
												jwinner3.setText(minFm3 + ":" + secFm3 + ":" + msFm3);
											}
										}
									}
								}
							}
						}
					}

				}

				if (min1 < min2 && min1 < min3) {
					jwinner_finish.setText("Team1");
				} else if (min2 < min1 && min2 < min3) {
					jwinner_finish.setText("Team2");
				} else if (min3 < min1 && min3 < min2) {
					jwinner_finish.setText("Team3");
				} else {
					if (sec1 < sec2 && sec1 < sec3) {
						jwinner_finish.setText("Team1");
					} else if (sec2 < sec1 && sec2 < sec3) {
						jwinner_finish.setText("Team2");
					} else if (sec3 < sec1 && sec3 < sec2) {
						jwinner_finish.setText("Team3");
					} else {
						if (ms1 < ms2 && ms1 < ms3) {
							jwinner_finish.setText("Team1");
						} else if (ms2 < ms1 && ms2 < ms3) {
							jwinner_finish.setText("Team2");
						} else if (ms3 < ms1 && ms3 < ms2) {
							jwinner_finish.setText("Team3");
						}
					}
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