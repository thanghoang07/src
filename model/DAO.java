package model;

import java.util.ArrayList;

public class DAO {
	private static ArrayList<Product> listProduct;

	public static void addListProducct(Product pr) {
		DAO.listProduct.add(pr);
	}

	public static ArrayList<Product> getListProduct() {
		if (DAO.listProduct == null) {
			DAO.listProduct = new ArrayList<Product>();
		}
		if (DAO.listProduct.size() == 0) {
			DAO.listProduct.add(new Product("avc",
					"https://scontent-hkg3-1.xx.fbcdn.net/v/t1.0-9/14650200_1250269528370443_1698524724558034828_n.jpg?oh=959df0db09b1051dff3bf0972e7f6724&oe=58959A5D",
					1, 1234, 1));
			DAO.listProduct.add(new Product("avc",
					"https://scontent-hkg3-1.xx.fbcdn.net/v/t1.0-9/14650200_1250269528370443_1698524724558034828_n.jpg?oh=959df0db09b1051dff3bf0972e7f6724&oe=58959A5D",
					3, 1233, 2));
			DAO.listProduct.add(new Product("avc",
					"https://scontent-hkg3-1.xx.fbcdn.net/v/t1.0-9/14650200_1250269528370443_1698524724558034828_n.jpg?oh=959df0db09b1051dff3bf0972e7f6724&oe=58959A5D",
					2, 2324, 3));
		}
		return DAO.listProduct;
	}
}
