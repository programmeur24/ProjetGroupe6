package com.strategy;

import com.entity.mobileelements.Enemy;

/**
 * The LoopEnemyMove class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */

public class RandomEnemyMove extends Strategy<Enemy> {

	//****Initialization of an enemy****//
	private Enemy me = null;
	
	/**
	 * 
	 * @param me
	 */
	public RandomEnemyMove(Enemy me) {
		this.me = me;
	}

	
	public void runStrategy() {
		
		if(me.getIsAlive()) {
			double randomDirection = Math.random();
			randomDirection = randomDirection * 4 +1;
			int randomDirInt = (int) randomDirection;
			switch(randomDirInt) {
			case 1:
				me.entityMove(0, -1, 0, 'S');
				break;
			case 2:
				me.entityMove(-1, 0, 0, 'S');
				break;
			case 3:
				me.entityMove(0, 1, 0, 'S');
				break;
			case 4:
				me.entityMove(+1, 0, 0, 'S');
				break;
			}
		} else {
			me.loadImage('X', me);
		}
		
		
		
	}

	/**
	 * RandomEnemyMove
	 */
	public String returnStrategy() {
		return "RandomEnemyMove";
	}

}
