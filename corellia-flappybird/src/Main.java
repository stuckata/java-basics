import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javafx.scene.shape.Circle;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main extends JFrame implements Runnable {

	private static final long serialVersionUID = -5053709679324793860L;

	public static int width = 400, height = 600;

	Circle circle = new Circle(200, 200, 50);

	Dimension windowSize = new Dimension(width, height);

	Image dbImage;
	Graphics dbg;

	Image face;
	BufferedImage background;

	Rectangle r;

	boolean isSpacePressed;

	static Column column = new Column();
	static Column secondColumn = new Column("second");

	public Main() {
		try {
			background = ImageIO.read(new File("src/background.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		ImageIcon i = new ImageIcon("src/Bird2x.png");
		face = i.getImage();
		setUndecorated(true);
		setSize(windowSize);
		setTitle("Flappy Bird");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		r = new Rectangle(100, 350, 30, 30);
		addKeyListener(new KeyListen());
		setBackground(Color.CYAN);

	}

	@Override
	public void paint(Graphics g) {
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		draw(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}

	public void draw(Graphics g) {
		// g.fillRect(r.x, r.y, r.height, r.width);
		g.drawImage(background, 0, 0, this);
		g.drawImage(face, r.x, r.y, this);
		column.draw(g);
		secondColumn.draw(g);

		g.setFont(new Font("Arial", Font.BOLD, 28));
		g.setColor(Color.RED);
		if (column.down.intersects(r) || secondColumn.down.intersects(r)
				|| column.up.intersects(r) || secondColumn.up.intersects(r)) {

			g.drawString("CRASH!!!", 200, 300);
			
			
		}
		repaint();
	}

	public static void main(String[] args) {
		Main main = new Main();
		Thread t1 = new Thread(main);
		// Thread t2 = new Thread(column);
		// Thread t3 = new Thread(secondColumn);
		t1.start();
		// t2.start();
		// t3.start();
	}

	public void move() {
		r.y += 2;
		column.move();
		secondColumn.move();
	}

	@Override
	public void run() {
		try {
			while (true) {
				move();
				Thread.sleep(10);
			}
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}

	}

	public class KeyListen extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_SPACE) {
				r.y -= 80;
			}
		}

	}

}