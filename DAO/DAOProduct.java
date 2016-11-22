package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;

public class DAOProduct {
	private static ArrayList<Product> list;

	public static ArrayList<Product> getListProduct() {
		if (DAOProduct.list == null) {
			DAOProduct.list = new ArrayList<Product>();
		}
		if (DAOProduct.list.size() == 0) {
			try {
				Connection conn = DatabaseConnection.getConnection();

				if (conn != null) {
					Statement stmt = conn.createStatement();
					String sql = " Select * from Product";
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String urlImg = rs.getString("imgUrl");
						int price = rs.getInt("price");
						int perSale = rs.getInt("perSale");

						//
						list.add(new Product(name, urlImg, id, price, perSale));
					}
					stmt.close();
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return DAOProduct.list;
	}

}
