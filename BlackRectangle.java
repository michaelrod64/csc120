import java.awt.*;

public class BlackRectangle {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(200, 100);
		Graphics g = panel.getGraphics();
		g.drawRect(10, 20, 40, 20);
		g.drawLine(10, 20, 50, 40);
	}
}