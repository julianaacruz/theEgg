package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	static PImage bg1;
	static PImage bg2;
	static PImage bg3;
	static PImage bg4;
	static PImage man;
	static PImage god;
	static PImage lincoln;
	static PImage hitler;
	static PImage jesus;



	String [] arrayStory;
	Composition bg = new Composition(this);
	Composition text = new Composition(this);
	Composition element = new Composition(this);

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	
	public void settings() {
		size(1200,800);


	}
	public void setup() {
		bg1 = loadImage ("Background1.png");
		bg2 = loadImage ("Background2.png");
		bg3 = loadImage ("Background3.png");
		bg4 = loadImage ("Background4.png");
		man = loadImage ("Man.png");
		god = loadImage ("God.png");
		lincoln = loadImage ("Lincoln.png");
		hitler = loadImage ("Hitler.png");
		jesus = loadImage ("Jesus.png");


		arrayStory = loadStrings ("../data/TheEgg.txt");
		text.controllerList(arrayStory);
		imageMode(CENTER);

	}
	
	
	public void draw() {
		float f=(float) 0.8;
		bg1.loadPixels();

		scale(f);
		image (bg1,800,540);
		bg.parallaxEffect(mouseX,795,-1, bg2);
		bg.parallaxEffect(mouseX,830,-5, bg3);
		bg.parallaxEffect(mouseX,955,-35, bg4);
		element.drawElement(800, 540, man);
		image (god,760,540);
		image (man,950,540);
		image (lincoln,850,540);
		image (hitler,750,540);
		image (jesus,640,540);

	}
	

}
