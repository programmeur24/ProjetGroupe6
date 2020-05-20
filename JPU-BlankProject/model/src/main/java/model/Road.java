package model;

import java.awt.Image;
import java.io.IOException;
import java.util.Observable;

import Element.Element;

public class Road implements IRoad{

	private int width;
	private int height;
	private Element[][] elementRoad;
	
	
	public Road(final String fileName) throws IOException{
		super();
		this.loadFile(fileName);
	}
	
	
	//****SETTERS****//
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setElementRoadXY(Element elementRoad, final int x, final int y) {
		this.elementRoad[x][y] = elementRoad;
	}
	
	public void setHeroHasChange() {
		
	}
	

	
	//****GETTERS****//
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public final Element getElementRoadXY(final int x, final int y) {
		return this.elementRoad[x][y];
	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	//****METHODES****//
	public void loadFile(String filaName) {
		
	}


	@Override
	public Element getElementRoad() {
		// TODO Auto-generated method stub
		return null;
	}
}
