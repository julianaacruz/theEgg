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
	static PImage egg;
	static PImage johnWB;
	static PImage people;


	String [] lineJesus;
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
		egg = loadImage ("Egg.png");
		johnWB = loadImage ("JohnWB.png");
		people = loadImage ("People.png");
		
		//frameRate(20);

		arrayStory = loadStrings ("../data/TheEgg.txt");
		//text.controllerList(arrayStory);
		imageMode(CENTER);

	}
	
	int i=0, j=0;
	int x=10, y=15;
	String message;
	
	public void draw() {
		tint(255, 255);
		float f=(float) 0.8;
		bg1.loadPixels();

		
		// ubicación personajes
		scale(f);
		image (bg1,800,540);
		
		element.drawElement(800, 540, man,arrayStory);
		image (god,710,540);
		image (man,900,540);
		tint(255, 250);
		image (johnWB,850,540);
		image (people,700,540);
		image (people,820,540);

		tint(255, 255);
		image (lincoln,800,540);
		image (hitler,700,540);
		image (jesus,590,540);
		//image (egg,750,540);
		bg.parallaxEffect(mouseX,795,-1, bg2);
		bg.parallaxEffect(mouseX,830,-5, bg3);
		bg.parallaxEffect(mouseX,955,-35, bg4);	

		/* if (mouseX>300) {
			    message = jesusLine[i];
			  }

			  //-----------------------------
			  if (j < message.length()) {
			    text(message.charAt(j), x*j+10, y*i);
			    j++;
			  }
			  else { 
			    j=0;
			    i++;
			  }*/
	}
	

}
