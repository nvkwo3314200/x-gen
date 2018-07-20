package com.peak.xgen.conf.model;

import java.util.HashMap;
import java.util.Map;

public class NeedGenModel {
	private String id;
	private String provider;
	private Map<String, String> paramMap = new HashMap<>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public Map<String, String> getParamMap() {
		return paramMap;
	}
	public void setParamMap(Map<String, String> paramMap) {
		this.paramMap = paramMap;
	}
}
