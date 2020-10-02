package control;

import model.Word;
import processing.core.PApplet;
import processing.core.PImage;

public class Controller extends PApplet {
	private PApplet app;
	public Controller(PApplet app) {
		this.app = app;
	}

	
	public void drawElement(int posX, int posY, PImage image, String array1[]) {
		Word element = new Word(this);
		element.drawElement(posX, posY, image, array1);
	}
}
