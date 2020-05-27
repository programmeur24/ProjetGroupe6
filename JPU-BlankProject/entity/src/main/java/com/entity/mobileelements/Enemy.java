package com.entity.mobileelements;

import java.io.IOException;

import com.strategy.RandomEnemyMove;

import entity.Sprite;
/**
 * The Enemy class.
 *
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 */
public class Enemy extends MobileElements {

	/**
	 * The basic sprite of an enemy.
	 */
	private static final Sprite spriteDown = new Sprite('i',"Enemy.png");
	static {
		try {
			spriteDown.loadImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The enemy's constructor
	 * @param x the initial position of the enemy x
	 * @param y the initial position of the enemy y
	 */
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
