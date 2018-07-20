package com.peak.xgen.conf.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuleGenConfModel {
	private String moduleId;
	private String themeId;
	private Map<String, NeedGenTypeModel> needGentTypeMap = new HashMap<>();
	private List<ExtendConfModel> extendConfList = new ArrayList<>();
	
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getThemeId() {
		return themeId;
	}
	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}
	public Map<String, NeedGenTypeModel> getNeedGentTypeMap() {
		return needGentTypeMap;
	}
	public void setNeedGentTypeMap(Map<String, NeedGenTypeModel> needGentTypeMap) {
		this.needGentTypeMap = needGentTypeMap;
	}
	public List<ExtendConfModel> getExtendConfList() {
		return extendConfList;
	}
	public void setExtendConfList(List<ExtendConfModel> extendConfList) {
		this.extendConfList = extendConfList;
	}
	
}
