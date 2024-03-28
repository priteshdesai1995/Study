package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JsonResponseDTO {
	private int albumId;

	@JsonIgnore
	private int id;
	private String title;
	private String url;
	private String thumbnailUrl;

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	@Override
	public String toString() {
		return "JsonResponseDTO [albumId=" + albumId + ", id=" + id + ", title=" + title + ", url=" + url
				+ ", thumbnailUrl=" + thumbnailUrl + "]";
	}

}
