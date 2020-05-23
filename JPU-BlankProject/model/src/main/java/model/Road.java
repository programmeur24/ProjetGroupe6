package model;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;
import model.IRoad;

import Element.Element;
import Group.GroupElementFactory;

public class Road extends Observable implements IRoad {

	private int width = 32;
	private int height = 21;
	private Element[][] elementRoad;
	
	
	public Road(final String fileName) throws Exception{
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
		return null;
	}
	
	
	
	//****METHODES****//
	public void loadFile(String fileName) throws Exception {
		System.out.println("Je passe ici");
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;
        int y = 0;
        line = buffer.readLine();
        this.setWidth(Integer.parseInt(line));
        line = buffer.readLine();
        this.setHeight(Integer.parseInt(line));
        this.elementRoad = new Element[this.getWidth()][this.getHeight()];
        line = buffer.readLine();
        while (line != null) {
            for (int x = 0; x < line.toCharArray().length; x++) {
                this.setElementRoadXY(GroupElementFactory.getFromFileSymbole(line.toCharArray()[x]), x, y);
            }
            line = buffer.readLine();
            y++;
        }
        buffer.close();
	}

}
