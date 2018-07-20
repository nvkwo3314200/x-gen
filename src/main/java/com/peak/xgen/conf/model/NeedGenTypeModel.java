package com.peak.xgen.conf.model;

import java.util.HashMap;
import java.util.Map;

public class NeedGenTypeModel {
	private String id;
	private Map<String, String> needGenOutTypeMap = new HashMap<>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<String, String> getNeedGenOutTypeMap() {
		return needGenOutTypeMap;
	}
	public void setNeedGenOutTypeMap(Map<String, String> needGenOutTypeMap) {
		this.needGenOutTypeMap = needGenOutTypeMap;
	}
}
