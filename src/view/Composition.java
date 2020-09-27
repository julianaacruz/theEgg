package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Composition extends PApplet{
	PApplet app;
	
	public Composition(PApplet app) {
		this.app = app;
		

	}
	 
	public void parallaxEffect(int posX, int start, int range, PImage image) {

		float X = map(posX,0,width,start,start+range);
		
		app.image(image,X,540);
				

	}

}
