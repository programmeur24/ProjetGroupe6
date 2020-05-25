package com.collisionshandler;

import com.entity.mobileelements.Diamond;
import com.entity.mobileelements.Enemy;
import com.entity.mobileelements.Player;
import com.entity.mobileelements.Stone;
import com.entity.motionlesselements.ExitDoor;
import com.entity.motionlesselements.Path;
import com.entity.motionlesselements.Walls;

import entity.Entity;


public class CollisionsHandler {


	
	//****CONSTRUCTOR****//
	public CollisionsHandler() {

	}
	
	
	
	//****METHODES****//
	public boolean checkForCollisions(Entity[][] entity, int x, int y) {
		if (entity[x][y] instanceof Stone) {
			return true;
		} else if (entity[x][y] instanceof Walls) {
			return true;
		} else if (entity[x][y] instanceof ExitDoor) {
			return true;
		} else if (entity[x][y] instanceof Enemy) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkForDiamonds(Entity[][] playerPosition, int x, int y) {

		if (playerPosition[x][y] instanceof Diamond) {
			return true;
		}
		return false;
	}
	
	public boolean checkForPlayer(Entity[][] entity, int x, int y) {

		if (entity[x][y] instanceof Player) {
			return true;
		}
		return false;
	}
	
	public boolean checkForPath(Entity[][] entity, int x, int y) {

		if (entity[x][y] instanceof Path) {
			return false;
		}
		return true;
	}
	
	public boolean checkForStoneToMove(Entity[][] entity, int x, int y, int sideX) { 

		if (entity[x][y] instanceof Stone && entity[x+sideX][y] instanceof Path) {
			return true;
		}
		return false;
	}

}