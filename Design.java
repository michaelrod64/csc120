import java.awt.*;

public class Design {
	public static void main(String[] args) {
		int windowWidth = 500;
		int windowHeight = 100;
		
		DrawingPanel panel = new DrawingPanel(windowWidth, windowHeight);
		Graphics g = panel.getGraphics();
		showDesign(g, windowWidth, windowHeight);
	}
		public static void showDesign(Graphics g, int windowWidth, int windowHeight) {
			for (int i = 0; i <= 4; i++) {
			g.drawRect(((windowWidth/2) - (windowWidth/10)) - (windowWidth/10) * i, ((windowHeight/2) - (windowHeight/10)) - (windowHeight/10) * i, 
				(2 * windowWidth/10) + (2 * windowWidth/10) * i,  (2 * windowHeight/10) + (2 * windowHeight/10) * i);
		}
		}
}