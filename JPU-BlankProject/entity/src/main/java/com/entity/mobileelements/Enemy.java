package com.entity.mobileelements;

import java.io.IOException;

import com.strategy.RandomEnemyMove;

import entity.Sprite;

public class Enemy extends MobileElements {

	//****ATTRIBUTS****//
	private static final Sprite spriteDown = new Sprite('i',"Enemy.png");
	static {
		try {
			spriteDown.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//****CONSTRUCTOR****//
	public Enemy(int x, int y) {
		super(spriteDown, x, y);
		this.setStrategy(new RandomEnemyMove(this));
		this.isAlive = true;
	}
	
	/**
	 * The getSpriteDown method.
	 * @return Sprite the down sprite of the enemy
	 */
	public Sprite getSpriteDown() {
		return Enemy.spriteDown;
	}

}
