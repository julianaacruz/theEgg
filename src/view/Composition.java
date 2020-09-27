package view;

import control.Controller;
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
	
	public void Controller(String array1[]) {
		Controller trying = new Controller(this);
		trying.Words(array1);
	}

}
