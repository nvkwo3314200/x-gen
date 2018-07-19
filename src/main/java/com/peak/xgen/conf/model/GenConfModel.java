package com.peak.xgen.conf.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenConfModel {
	
	private List<NeedGenModel> needGenModelList = new ArrayList<NeedGenModel>();
	
	private List<ThemeModel> themeModelList = new ArrayList<>();
	
	private Map<String, String> constantMap = new HashMap<>();

	public List<NeedGenModel> getNeedGenModelList() {
		return needGenModelList;
	}

	public void setNeedGenModelList(List<NeedGenModel> needGenModelList) {
		this.needGenModelList = needGenModelList;
	}

	public List<ThemeModel> getThemeModelList() {
		return themeModelList;
	}

	public void setThemeModelList(List<ThemeModel> themeModelList) {
		this.themeModelList = themeModelList;
	}

	public Map<String, String> getConstantMap() {
		return constantMap;
	}

	public void setConstantMap(Map<String, String> constantMap) {
		this.constantMap = constantMap;
	}
	
	
}
