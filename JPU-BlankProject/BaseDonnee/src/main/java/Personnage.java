import java.sql.ResultSet;
import java.sql.SQLException;

public class Personnage extends BDConnection implements IPersonnage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5663661208228644072L;
	private ResultSet re;

	public Personnage() {
		this.re = null;
	}
	
	public String selectPersonnage(int id) {
		String rq  = "SELECT Name FROM `player` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			return re.getString("Name");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
