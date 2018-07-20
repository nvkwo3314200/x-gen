package com.peak.xgen.conf.factory;

import com.peak.xgen.conf.IGenConf;
import com.peak.xgen.conf.impl.GenConfImpl;

public class GenConFactory {
	public static IGenConf getGenConf() {
		return GenConfImpl.getInstance(null);
	}
}
