package com.peak.xgen.conf.model;

import java.util.HashMap;
import java.util.Map;

public class ThemeModel {
	private String id;
	private Map<String, GenTypeModel> genTypeMap = new HashMap<>();
	private Map<String, String> genOutTypeMap = new HashMap<>();
	private Map<String, String> providerMap = new HashMap<>();
	
	public Map<String, GenTypeModel> getGenTypeMap() {
		return genTypeMap;
	}
	public void setGenTypeMap(Map<String, GenTypeModel> genTypeMap) {
		this.genTypeMap = genTypeMap;
	}
	public Map<String, String> getGenOutTypeMap() {
		return genOutTypeMap;
	}
	public void setGenOutTypeMap(Map<String, String> genOutTypeMap) {
		this.genOutTypeMap = genOutTypeMap;
	}
	public Map<String, String> getProviderMap() {
		return providerMap;
	}
	public void setProviderMap(Map<String, String> providerMap) {
		this.providerMap = providerMap;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
