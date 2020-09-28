package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Element extends PApplet{
	private PApplet app;
	
	public Element(PApplet app) {
		this.app = app;
	}
	public void drawMan(int posX, int posY, PImage image) {
		app.image(image,posX,posY);

	}
}
