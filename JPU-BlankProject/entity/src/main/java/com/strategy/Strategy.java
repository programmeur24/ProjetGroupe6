package com.strategy;

import com.entity.mobileelements.MobileElements;

import entity.Entity;

/**
 * The Strategy class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */

public abstract class Strategy<T extends Entity> {
	
	//****The mobile element concerned by the strategy****//
	protected MobileElements me = null;
	//****The method that contains the strategy****//
	public abstract void runStrategy();
	//****The method that gives the name of the strategy****//
	public abstract String returnStrategy();
}
