package com.javaex.ex05;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;

	// 생성자
	public Song() {
		//메모리 올리는 일
	}
	
	public Song(String title, String artist, String album, String composer) {
		this(title, artist, album, composer, 0);
	}
	
	
	public Song(String title, String artist, String album, String composer, int year) {
		//메모리 올리는 일
		this.title = title;
		this.artist = artist;
		this.album = album;
		
		// 이름이 최대 10글자
		this.composer = composer;
		
		// 년도가 2021이후면 2021로 처리
		this.year = year;
	}
	
	public Song(String title, String artist, String album, String composer, int year, String track) {
		//메모리 올리는 일
		this(title, artist, album, composer, year);
		/*
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		*/
		this.track = track;
	}

	// 메소드g/s
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	// 메소드일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
