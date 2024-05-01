package com.smbc.epix.transaction.services.utils;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomSqlDateSerializer extends JsonSerializer<Date> {

    private static final NGLogger nGLogger = new NGLogger();

    @Override
    public void serialize(Date date, JsonGenerator generator, SerializerProvider serializers) throws IOException {
        try {
            nGLogger.consoleLog("###Inside CustomSqlDateSerializer : " + date + "###");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = dateFormat.format(date);
            generator.writeString(dateStr);
        } catch (DateTimeParseException e) {
            nGLogger.errorLog("Exception in CustomSqlDateSerializer : " + e);
            generator.writeString("");
        }
    }
}
