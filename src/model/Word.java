package model;
import java.util.ArrayList;

import processing.core.PApplet;

public class Word extends PApplet{
	PApplet app;
	ArrayList<String> listWords;//Infinitos elementos
	
	public Word(PApplet app) {
		this.app = app;
	}
	public void splitArray(String array1[]) {
		//System.out.println(array1.length);
		
		listWords = new ArrayList<String>();

		for(int i=0; i < array1.length ; i++) { 
			String [] tempArray = array1[i].split(" ");
			for (int j=0; j< tempArray.length; j++) {
				listWords.add(tempArray[j].trim());
			}
		for(String element: listWords) {
			System.out.println(element);
		}
		}
	}
	
}
