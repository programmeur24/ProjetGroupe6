package Group;

public class GroupElementFactory {
	//****ATTRIBUT****//
	private final static BrokenWall brokenWall =  new BrokenWall();
	private final static Diamond diamond = new Diamond();
	private final static Metal metal = new Metal();
	private final static Stone stone = new Stone();
	private final static Wall wall = new Wall();
	private static GroupElement groupElement[] = {
			brokenWall,
			diamond,
			metal,
			stone,
			wall,
	};
	
	
	
	//****GETTERS****//
	public static GroupElement getFromFileSymbole(char symbole) {
		for(GroupElement ge : groupElement) {
			if(ge.getCorrespondence().getCharacterImage() == symbole) {
				 return ge;
			}
		}
		return brokenWall;
	}
	
	
	
	//****METHODES****//
	public GroupElement createBrokenWall() {
		return brokenWall;
	}
	
	public GroupElement createDiamond() {
		return diamond;
	}
	
	public GroupElement createcreateStone() {
		return stone;
	}
	
	public GroupElement createMetal() {
		return metal;
	}
	
	public GroupElement createWall() {
		return wall;
	}
}
