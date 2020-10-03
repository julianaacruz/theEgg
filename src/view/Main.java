package view;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet {
	static PImage bg1;
	static PImage bg2;
	static PImage bg3;
	static PImage bg4;
	static PImage man;
	static PImage touchMan;
	static PImage touchGod;
	static PImage god;
	static PImage lincoln;
	static PImage hitler;
	static PImage jesus;
	static PImage egg;
	static PImage johnWB;
	static PImage people;
	static PImage pFinal;
	PFont montserrat;
	
	private String jc = "“I'm Jesus?”";
	private String followers = "“And you’re everyone who followed him.”";
	private String h = "“I’m Hitler?”";
	private String killed = "“And you’re the millions he killed.”";
	private String al = "“I’m Abraham Lincoln?”";
	private String john = "“And you’re John Wilkes Booth, too”";
	private String guy1 = "“Why do all this?”";
	private String god1 = "“Because someday, you will become like me.\n Because that’s what you are. You’re one of my kind.\n You’re my child.”";
	private String guy2 = "“So the whole universe, it’s just…”";
	private String god2 = "“An egg.”";

	boolean click=false;


	private  ArrayList<String> scenes;
	String [] arrayStory;
	Composition bg = new Composition(this);
	Composition text = new Composition(this);
	Composition element = new Composition(this);
	Composition phrase = new Composition(this);

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
		touchMan = loadImage ("TouchMan.png");
		touchGod = loadImage ("TouchGod.png");
		god = loadImage ("God.png");
		lincoln = loadImage ("Lincoln.png");
		hitler = loadImage ("Hitler.png");
		jesus = loadImage ("Jesus.png");
		egg = loadImage ("Egg.png");
		johnWB = loadImage ("JohnWB.png");
		people = loadImage ("People.png");
		pFinal = loadImage ("Final.png");
		montserrat = loadFont("Montserrat-SemiBold-70.vlw");



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
		textFont(montserrat);
		 textAlign(CORNER);

		
		// ubicación personajes
		scale(f);
		image (bg1,800,540);
		bg.parallaxEffect(mouseX,795,-1, bg2);
		bg.parallaxEffect(mouseX,830,-6, bg3);
		bg.parallaxEffect(mouseX,955,-35, bg4);	
		
		textSize(40);
		element.drawElement(800, 540, man, arrayStory);

		//CAMBIO DE ESCENA SEGUN UBICACIÓN DEL MOUSE
		int scene = 0;
		
		if (mouseX>270 && mouseX<326 && mouseY>300 && mouseY<472) {
			scene =1;
			//scenes.add("1");
		} else if (mouseX>360 && mouseX<413 && mouseY>300 && mouseY<472) {
			scene=2;
			//scenes.add("2");
		} else if (mouseX>445 && mouseX<492 && mouseY>275 && mouseY<480) {
			scene=3;
			//scenes.add("3");
		} else if (mouseX>530 && mouseX<580 && mouseY>300 && mouseY<472) { 
			scene=4;
			//scenes.add("3");
		} else if (mouseX>700 && mouseX<750 && mouseY>275 && mouseY<472) { 
			scene=5;
			//scenes.add("3");
		} else {
			scene=0;
		}
		
		/*(int i=0; i < scenes.size() ; i++) { 
			if(scenes.get(i).equals("1")) {	
				
			}

		}*/
		
		switch(scene) { //Cambio de "escenas"
		
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
			  image (touchGod,710,540);
			  image (man,900,540);
			  image (people,700,540);
			  image (jesus,590,540);
			  fill(255);
			 // text(jc,615,250);
			  typewriterEffect(jc);
			 			  
			  fill(240,223,113);
			  text(followers,370,820);


			  tint(255, 20);
			  image (lincoln,800,540);
			  image (hitler,700,540);
		    break;
		    
		  case 2:
			  tint(255, 255);
			  image (touchGod,710,540);
			  image (man,900,540);
			  image (people,800,540);
			  image (hitler,700,540);
			  fill(255);
			  text(h,610,250);
			  
			  fill(240,223,113);
			  text(killed,410,820);


			  tint(255, 20);
			  image (lincoln,800,540);
			  image (jesus,590,540);

			  break;
			  
		  case 3:
			  tint(255, 255);
			  image (touchGod,710,540);
			  image (man,900,540);
			  image (lincoln,800,540);
			  image (johnWB,850,540);
			  fill(255);
			  text(al,500,250);
			  fill(240,223,113);
			  text(john,400,820);


			  tint(255, 20);
			  image (jesus,590,540);
			  image (hitler,700,540);

			  break;
		
		  case 4:
			  tint(255, 255);
			  image (touchGod,710,540);
			  image (man,900,540);
			  fill(255);
			  text(guy1,540,250);
			  fill(240,223,113);
			  textAlign(CENTER);
			  text(god1,760,750);

			  
			  tint(255, 50);
			  image (lincoln,800,540);
			  image (hitler,700,540);
			  image (jesus,590,540);
		  break;
		  
		  case 5:
			  tint(255, 255);
			  image (touchGod,710,540);
			  image (man,900,540);
			  fill(255);
			  text(guy2,390,250);
			  fill(240,223,113);
			  textAlign(CENTER);
			  text(god2,720,750);

			  
			  tint(255, 50);
			  image (lincoln,800,540);
			  image (hitler,700,540);
			  image (jesus,590,540);
		  break;
	}}


				
		//image (egg,750,540);


			
	
	public void typewriterEffect(String message) {
		 int x=610;
		  for (int i =0; i < jc.length();i++) {

			  char c = jc.charAt(i);
			  text(c,x,250);
			  x = (int) (x + textWidth(c));
		  }

	}
	
		public void mouseClicked() {
			click=true;
		}
	

}
