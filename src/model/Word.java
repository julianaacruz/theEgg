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
			String [] tempArray = array1[i].split(" "); // separar por espacios
			for (int j=0; j< tempArray.length; j++) {	
				String [] tempArray2 = tempArray[j].split("\\?"); // elimina signos de interrogación
				for (int k=0; k< tempArray2.length; k++) {
					String [] tempArray3 = tempArray2[k].split("\\."); // elimina puntos
					for (int l=0; l< tempArray3.length; l++) {
						listWords.add(tempArray3[l].trim());
					}
				}
			}
			}
		//System.out.println(listWords);
		//System.out.println("Número de elementos totales: " + listWords.size());
		}
		
		
	
		public void drawElement(int posX, int posY, PImage image, String array1[]) {
			this.splitArray(array1);
			//System.out.println(listWords);

			for(int i=0; i < listWords.size() ; i++) {
				System.out.println(listWords.get(i));

			/*if(listWords.get(i).equals("child") {	
				Element man = new Element(this);
				man.drawMan(posX, posY, image);
				
			} else if (listWords.get(i).equals("god") {	
				Element god = new Element(this);
				god.drawGod(posX, posY, image);
				
			} else if (listWords.get(i).equals("Lincoln") {	
				Element lincoln = new Element(this);
				lincoln.drawLincoln(posX, posY, image);
				
			} else if (listWords.get(i).equals("Hitler") {	
				Element hitler = new Element(this);
				hitler.drawHitler(posX, posY, image);
			
			} else if (listWords.get(i).equals("Jesus") {	
				Element jesus = new Element(this);
				jesus.drawJesus(posX, posY, image);
				
			} else if (listWords.get(i).equals("Egg")) {	
				Element egg = new Element(this);
				egg.drawEgg(posX, posY, image);
			} */
		
		}			

		}
	}
	

