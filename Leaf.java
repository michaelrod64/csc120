import java.awt.*;

public class Leaf {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(400, 300);
		panel.setBackground(Color.CYAN);
		Graphics g = panel.getGraphics();
		drawLeaf(g, 50, 50);
		drawLeaf(g, 250, 10);
		drawLeaf(g, 180, 115);
	}	
		public static void drawLeaf(Graphics g, int x, int y) {
			g.drawLine(x, y, x + 100, y + 100);
			g.setColor(Color.RED);
			for (int i = 0; i < 5; i++) {
				g.drawRect(x, y, 20 + i * 20, 20 + i * 20);
		}
			g.setColor(Color.BLACK);
		}	
}



			