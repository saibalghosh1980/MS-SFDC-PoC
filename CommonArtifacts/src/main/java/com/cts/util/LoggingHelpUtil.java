package com.cts.util;

import org.apache.log4j.Logger;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class LoggingHelpUtil {
	private static Logger log = Logger.getLogger(getCallingClassName());

	private static boolean isLog4jinitialized = true;

	private static String getCallingClassName() {
		return Thread.currentThread().getStackTrace()[3].getClassName();
	}

	public static void setLog4jinitialized(boolean log4jinitialized) {
		isLog4jinitialized = log4jinitialized;
	}

	public static void printTrace(String trace) {
		if (isLog4jinitialized)
			log.trace("CALLING METHOD NAME :: "
					+ Thread.currentThread().getStackTrace()[2].getMethodName()
					+ " :: LINE NUMBER :: "
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ " :: " + trace);
		else
			System.out.println(trace);
	}

	public static void printDebug(String debug) {
		if (isLog4jinitialized)
			log.debug("CALLING METHOD NAME :: "
					+ Thread.currentThread().getStackTrace()[2].getMethodName()
					+ " :: LINE NUMBER :: "
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ " :: " + debug);
		else
			System.out.println(debug);
	}

	public static void printError(String error) {
		if (isLog4jinitialized)
			log.error("CALLING METHOD NAME :: "
					+ Thread.currentThread().getStackTrace()[2].getMethodName()
					+ " :: LINE NUMBER :: "
					+ Thread.currentThread().getStackTrace()[2].getLineNumber()
					+ " :: " + error);
		else
			System.out.println(error);
	}

	public static void printError(Exception ex) {
		final Writer result = new StringWriter();
		final PrintWriter printWriter = new PrintWriter(result);
		ex.printStackTrace(printWriter);
		printError(result.toString());
	}
}
