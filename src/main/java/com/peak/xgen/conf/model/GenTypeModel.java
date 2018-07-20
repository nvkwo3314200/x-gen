package com.peak.xgen.conf.model;

import java.util.HashMap;
import java.util.Map;

public class GenTypeModel {
	private String id;
	private String type;
	private Map<String, String> paramMap = new HashMap<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Map<String, String> getParamMap() {
		return paramMap;
	}
	public void setParamMap(Map<String, String> paramMap) {
		this.paramMap = paramMap;
	}
}
