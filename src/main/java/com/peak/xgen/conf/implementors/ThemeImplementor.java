package com.peak.xgen.conf.implementors;

import java.util.List;
import java.util.Map;

import com.peak.xgen.conf.model.GenTypeModel;

public interface ThemeImplementor {
	public List<GenTypeModel> getGenTypeModelList();
	
	public Map<String, String> getOutGenTypeMap();
	
	public Map<String, String> getProviderMap();
}
