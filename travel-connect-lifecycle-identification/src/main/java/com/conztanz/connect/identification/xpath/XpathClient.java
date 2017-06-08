package com.conztanz.connect.identification.xpath;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

/**
 * 
 * @author User
 *
 */

@Singleton
public class XpathClient {
	/**
	 * 
	 */
	private Map<String, XPathExpression> compiledExpressions;

	/**
	 * 
	 */
	private XPath xpathInstance;

	public XpathClient() {
		this.compiledExpressions = new HashMap<>();
	}

	public String request(String xpath, Document doc) throws XPathExpressionException {
		// we only compile expressions once
		if (!compiledExpressions.containsKey(xpath))
			compiledExpressions.put(xpath, this.getXpathInstance().compile(xpath));

		XPathExpression expression = this.getCompiledExpressions().get(xpath);
		return expression.evaluate(doc);
	}

	/**
	 * @return
	 */
	private XPath getXpathInstance() {
		if (this.xpathInstance == null) {
			XPathFactory xPathfactory = XPathFactory.newInstance();
			this.setXpathInstance(xPathfactory.newXPath());
		}
		return this.xpathInstance;
	}

	public Map<String, XPathExpression> getCompiledExpressions() {
		return compiledExpressions;
	}

	// public void setCompiledExpressions(Map<String, XPathExpression>
	// compiledExpressions) {
	// this.compiledExpressions = compiledExpressions;
	// }

	public void setXpathInstance(XPath xpathInstance) {
		this.xpathInstance = xpathInstance;
	}

}
