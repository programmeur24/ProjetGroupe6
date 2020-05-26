package entity;

import com.strategy.Strategy;

public abstract class Entity {
	//****ATTRIBUT****//
	//****The sprite of the entity****//
	private Sprite sprite;
	//****The x position of the entity****//
	private int positionX;
	//****The y position of the entity****//
	private int positionY;
	//****The map on which the entity is****//
	private Map map;
	//****The boolean that indicates if the entity if falling or not****//
	private boolean isFallen;
	//****The strategy of the entity****//
	private Strategy<?> strategy;
	
	
	
	//****CONSTRUCTOR****//
	public Entity(final Sprite sprite, int x, int y) {
		this.setSprite(sprite);
		this.positionX = x;
		this.positionY = y;
	}
	
	public Entity() {
		
	}
	
	
	
	//****SETTERS****//
	public void setMap(Map map) {
		this.map = map;
	}
	
	public final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }
	
	public void setPositionX(int x) {
		this.positionX = x;
	}
	
	public void setIsFallen(boolean isFallen) {
		this.isFallen = isFallen;
	}
	
	public void setStrategy(Strategy<?> strategy) {
		this.strategy = strategy;
	}
	
	
	
	//****GETTERS****//
	public Map getMap() {
		return this.map;
	}
	
	public final Sprite getSprite() {
        return this.sprite;
    }

	public int getPositionX() {
		return this.positionX;
	}
	
	public int getPositionY() {
		return this.positionY;
	}

	public void setPositionY(int y) {
		this.positionY = y;
	}

	public Sprite getSpriteUp() {
		return null;
	}

	public Sprite getSpriteDown() {
		return null;
	}

	public Sprite getSpriteTurnLeft() {
		return null;
	}
	
	public Sprite getSpriteTurnRight() {
		return null;
	}

	public Sprite getSpriteDeath() {
		return null;
	}

	public boolean getIsFallen() {
		return isFallen;
	}

	public Strategy<?> getStrategy() {
		return strategy;
	}
}