package Element;

import java.awt.Image;

public class Element implements IElement{
	//****ATTRIBUT****//
	private Type type;
	private static Correspondence correspondence;
	
	
	
	//****CONSTRUCTEUR****//
	public Element(Type type, Correspondence correspondence) {
		this.type = type;
		this.correspondence = correspondence;
	}
	
	
	
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
	public Type getType() {
		return type;
	}
	public Image getImage() {
		return getCorrespondence().getImage();
	}
	
	
	
	//****SETTERS****//
	public void setType(Type type) {
		this.type = type;
	}

	public void setCorrespondence(Correspondence correspondence) {
		this.correspondence = correspondence;
	}
}
