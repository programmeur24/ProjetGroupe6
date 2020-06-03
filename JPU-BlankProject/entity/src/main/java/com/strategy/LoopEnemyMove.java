package com.strategy;

import com.entity.mobileelements.Enemy;

/**
 * The LoopEnemyMove class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */
public class LoopEnemyMove  extends Strategy<Enemy> {


	private Enemy me = null;
	
	/**
	 * The CascadeFalling strategy constructor.
	 * @param me the mobile element concerned
	 */
	
	public LoopEnemyMove(Enemy me) {
		this.me = me;
	}
	
	
	public void runStrategy() {
		
		double randomDirection = Math.random();
		randomDirection = randomDirection * 2 +1;
		int randomDirInt = (int) randomDirection;
		
		switch(randomDirInt) {
		case 1:
			me.entityMove(1, 0, 0, 'S');
			break;
		case 2:
			me.entityMove(-1, 0, 0, 'S');
			break;
		}
		
	}

	/**
	 * @return LoopEnemyMove
	 */
	public String returnStrategy() {
		return "LoopEnemyMove";
	}
}
