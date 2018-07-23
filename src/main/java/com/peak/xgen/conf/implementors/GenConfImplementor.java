package com.peak.xgen.conf.implementors;

import java.util.List;
import java.util.Map;

import com.peak.xgen.conf.model.NeedGenModel;
import com.peak.xgen.conf.model.ThemeModel;

public interface GenConfImplementor {
	
	public  List<NeedGenModel> getNeedGenModelList();
	
	public List<ThemeModel> getThemeModelList();
	
	public Map<String, String> getConstantMap();
}
