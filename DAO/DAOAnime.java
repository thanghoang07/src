package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Anime;

public class DAOAnime {
	private static ArrayList<Anime> listAnime;

	public static ArrayList<Anime> getListAnime() {
		if (DAOAnime.listAnime == null) {
			DAOAnime.listAnime = new ArrayList<Anime>();
		}
		if (DAOAnime.listAnime.size() == 0) {
			try {
				Connection conn = DatabaseConnection.getConnection();

				if (conn != null) {
					Statement stmt = conn.createStatement();
					String sql = " Select * from Anime";
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String urlImg = rs.getString("imgUrl");
						String nhaSX = rs.getString("nhaSX");

						//
						listAnime.add(new Anime(name, urlImg, nhaSX, id));
					}
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return DAOAnime.listAnime;
	}
}
