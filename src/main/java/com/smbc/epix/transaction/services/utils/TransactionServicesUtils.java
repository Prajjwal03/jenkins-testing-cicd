package com.smbc.epix.transaction.services.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.smbc.epix.transaction.services.exception.PropertyFileNotFoundException;

public class TransactionServicesUtils {

    public Properties getPropertyFile() {
        Properties properties = new Properties();
        String path = System.getProperty("user.dir") + "\\TreasuryConfig\\application-transactionServices.properties";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            properties.load(fileInputStream);
            return properties;
        } catch (IOException e) {
            throw new PropertyFileNotFoundException("Exception while reading application-transactionServices.properties in TreasuryConfig", e);
        }
    }
}
