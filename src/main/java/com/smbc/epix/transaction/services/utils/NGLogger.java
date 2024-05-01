package com.smbc.epix.transaction.services.utils;

import java.util.Properties;

import com.newgen.commonlogger.NGUtil;

public class NGLogger {

    private static final TransactionServicesUtils servicesUtils = new TransactionServicesUtils();
    private static final Properties properties = servicesUtils.getPropertyFile();
    private static final String CABINET_NAME = properties.getProperty("cabinetName");
    private static final String EPIXAPP_MODULE = "EPIXAPPLogs";

    public void consoleLog(String message) {
        NGUtil.writeConsoleLog(CABINET_NAME, EPIXAPP_MODULE, message);
    }

    public void xmlLog(String message1, String message2) {
        NGUtil.writeXmlLog(CABINET_NAME, EPIXAPP_MODULE, message1, message2);
    }

    public void errorLog(String message) {
        NGUtil.writeErrorLog(CABINET_NAME, EPIXAPP_MODULE, message);
    }

    public void queryLog(String message) {
        NGUtil.writeQueryLog(CABINET_NAME, EPIXAPP_MODULE, message);
    }
}
