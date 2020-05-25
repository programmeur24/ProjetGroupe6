package com.entity.mobileelements;

import java.io.IOException;

import com.strategy.BasicFalling;

import entity.Sprite;

public class Diamond extends MobileElements {

	//****ATTRIBUTS****//
	private static final Sprite sprite = new Sprite('x',"Diamond.png");
	
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//****CONSTROCTOR****//
	public Diamond(int x, int y) {
		super(sprite, x, y);
		this.setStrategy(new BasicFalling(this));
	}
}
