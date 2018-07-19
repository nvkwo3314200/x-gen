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
}
