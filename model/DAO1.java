package model;

import java.util.ArrayList;

public class DAO1 {
	private static ArrayList<Anime> listAnime;

	public static void addListProducct(Anime pr) {
		DAO1.listAnime.add(pr);
	}

	public static ArrayList<Anime> getListAnime() {
		if (DAO1.listAnime == null) {
			DAO1.listAnime = new ArrayList<Anime>();
		}
		if (DAO1.listAnime.size() == 0) {
			DAO1.listAnime.add(new Anime("Doraemon",
					"https://pbs.twimg.com/profile_images/378800000735295842/dffd65a90ee30719b5438b376f37b1d8_400x400.jpeg",
					"Asahi", 01));
			DAO1.listAnime.add(new Anime("Sword Art Online",
					"http://is2.mzstatic.com/image/thumb/Music4/v4/eb/b9/e3/ebb9e3e9-063b-9938-3091-6dc0b3a3e303/source/400x400-75.jpg",
					"A-1 pictures", 02));
			DAO1.listAnime.add(new Anime("Dragon ball",
					"https://pbs.twimg.com/profile_images/607566476648837120/uldbey5v.jpg", "Toei Animation", 03));
			DAO1.listAnime.add(new Anime("One piece",
					"http://anhnendep.net/wp-content/uploads/2015/07/hinh-nen-iphone-6-one-piece-tuyet-dep.png",
					"Toei Animation", 04));
			DAO1.listAnime.add(new Anime("One piece",
					"http://anhnendep.net/wp-content/uploads/2015/07/hinh-nen-iphone-6-one-piece-tuyet-dep.png",
					"Toei Animation", 05));
			DAO1.listAnime.add(new Anime("Naruto shippuuden",
					"",
					"Toei Animation", 06));
		}
		return DAO1.listAnime;
	}
}