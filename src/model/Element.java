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
	public void drawGod(int posX, int posY, PImage image) {
		app.image(image,posX,posY);

	}
	
	public void drawLincoln(int posX, int posY, PImage image) {
		app.image(image,posX,posY);

	}
	
	public void drawHitler(int posX, int posY, PImage image) {
		app.image(image,posX,posY);

	}
	
	public void drawJesus(int posX, int posY, PImage image) {
		app.image(image,posX,posY);

	}
	
	public void drawEgg(int posX, int posY, PImage image) {
		app.image(image,posX,posY);

	}
}
