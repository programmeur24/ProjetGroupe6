package BaseDonnee;

public class Main {
	public Map map;
	public static BDConnection con;
	public static void main(String[] args) {
		System.out.println("Bonjour");
		con = new BDConnection();
		System.out.println(con.open());
		con.close();
	}

}
