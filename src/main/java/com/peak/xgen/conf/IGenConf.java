package com.peak.xgen.conf;

import java.util.Map;

import com.peak.xgen.conf.model.GenConfModel;
import com.peak.xgen.conf.model.ModuleGenConfModel;

public interface IGenConf {
	
	public GenConfModel getGenConfModel();
	
	public Map<String, ModuleGenConfModel> getModuleMap();
}
