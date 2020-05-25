package BaseDonnee;

public interface IMap {
	public String selectMap(int id);
	public String selectMetal(int id);
	public String selectBrokenWall(int id);
	public String selectWall(int id);
	public String selectStone(int id);
	public String selectDiamond(int id);
	public String selectMonstre(int id);
	public boolean open();
	public void close();
}
