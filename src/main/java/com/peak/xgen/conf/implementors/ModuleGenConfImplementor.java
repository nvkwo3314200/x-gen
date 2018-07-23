package com.peak.xgen.conf.implementors;

import java.util.List;
import java.util.Map;

import com.peak.xgen.conf.model.ExtendConfModel;
import com.peak.xgen.conf.model.GenConfModel;
import com.peak.xgen.conf.model.ModuleGenConfModel;
import com.peak.xgen.conf.model.NeedGenTypeModel;

public interface ModuleGenConfImplementor {
	
	public ModuleGenConfModel getBaseModuleGenConfModel(Map<String, String> paramMap);
	
	public List<ExtendConfModel> getExtendConfModel(Map<String,String> paramMap);
	
	public Map<String, NeedGenTypeModel> getNeedGenTypeModelMap(GenConfModel genConfModel, Map<String, String> paramMap);
	
}
