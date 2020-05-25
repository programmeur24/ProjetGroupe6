package com.entity.motionlesselements;

import java.io.IOException;

import entity.Sprite;

public class ExitDoor extends MotionlessElements{

	//****METHODES****//
	private static final Sprite sprite = new Sprite('e',"Door.png");
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//****CONSTRUCTOR****//
	public ExitDoor(int x, int y) {
		super(sprite, x, y);
	}
	
	

}
