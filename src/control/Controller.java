package control;

import model.Word;
import processing.core.PApplet;

public class Controller extends PApplet {
	PApplet app;
	public Controller(PApplet app) {
		this.app = app;
	}
	
	public void Words(String array1[]) {
		Word trying = new Word(this);
		trying.DidItCharge(array1);
	}
}
