package model;
import java.util.ArrayList;

import processing.core.PApplet;
//import processing.core.PImage;
import processing.core.PImage;

public class Word extends PApplet{
	private PApplet app;
	private  ArrayList<String> listWords;//Infinitos elementos
	
	public Word(PApplet app) {
		this.app = app;
		listWords = new ArrayList<String>();

	}
	public void splitArray(String array1[]) {
		//System.out.println(array1.length);
		

		for(int i=0; i < array1.length ; i++) { 
			String [] tempArray = array1[i].split(" ");
			for (int j=0; j< tempArray.length; j++) {
				listWords.add(tempArray[j].trim());
			}
			}
		}
	
		public void drawElement(int posX, int posY, PImage image) {
		for(int i=0; i < listWords.size() ; i++) {
			System.out.println(listWords.get(i));
			System.out.println("hola");

			if(listWords.get(i).equals("child")) {	
				Element man = new Element(this);
				man.drawMan(posX, posY, image);
				
			} else if (listWords.get(i).equals("god")) {	
				Element god = new Element(this);
				god.drawGod(posX, posY, image);
				
			} else if (listWords.get(i).equals("Lincoln")) {	
				Element lincoln = new Element(this);
				lincoln.drawLincoln(posX, posY, image);
				
			} else if (listWords.get(i).equals("Hitler")) {	
				Element hitler = new Element(this);
				hitler.drawHitler(posX, posY, image);
			
			} else if (listWords.get(i).equals("Jesus")) {	
				Element jesus = new Element(this);
				jesus.drawJesus(posX, posY, image);
				
			} else if (listWords.get(i).equals("egg")) {	
				Element egg = new Element(this);
				egg.drawEgg(posX, posY, image);
			} 
		
		}			

		}
	}
	

