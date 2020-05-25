package com.entity.motionlesselements;

import java.io.IOException;

import entity.Sprite;


public class Path extends MotionlessElements {
	
	//****ATTRIBUTS****//
	private static final Sprite sprite = new Sprite('u',"Background.png");
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//****CONSTRUCTOR****//
	public Path(int x, int y) {
		super(sprite, x, y);
	}
}
