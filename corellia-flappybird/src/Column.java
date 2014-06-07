import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Column {// implements Runnable{

	int x, y;

	Rectangle down, up;

	Column() {
		this.x = Main.width;
		this.y = chooseColumnPosition();
		int yPosition = chooseColumnPosition();
		down =
				new Rectangle(Main.width, yPosition, 50, Main.height
						- yPosition);
	}

	Column(String type) {
		if (type.equals("second"))
		{
			this.x = Main.width + Main.width / 2 + 25;
			this.y = chooseColumnPosition();
			int yPosition = chooseColumnPosition();
			down =
					new Rectangle(this.x, yPosition, 50, Main.height
							- yPosition);
		}
	}

	public int chooseColumnPosition() {
		Random r = new Random();
		return r.nextInt(Main.width - Main.width / 2) + Main.width / 2; // returns
																		// 30-380
	}

	public void move() {
		down.x -= 2;
		if (down.x + down.width <= 0) {
			int yPosition = chooseColumnPosition();
			down =
					new Rectangle(Main.width, yPosition, 50, Main.height
							- yPosition);
		}
	}

	public void draw(Graphics g) {
		g.fillRect(down.x, down.y, down.width, down.height);

		calcUp();
		g.fillRect(up.x, up.y, up.width, up.height);
	}

	private void calcUp() {
		up =
				new Rectangle(down.x, 0, down.width, Main.height - down.height
						- 200);
	}

	/*
	 * public void run() { try { while (true) { move(); Thread.sleep(10); } }
	 * catch (Exception e) { System.out.println(e.getMessage()); }
	 * 
	 * }
	 */
}