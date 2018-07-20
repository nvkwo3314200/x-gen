package com.peak.xgen.conf.manager;

import java.sql.Date;
import java.util.Map;

import com.peak.xgen.conf.implementors.GenConfImplementor;
import com.peak.xgen.conf.model.GenConfModel;
import com.peak.xgen.conf.model.ModuleGenConfModel;

public class ConfManager {
	private static ConfManager confManager;
	private GenConfModel genConfModel;
	private Map<String, ModuleGenConfModel> moduleMap;
	private GenConfImplementor provider;
	
	private ConfManager(GenConfImplementor provider) {
		this.provider = provider;
	}
	
	public static ConfManager getInstance(GenConfImplementor provider) {
		if(confManager == null) confManager = new ConfManager(provider);
		return confManager;
	}
	
	public GenConfModel getGenConfModel() {
		
		return null;
	}

	public Map<String, ModuleGenConfModel> getModuleMap() {
		return null;
	}
	
}
