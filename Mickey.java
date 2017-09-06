import java.awt.*;

public class Mickey {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(450, 150);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.YELLOW);
		
		drawRectangle(g, 50, 25);
		drawRectangle(g, 250, 25);
		
	}
		public static void drawRectangle(Graphics g, int x, int y) {
		
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 40, 40);
		g.fillOval(x + 80, y, 40, 40);
		g.setColor(Color.RED);
		g.fillOval(x + 20, y + 20, 80, 80);
		g.setColor(Color.BLACK);
		g.drawLine(x + 20, y + 60, x +100, y +60);
		}
	
}

		