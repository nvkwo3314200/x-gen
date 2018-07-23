package com.peak.xgen.conf.manager;

import java.util.HashMap;
import java.util.Map;

import com.peak.xgen.conf.implementors.GenConfImplementor;
import com.peak.xgen.conf.implementors.ModuleGenConfImplementor;
import com.peak.xgen.conf.implementors.ThemeImplementor;
import com.peak.xgen.conf.model.GenConfModel;
import com.peak.xgen.conf.model.ModuleGenConfModel;
import com.peak.xgen.conf.model.NeedGenModel;

public class ConfManager {
	private static ConfManager confManager;
	private GenConfModel genConfModel = new GenConfModel();
	private Map<String, ModuleGenConfModel> moduleMap = new HashMap<>();
	private GenConfImplementor provider;
	
	public GenConfModel getGenConfModel() {
		return this.genConfModel;
	}
	
	public static ConfManager getInstance(GenConfImplementor provider) {
		if(confManager == null) confManager = new ConfManager(provider);
		return confManager;
	}

	public Map<String, ModuleGenConfModel> getModuleMap() {
		return this.moduleMap;
	}
	
	private ConfManager(GenConfImplementor provider) {
		this.provider = provider;
		readGenConf();
	}
	
	private void readGenConf() {
		genConfModel.setConstantMap(provider.getConstantMap());
		genConfModel.setNeedGenModelList(provider.getNeedGenModelList());
		genConfModel.setThemeModelList(provider.getThemeModelList());
		for(NeedGenModel model : genConfModel.getNeedGenModelList()) {
			readGenModelConf(model);
		}
	}

	private void readGenModelConf(NeedGenModel model) {
		ModuleGenConfModel module = new ModuleGenConfModel();
		String providerClass = this.genConfModel.getThemeById(module.getThemeId()).getProviderMap().get(model.getProvider());
		ModuleGenConfImplementor moduleGenConfImplementor = null;
		try {
			moduleGenConfImplementor = (ModuleGenConfImplementor) Class.forName(providerClass).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		// TODO if(themeImplementor == null);
		module = moduleGenConfImplementor.getBaseModuleGenConfModel(model.getParamMap());
		module.setModuleId(model.getId());
		module.setThemeId(model.getThemeId());
		module.setExtendConfList(moduleGenConfImplementor.getExtendConfModel(model.getParamMap()));
		module.setNeedGentTypeMap( moduleGenConfImplementor.getNeedGenTypeModelMap(genConfModel, model.getParamMap()));
		
		moduleMap.put(module.getModuleId(), module);
		
	}

	
	

	
}
