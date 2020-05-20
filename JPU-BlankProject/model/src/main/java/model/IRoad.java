package model;

import java.awt.Image;
import java.util.Observable;

import Element.Element;

public interface IRoad {
	public int getWidth();
	public int getHeight();
	public Element getElementRoad();
	public void setHeroHasChange();
	public Observable getObservable();
}
