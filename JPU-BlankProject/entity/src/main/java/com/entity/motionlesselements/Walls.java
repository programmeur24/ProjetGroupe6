package com.entity.motionlesselements;

import java.io.IOException;

import entity.Sprite;

public class Walls extends MotionlessElements {
	
	//****ATTRUBUTSs***//
	private static final Sprite sprite = new Sprite('q',"Wall.png");
	
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//****CONSTRUCTOR****//
	public Walls(int x, int y) {
		super(sprite, x, y);
	}
	
	

}
