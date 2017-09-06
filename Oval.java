import java.awt.*;

public class Oval {
	public static void main(String[] args) {
		

DrawingPanel panel = new DrawingPanel(200, 100);
Graphics g = panel.getGraphics();
g.fillRect(10, 10, 50, 50);
g.setColor(Color.WHITE);
g.fillOval(10, 10, 50, 50);
g.setColor(Color.BLACK);
g.drawRect(10, 10, 50, 50);
	}
}
	