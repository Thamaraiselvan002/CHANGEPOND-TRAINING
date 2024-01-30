package com.hibernate.practise;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Song_List")
public class Song {
		@Id
		@Column (name="Song_ID")
		private int id;
		
		@Column (name="Song_Name")
		private String song_name;
		
		@Column (name="Singer_Name")
		private String singer;
		
		
		
		public Song() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public Song(int id, String song_name, String singer) {
			super();
			this.id = id;
			this.song_name = song_name;
			this.singer = singer;
		}


		@Override
		public String toString() {
			return "Song [id=" + id + ", song_name=" + song_name + ", singer=" + singer + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSong_name() {
			return song_name;
		}
		public void setSong_name(String song_name) {
			this.song_name = song_name;
		}
		public String getSinger() {
			return singer;
		}
		public void setSinger(String singer) {
			this.singer = singer;
		}
}
