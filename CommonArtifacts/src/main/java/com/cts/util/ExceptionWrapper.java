package com.cts.util;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.lang.RandomStringUtils;

public class ExceptionWrapper extends Exception {
	private String strErrNum = null;
	private String strErrorStack = null;

	public String getStrErrNum() {
		return strErrNum;
	}

	public void setStrErrNum(String strErrNum) {
		this.strErrNum = strErrNum;
	}

	public String getStrErrorStack() {
		return strErrorStack;
	}

	public void setStrErrorStack(String strErrorStack) {
		this.strErrorStack = strErrorStack;
	}

	public ExceptionWrapper(Exception ex) {

		if (!ex.getClass()
				.toString()
				.equalsIgnoreCase(
						"class com.cts.util.ExceptionWrapper")) {
			strErrNum = RandomStringUtils.randomAlphabetic(10);
			strErrorStack = getStackMessage(ex);
			LoggingHelpUtil.printError(strErrorStack);
		} else {
			strErrNum = ((ExceptionWrapper) ex).strErrNum;
			strErrorStack = ((ExceptionWrapper) ex).strErrorStack;
		}
	}

	private String getStackMessage(Exception exception) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.println("The error encountered due to : " + strErrNum);
		pw.println(" =================================================================================================\n");
		pw.print(" [ ");
		pw.print(exception.getClass().getName().toString());
		pw.print(" ] ");

		pw.println(exception.getMessage());
		exception.printStackTrace(pw);
		pw.println(" =================================================================================================\n");

		return sw.toString();

	}
}
