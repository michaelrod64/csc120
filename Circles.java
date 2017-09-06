import java.awt.*;

public class Circles {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(400, 400);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.CYAN);
		drawSquares(g, 0, 0, 100, 100, 5, 1, 1);
		drawSquares(g, 10, 120, 24, 24, 4, 5, 5);
		drawSquares(g, 150, 20, 40, 40, 5, 6, 6);
		drawSquares(g, 130, 275, 36, 36, 3, 3, 3);
	}	
	
		public static void drawCircle(Graphics g, int x, int y,  int height, int width, int numberOfCircles) {
			g.setColor(Color.GREEN);
			g.fillRect(x, y, height, width);
			g.setColor(Color.YELLOW);
			g.fillOval(x, y, height, width);
			g.setColor(Color.BLACK);
			g.drawRect(x, y, height, width);
			g.drawLine(x, y + height / 2, x + width, y + height / 2);
			g.drawLine(x + width / 2, y, x + width / 2, y + height);
			for (int i = 1; i <= numberOfCircles; i++) {
				g.drawOval(x + (width / 2) - (((width / 2) / numberOfCircles) * i), y + (height / 2) - (((width / 2) / numberOfCircles) * i), height/ numberOfCircles * i, height / numberOfCircles * i);
			}
		}
	
		public static void drawSquares(Graphics g, int x, int y,  int height, int width, int numberOfCircles, int numberOfRows, int numberOfColumns) {
			for (int i = 0; i < numberOfColumns; i++) {
				
			for (int j = 0; j < numberOfRows; j++) { 
			drawCircle(g, x + width * j, y, height, width, numberOfCircles);
			}
			y = y + height;
			}
		}
		
}
			
			
	