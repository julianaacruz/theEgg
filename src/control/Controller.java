package control;

import model.Word;
import processing.core.PApplet;
import processing.core.PImage;

public class Controller extends PApplet {
	private PApplet app;
	public Controller(PApplet app) {
		this.app = app;
	}
	
	public void words(String array1[]) {
		Word words = new Word(this);
		words.splitArray(array1);
	}
	
	public void drawElement(int posX, int posY, PImage image) {
		Word element = new Word(this);
		element.drawElement(posX, posY, image);
	}
}
