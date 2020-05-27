package com.entity.mobileelements;

import java.io.IOException;

import com.strategy.BasicFalling;

import entity.Sprite;

/**
 * The diamond class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */
public class Diamond extends MobileElements {

	/**
	 * The basic sprite of a diamond.
	 */
	private static final Sprite sprite = new Sprite('x',"Diamond.png");
	
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The diamond's constructor.
	 * @param x the position of diamonds in x
	 * @param y the position of diamonds in y
	 */
	public Diamond(int x, int y) {
		super(sprite, x, y);
		this.setStrategy(new BasicFalling(this));
	}
}
