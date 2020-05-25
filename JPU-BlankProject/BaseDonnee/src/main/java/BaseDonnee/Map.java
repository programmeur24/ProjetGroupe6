package BaseDonnee;
import java.sql.ResultSet;
import java.sql.SQLException;

import BaseDonnee.IMap;
import BaseDonnee.BDConnection;

public class Map extends BDConnection implements IMap{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7505708090769435042L;
	public ResultSet re;

	public Map() {
		this.re = null;
	}

	public String selectMap(int id) {
		String rq  = "SELECT Name_Mape FROM `maps` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name_Mape");
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

	public String selectMetal(int id) {
		String rq  = "SELECT Name_Metal FROM `maps` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name_Metal");
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

	public String selectBrokenWall(int id) {
		System.out.println("je passe par ici");
		String rq  = "SELECT Name_Mur_Detruit FROM `maps` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name_Mur_Detruit");
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

	public String selectWall(int id) {
		String rq  = "SELECT Name_Mur FROM `maps` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name_Mur");
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

	public String selectStone(int id) {
		String rq  = "SELECT Name_Roche FROM `maps` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name_Roche");
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

	public String selectDiamond(int id) {
		String rq  = "SELECT Name_Diamant FROM `maps` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name_Diamant");
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

	public String selectMonstre(int id) {
		String rq  = "SELECT Name_Monstre FROM `maps` WHERE Id = "+id;
		re = executeQuery(rq);
		try {
			re.next();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			return re.getString("Name_Monstre");
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
