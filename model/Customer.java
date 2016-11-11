package model;

import java.util.ArrayList;

public class Customer {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [user=" + user + ", name=" + name + ", watchAni=" + watchAni + "]";
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
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
	 * @return the watchAni
	 */
	public ArrayList<Anime> getWatchAni() {
		return this.watchAni;
	}

	public void addWatchAni(Anime ani) {
		this.watchAni.add(ani);
	}

	/**
	 * @param watchAni
	 *            the watchAni to set
	 */
	public void setWatchAni(ArrayList<Anime> watchAni) {
		this.watchAni = watchAni;
	}

	private String user, name;
	private ArrayList<Anime> watchAni;

	public Customer(String user, String name) {
		super();
		this.user = user;
		this.name = name;
	}

}
