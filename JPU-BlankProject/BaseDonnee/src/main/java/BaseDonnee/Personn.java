package BaseDonnee;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Personn extends BDConnection implements IPersonnage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5663661208228644072L;
	private ResultSet re;

	public void Personnage() {
		this.re = null;
	}
	
	public String selectPersonnage(int id) {
		String rq  = "SELECT Name FROM `player` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			re.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
