package view;

import processing.core.PApplet;
import processing.core.PFont;
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
	String jc = "I'm Jesus?";
	String h = "I'm Hitler?";
	String al = "I'm Abraham Lincoln?";




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
		bg.parallaxEffect(mouseX,795,-1, bg2);
		bg.parallaxEffect(mouseX,830,-5, bg3);
		bg.parallaxEffect(mouseX,955,-35, bg4);	
		
		textSize(32);
		
		
		int scene = 0;
		
		if (mouseX>270 && mouseX<326 && mouseY>300 && mouseY<472) {
			scene =1;
		} else if (mouseX>360 && mouseX<413 && mouseY>300 && mouseY<472) {
			scene=2;
		} else if (mouseX>445 && mouseX<492 && mouseY>275 && mouseY<480) {
			scene=3;
		} else {
			scene=0;
		}

		
		switch(scene) {
		  case 0: 
			  tint(255, 255);
			  image (god,710,540);
			  image (man,900,540);
			  
			  tint(255, 50);
			  image (lincoln,800,540);
			  image (hitler,700,540);
			  image (jesus,590,540);
			break;
		  case 1: 
			  tint(255, 255);
			  image (god,710,540);
			  image (man,900,540);
			  image (people,700,540);
			  image (jesus,590,540);
			  text(jc,615,250);



			  tint(255, 20);
			  image (lincoln,800,540);
			  image (hitler,700,540);
		    break;
		  case 2:
			  tint(255, 255);
			  image (god,710,540);
			  image (man,900,540);
			  image (people,820,540);
			  image (hitler,700,540);
			  text(h,610,250);


			  tint(255, 20);
			  image (lincoln,800,540);
			  image (jesus,590,540);

			  break;
			  
		  case 3:
			  tint(255, 255);
			  image (god,710,540);
			  image (man,900,540);
			  image (lincoln,800,540);
			  image (johnWB,850,540);
			  text(al,540,250);



			  tint(255, 20);
			  image (jesus,590,540);
			  image (hitler,700,540);

			  break;
		}

		//element.drawElement(800, 540, man, arrayStory);
		
		/*tint(255, 0);
		image (johnWB,850,540);
		image (people,700,540);
		image (people,820,540);*/

		tint(255, 255);
		
		//image (egg,750,540);


			}
	

}
