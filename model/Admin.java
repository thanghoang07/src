package model;

import java.util.ArrayList;

public class Admin {
	private String email, pass;

	private static ArrayList<Anime> watchAni;

	public Admin(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Admin [email=" + email + "]";
	}

	public ArrayList<Anime> getWatchAni() {
		return Admin.watchAni;
	}

	public void addWatchAni(Anime ani) {
		Admin.watchAni.add(ani);
	}

	/**
	 * @param watchAni
	 *            the watchAni to set
	 */
	public void setWatchAni(ArrayList<Anime> watchAni) {
		Admin.watchAni = watchAni;
	}
}