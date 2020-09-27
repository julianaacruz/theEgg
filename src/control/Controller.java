package control;

import model.Word;
import processing.core.PApplet;

public class Controller extends PApplet {
	PApplet app;
	public Controller(PApplet app) {
		this.app = app;
	}
	
	public void words(String array1[]) {
		Word words = new Word(this);
		words.splitArray(array1);
	}
}
