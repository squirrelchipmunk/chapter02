package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song();
		s1.setArtist("아이유");
		s1.setTitle("좋은날");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setTrack("3");
		s1.setComposer("이민수");

		Song s2 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,"2");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
