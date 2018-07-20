package com.peak.xgen.conf.implementors;

import java.util.List;

import com.peak.xgen.conf.model.ExtendConfModel;
import com.peak.xgen.conf.model.NeedGenTypeModel;

public interface ModuleGenConfImplementor {
	public List<NeedGenTypeModel> getNeedGenTypeModel();
	
	public List<ExtendConfModel> getExtendConfModel();
}
