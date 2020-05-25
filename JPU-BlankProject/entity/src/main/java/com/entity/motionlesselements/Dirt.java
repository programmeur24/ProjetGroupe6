package com.entity.motionlesselements;

import java.io.IOException;

import entity.Sprite;

public class Dirt extends MotionlessElements {

	//***ATTRIBURT****//         
	private static final Sprite sprite = new Sprite('t',"Dirt.png");
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//****CONSTRUCTOR****//
	public Dirt(int x, int y) {
		super(sprite, x, y);
	}
}
