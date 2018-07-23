package com.peak.xgen.conf.implementors;

import java.util.Map;

import com.peak.xgen.conf.model.GenTypeModel;

public interface ThemeImplementor {
	public Map<String, GenTypeModel> getGenTypeModelMap();
	
	public Map<String, String> getOutGenTypeMap();
	
	public Map<String, String> getProviderMap();
}
