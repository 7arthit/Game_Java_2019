import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class game {
	public static void main(String[] args) {
		GameFrame gf = new GameFrame();
		gf.setVisible(true);
	}
}

@SuppressWarnings("serial")
class GameFrame extends JFrame {
	MyGamePanel gpl = new MyGamePanel();

	public GameFrame() {
		setTitle("Game Shoot Ball");
		setSize(1064, 716);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		add(gpl);
	}
}

@SuppressWarnings("serial")
class MyGamePanel extends JPanel {
	Image img = Toolkit.getDefaultToolkit()
			.createImage(System.getProperty("user.dir") + File.separator + "football.png");
	Image gt = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") + File.separator + "ball2.png");
	Image sh = Toolkit.getDefaultToolkit().createImage(System.getProperty("user.dir") + File.separator + "sight.gif");
	int number = 5;
	int x[] = new int[number];
	int y[] = new int[number];
	int shx = 0;
	int shy = 0;

	public MyGamePanel() {
		setSize(1064, 716);
		setLocation(0, 0);
		for (int i = 0; i < x.length; i++) {
			x[i] = new Random().nextInt(900);
			y[i] = new Random().nextInt(500);
		}
		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				mousepanel(e);
			}

			@Override
			public void mouseDragged(MouseEvent e) {

			}
		});
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new task(this), 0, 100);
	}

	private void mousepanel(MouseEvent e) {
		System.out.println(e.getX() + " " + e.getY());
		shx = e.getX();
		shy = e.getY();
		repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, this);
		for (int i = 0; i < x.length; i++) {
			g.drawImage(gt, x[i], y[i], x[i] + 100, y[i] + 100, 0, 0, 1000, 1000, this);
		}
		//g.drawImage(img, 1000, 563, 0, 0, 0, 0, 1000, 563, this);
		//g.drawImage(img, 0, 0, 200, 400, 400, 0, 600, 563, this);
		Font font = new Font("Arial", Font.BOLD, 40);
		g.setFont(font);
		g.setColor(Color.yellow);
		g.drawString("Shoot Ball", 800, 80);
		g.drawImage(sh, shx - 50, shy - 50, this);
	}
}

class task extends TimerTask {
	MyGamePanel pn;

	public task(MyGamePanel pn) {
		this.pn = pn;
	}

	@Override
	public void run() {
		for (int i = 0; i < pn.number; i++) {
			int ranx = new Random().nextInt(40) - 20;
			int rany = new Random().nextInt(40) - 20;
			pn.x[i] += ranx;
			pn.y[i] += rany;
			if(pn.x[i] > 1064) {
				pn.x[i] = 1064;
			}	
			if(pn.x[i] < 0) {
				pn.x[i] = 0;
			}
			if(pn.y[i] > 1064) {
				pn.y[i] = 1064;
			}	
			if(pn.y[i] < 0) {
				pn.y[i] = 0;
			}
			pn.repaint();
		}
	}
}