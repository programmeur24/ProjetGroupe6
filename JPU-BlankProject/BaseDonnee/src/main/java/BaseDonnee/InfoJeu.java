package BaseDonnee;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoJeu extends BDConnection implements IInfoJeu{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6757195748477609354L;
	private ResultSet re;
	
	public InfoJeu() {
		
	}

	public int selectScore(int idMap, int idPersonnage) {
		String rq  = "SELECT score FROM play WHERE Id_Player = "+idMap+" AND Id_Maps = "+idPersonnage;
		re = executeQuery(rq);
		try {
			return re.getInt("score");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insertScore(int score, int idMap, int idPersonnage) {
		String rq = "UPDATE play SET score= 50  WHERE Id_Player = 1 AND Id_Maps = 1";
		return executeUpdate(rq);
	}

	public int selectTime(int idMap, int idPersonnage) {
		String rq  = "SELECT time FROM play WHERE Id_Player = "+idMap+" AND Id_Maps = "+idPersonnage;
		re = executeQuery(rq);
		try {
			return re.getInt("time");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
