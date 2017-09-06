import java.awt.*;

public class Maze {
	public static void main(String[] args) {
		//width and height of the drawing panel
		int panelWidth = 510;
		int panelHeight = 170;
		//amount of spirals in the maze
		int spirals = 16
		//amount of pixels between each spiral, vertically and horizontally
		//(changes based on both amount of SPIRALS and SIZE of the panel)
		int distanceX = (int)(80 / spirals) * (int) (panelWidth / 170);
		int distanceY = (int) (80 / spirals) * (int) (panelHeight /170);
		//Creates draing panel based on above variables
		DrawingPanel panel = new DrawingPanel(panelWidth, panelHeight);
		Graphics g = panel.getGraphics();
		//calls method to build maze
		buildMaze(g, panelWidth - distanceX, distanceX, distanceY, spirals, panelWidth, panelHeight);
	}
		//builds maze based on values given for SPIRALS and PANEL WIDTH and HEIGHT
		public static void buildMaze(Graphics g, int x, int distanceX, int distanceY, int spirals, int panelWidth, int panelHeight) {
			//creates first line (slightly different pattern than rest of maze)
			g.drawLine(0, distanceY, x, distanceY);
			//creates rest of maze with designated amount of spirals
			for (int i = 0; i < spirals; i++) {
				g.drawLine(x - (distanceX * i), distanceY + (distanceY * i), x - (distanceX * i), distanceY + (panelHeight -  2 * distanceY) - (distanceY * i) );
				g.drawLine(x - (distanceX * i) , distanceY + (panelHeight - 2 * distanceY) - (distanceY * i) , x - (panelWidth - 2 * distanceX) + (distanceX * i) , distanceY + (panelHeight - 2 * distanceY) - (distanceY * i) );
				g.drawLine(x - (panelWidth - 2 * distanceX) + (distanceX * i) , distanceY + (panelHeight - 2 * distanceY) - (distanceY * i), x - (panelWidth - 2 * distanceX) + (distanceX * i), 2 * distanceY + (distanceY * i) );
				g.drawLine(x - (panelWidth - 2 * distanceX) + distanceX * i, 2 * distanceY + distanceY * i, x - distanceX - distanceX * i, 2 * distanceY + distanceY * i);
			}
		}
}

				
	