package BaseDonnee;

public class Main {
	public Map map;
	//public static BDConnection con;
	public static void main(String[] args) {
		//System.out.println("Bonjour");
		//con = new BDConnection();
		//System.out.println(con.open());
			Map map = new Map();
			map.open();
			String a = map.selectBrokenWall(1);
			System.out.println(a);
		//con.close();
	}

}
