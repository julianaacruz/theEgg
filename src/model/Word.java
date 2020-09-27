package model;
import processing.core.PApplet;

public class Word extends PApplet{
	PApplet app;
	String [] arrayWords;
	
	public Word(PApplet app) {
		this.app = app;
	}
	public void DidItCharge(String array1[]) {
		System.out.println(array1.length);

	}
	
}
