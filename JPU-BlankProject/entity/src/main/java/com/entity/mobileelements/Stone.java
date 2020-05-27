package com.entity.mobileelements;

import java.io.IOException;

import com.strategy.CascadeFalling;


import entity.Sprite;

/**
 * The Stone class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */
public class Stone extends MobileElements {

	/**
	 * The basic sprite of a stone.
	 */
	private static final Sprite sprite = new Sprite('o',"Stone.png");
	static {
		try {
			sprite.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * The stone's constructor
	 * @param x the initial position of the  stone x on the map
	 * @param y the initial position odf the stone y on the map
	 */
	public Stone(int x, int y) {
		
		super(sprite, x, y);
		this.setStrategy(new CascadeFalling(this));
	}

}
