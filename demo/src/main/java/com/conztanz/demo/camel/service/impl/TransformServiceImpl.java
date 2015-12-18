package com.conztanz.demo.camel.service.impl;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.milyn.Smooks;
import org.milyn.SmooksFactory;

import com.conztanz.demo.camel.service.TransformService;

public class TransformServiceImpl implements TransformService {

	private static final transient Log LOG = LogFactory.getLog(TransformServiceImpl.class);
	private boolean verbose = true;
	private String prefix = "MyTransform";

	public Object transform(Object body) {

//		 final SmooksFactory smooksFactory = (SmooksFactory)
//		 camelContext.getRegistry().lookup(SmooksFactory.class.getName());
//		 final Smooks smooks = smooksFactory.createInstance("my-smooks-config.xml");

		String answer = prefix + " set body: " + new Date();
		if (verbose) {
			System.out.println(">> call >> " + answer);
		}
		LOG.info(">> call >>" + answer);

		return answer;
	}

	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}
