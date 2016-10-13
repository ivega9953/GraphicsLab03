

		import java.awt.*;
		import java.applet.*;
		import java.util.*; 
																		

		public class GrphicsLab03 extends Applet
		{
			
			public void paint(Graphics g) 	
			{
				// Draw Grid
				g.drawRect(10,10,780,580);
				g.drawLine(400,10,400,590);
				g.drawLine(10,300,790,300);
				
				Random rnd = new Random(1234);
				
				
				// Draw Random Lines
				Random rndInt = new Random();
				for (int k = 1; k <= 200; k++)
				{

				int x1 = rnd.nextInt(390)+10;
				int y1 = rnd.nextInt(290)+10;
				int x2 = rnd.nextInt(380)+10;
				int y2 = rnd.nextInt(290)+10;
				g.drawLine(x1,y1,x2,y2);
				int red = rndInt.nextInt(256);
				int green = rndInt.nextInt(256);
				int blue = rndInt.nextInt(256);
				g.setColor(new Color(red,green,blue));
				}
				// Draw Random Squares
				
					
					for (int k = 1; k <= 200; k++)
					{	
					int x1 = rnd.nextInt(340)+400;
					int y1 = rnd.nextInt(240)+10;
					int red = rnd.nextInt(256);
					int green = rnd.nextInt(256);
					int blue = rnd.nextInt(256);
					g.setColor(new Color(red,green,blue));
					g.fillRect(x1,y1,50,50);
					}
				// Draw Random Circles
					for (int k = 1; k <= 200; k++)
					{
					int x1 = rnd.nextInt(300)+10;
					int y1 = rnd.nextInt(200)+300;
					int x2 = rnd.nextInt(100);
					int red = rndInt.nextInt(256);
					int green = rndInt.nextInt(256);
					int blue = rndInt.nextInt(256);
					g.setColor(new Color(red,green,blue));
						g.drawOval(x1, y1, x2, x2);	
					}
				// Draw 3-D Box
			g.setColor(Color.yellow);
			g.fillRect(550, 400, 100, 100);
			g.setColor(Color.red);
			g.fillRect(590, 440, 100, 100);
			//Blue Triangle
			g.setColor(Color.blue);
			int xpoints[] = {650, 650, 690};
			int ypoints[] = {400, 440, 440};
			int npoints = 3;
			g.fillPolygon(xpoints, ypoints, npoints);
			//Green Rumbus
			g.setColor(Color.green);
			int x1points[] = {590, 550, 550, 590};
			int y1points[] = {440, 400, 500, 540};
			int n1points = 4;
			g.fillPolygon(x1points, y1points, n1points);
			
			
			
			}
				
		


	}
		


