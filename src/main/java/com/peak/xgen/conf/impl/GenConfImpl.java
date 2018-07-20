package com.peak.xgen.conf.impl;

import java.util.Map;

import com.peak.xgen.conf.IGenConf;
import com.peak.xgen.conf.implementors.GenConfImplementor;
import com.peak.xgen.conf.manager.ConfManager;
import com.peak.xgen.conf.model.GenConfModel;
import com.peak.xgen.conf.model.ModuleGenConfModel;

public class GenConfImpl implements IGenConf {
	private static GenConfImpl iGenConf;
	private GenConfImplementor provider;
	
	public GenConfImpl(GenConfImplementor provider) {
		this.provider = provider;
	}

	public static IGenConf getInstance(GenConfImplementor provider) {
		if(iGenConf == null) {
			iGenConf = new GenConfImpl(provider);
		}
		return iGenConf;
	}
	
	@Override
	public GenConfModel getGenConfModel() {
		return ConfManager.getInstance(provider).getGenConfModel();
	}

	@Override
	public Map<String, ModuleGenConfModel> getModuleMap() {
		return ConfManager.getInstance(provider).getModuleMap();
	}

}
