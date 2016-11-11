package model;

import java.util.ArrayList;

public class Anime {

	private String name, imgUrl, nhaSX;
	private int id;
	private ArrayList<Anime> list = new ArrayList<Anime>();

	public Anime() {
	}

	public Anime(String name, String imgUrl, String nhaSX, int id) {
		super();
		this.name = name;
		this.imgUrl = imgUrl;
		this.nhaSX = nhaSX;
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the imgUrl
	 */
	public String getImgUrl() {
		return imgUrl;
	}

	/**
	 * @param imgUrl
	 *            the imgUrl to set
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	/**
	 * @return the nhaSX
	 */
	public String getNhaSX() {
		return nhaSX;
	}

	/**
	 * @param nhaSX
	 *            the nhaSX to set
	 */
	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Anime> printList() {
		list.add(new Anime("Doraemon", "https://pbs.twimg.com/profile_images/378800000735295842/dffd65a90ee30719b5438b376f37b1d8_400x400.jpeg", "Asahi", 01));
		list.add(new Anime("Sword Art Online", "http://is2.mzstatic.com/image/thumb/Music4/v4/eb/b9/e3/ebb9e3e9-063b-9938-3091-6dc0b3a3e303/source/400x400-75.jpg", "A-1 pictures", 02));
		list.add(new Anime("Dragon ball", "https://pbs.twimg.com/profile_images/607566476648837120/uldbey5v.jpg", "Toei Animation", 03));
		list.add(new Anime("One piece", "http://anhnendep.net/wp-content/uploads/2015/07/hinh-nen-iphone-6-one-piece-tuyet-dep.png", "Toei Animation", 04));
		list.add(new Anime("One piece", "http://anhnendep.net/wp-content/uploads/2015/07/hinh-nen-iphone-6-one-piece-tuyet-dep.png", "Toei Animation", 04));
		return list;
	}
}
