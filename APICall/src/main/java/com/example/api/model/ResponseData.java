package com.example.api.model;

import java.util.List;

public class ResponseData {
	List<JsonResponseDTO> jsonResponseDTOs;

	public List<JsonResponseDTO> getJsonResponseDTOs() {
		return jsonResponseDTOs;
	}

	public void setJsonResponseDTOs(List<JsonResponseDTO> jsonResponseDTOs) {
		this.jsonResponseDTOs = jsonResponseDTOs;
	}

	@Override
	public String toString() {
		return "ResponseData [jsonResponseDTOs=" + jsonResponseDTOs + "]";
	}

}
