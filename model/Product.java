package model;

import java.util.ArrayList;

/**
 * @author thang
 *
 */
public class Product {

	private String name, imgUrl;
	private int id, price;
	private double perSale;
	private ArrayList<Product> list = new ArrayList<Product>();

	public Product() {

	}

	public Product(String name, String imgUrl, int id, int price, double perSale) {
		super();
		this.name = name;
		this.imgUrl = imgUrl;
		this.id = id;
		this.price = price;
		this.perSale = perSale;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", imgUrl=" + imgUrl + ", id=" + id + ", price=" + price + ", perSale="
				+ perSale + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getPerSale() {
		return perSale;
	}

	public void setPerSale(double perSale) {
		this.perSale = perSale;
	}

	public ArrayList<Product> getList() {
		return list;
	}

	public void setList(ArrayList<Product> list) {
		this.list = list;
	}

}