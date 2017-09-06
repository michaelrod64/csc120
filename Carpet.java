import java.awt.*;
import java.util.*;

public class Carpet {
	public static final int SIZE = 500;
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("What level do you want?");
		int level = console.nextInt();
		
		DrawingPanel p = new DrawingPanel(SIZE, SIZE);
		p.setBackground(Color.WHITE);
		Graphics g = p.getGraphics();
		g.setColor(Color.BLACK);
		int squareLocation = (int) Math.round(SIZE/ 3);
		int squareSize = squareLocation;
		
		drawFigure(level, g, squareLocation, squareLocation, squareSize);
	}
	
	public static void drawFigure(int level, Graphics g, int squareX, int squareY, 
	int squareSize) {
		if (level <= 1) {
			g.fillRect(squareX, squareY, squareSize, squareSize);
		}
		else {
			drawFigure(level - 1, g, (int) Math.round(squareX / 3), (int) Math.round(squareY / 3), (int) Math.round(squareSize / 3));
			drawFigure(level - 1, g, (int) Math.round(squareX / 3), (int) Math.round(squareY + squareY / 3), (int) Math.round(squareSize / 3));
			drawFigure(level - 1, g, (int) Math.round(squareX / 3), (int) Math.round (2 * squareY + squareY / 3), (int) Math.round(squareSize / 3));
			drawFigure(level - 1, g, (int) Math.round(squareX + squareX / 3), (int) Math.round(squareY / 3), (int) Math.round(squareSize / 3));
			drawFigure(level - 1, g, (int) Math.round(2 * squareX + squareX / 3), (int) Math.round(squareY / 3), (int) Math.round(squareSize / 3));
			drawFigure(level - 1, g, (int) Math.round(2 * squareX + squareX / 3), (int) Math.round(squareY + squareY / 3), (int) Math.round(squareSize / 3));
			drawFigure(level - 1, g, (int) Math.round(2 * squareX + squareX / 3), (int) Math.round(2 * squareY + squareY / 3), (int) Math.round(squareSize / 3));
			drawFigure(level - 1, g, (int) Math.round(squareX + squareX / 3), (int) Math.round(2 * squareY + squareY / 3), (int) Math.round(squareSize / 3));
			g.fillRect(squareX, squareY, squareSize, squareSize);
		}
	}
}

	
		
		