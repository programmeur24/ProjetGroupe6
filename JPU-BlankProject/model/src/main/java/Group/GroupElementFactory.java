package Group;

public class GroupElementFactory {
	//****ATTRIBUT****//
	private final BrokenWall brokenWall =  new BrokenWall();
	private final Diamond diamond = new Diamond();
	private final Metal metal = new Metal();
	private final Stone stone = new Stone();
	private final Wall wall = new Wall();
	private GroupElement groupElement[] = {
			brokenWall,
			diamond,
			metal,
			stone,
			wall,
	};
	
	
	
	//****GETTERS****//
	public GroupElement getFromFileSymbole(char symbole) {
		//Le reste à developper apres les tests
		return brokenWall;
	}
	
	
	
	//****METHODES****//
	public GroupElement createBrokenWall() {
		return brokenWall;
	}
	
	public GroupElement Diamond() {
		return diamond;
	}
	
	public GroupElement createStone() {
		return stone;
	}
	
	public GroupElement Metal() {
		return metal;
	}
	
	public GroupElement createWall() {
		return wall;
	}
}
