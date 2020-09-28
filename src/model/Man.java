package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Man extends Element{

	public Man(int posX, int posY, PImage image, PApplet app) {
		super(app);
		app.image(image,posX,posY);

	}

}
