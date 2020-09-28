package view;

import control.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Composition extends PApplet{
	private PApplet app;
	
	public Composition(PApplet app) {
		this.app = app;
		

	}
	 
	public void parallaxEffect(int posX, int start, int range, PImage image) {

		float X = map(posX,0,width,start,start+range);
		
		app.image(image,X,540);
				
	}
	
	public void controllerList(String array1[]) {
		Controller compController = new Controller(this);
		compController.words(array1);
	}
	
	public void drawElement(int posX, int posY, PImage image) {
		Controller element = new Controller(this);
		element.drawElement(posX, posY, image);
	}
	

}
