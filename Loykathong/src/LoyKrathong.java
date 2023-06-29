import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoyKrathong {
	public static void main(String[] args) {
		GameLoyKrathong gameloykrathong = new GameLoyKrathong();
		gameloykrathong.setVisible(true);
	}
}

@SuppressWarnings("serial")
class GameLoyKrathong extends JFrame {
	MyGameLoyKrathong lkt = new MyGameLoyKrathong();

	public GameLoyKrathong() {
		setTitle("ลอยกระทงคนโสด");
		setSize(842, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		add(lkt);
	}
}

@SuppressWarnings("serial")
class MyGameLoyKrathong extends JPanel implements MouseListener {
	Image imbackground = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") + File.separator + "loykrathong.png");
	Image imkrathong = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") + File.separator + "krathong.png");
	Image imfire = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") + File.separator + "fire.gif");
	int number = 5;
	int x[] = new int[number];
	int y[] = new int[number];
	int z[] = new int[number];
	int shx = 0;
	int shy = 0;

	public MyGameLoyKrathong() {
		setSize(828, 350);
		setLocation(0, 0);
		for (int i = 0; i < x.length; i++) {
			x[i] = new Random().nextInt(520);
			y[i] = new Random().nextInt(105) + 170;
		}
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new task(this), 0, 50);
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imbackground, 0, 0, this);
		for (int i = 0; i < x.length; i++) {
			if (z[i] == 0) {
				g.drawImage(imkrathong, x[i], y[i], x[i] + 800, y[i] + 800, 0, 0, 1000, 1000, this);
			} else if (z[i] == 1) {
				g.drawImage(imkrathong, x[i], y[i], x[i] + 800, y[i] + 800, 0, 0, 1000, 1000, this);
				g.drawImage(imfire, x[i], y[i], 50, 40, this);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mousepanel(e);

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	private void mousepanel(MouseEvent e) {
		shx = e.getX();
		shy = e.getY();
		for (int i = 0; i < x.length; i++) {
			if (shx >= (x[i]) && shx <= (x[i] + 50) && shy >= (y[i]) && shy <= (y[i] + 50)) {
				z[i] = 1;
			}
		}

	}
}

class task extends TimerTask {
	MyGameLoyKrathong pnloykrathong;
	private int ranx ;
	private int rany ;
	public task(MyGameLoyKrathong pnloykrathong) {
		this.pnloykrathong = pnloykrathong;
	}

	@Override
	public void run() {
		for (int i = 0; i < pnloykrathong.number; i++) {
			ranx = pnloykrathong.x[i] - 1;
			pnloykrathong.x[i] += ranx;
			if (pnloykrathong.x[i] < -80) {
				ranx = 520;
				rany = new Random().nextInt(105) + 170;
				pnloykrathong.y[i] = rany;
			}
			pnloykrathong.x[i] = ranx;
			pnloykrathong.repaint();
		}
	}
}