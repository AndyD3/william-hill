package com.williamhill.admin.terminalservice.persistence;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StatusConverter implements AttributeConverter<Status, String> {

    @Override
    public String convertToDatabaseColumn(Status status) {
        switch (status) {
            case INSTALLED:
                return "I";
            case INSTALL_PENDING:
                return "P";
            case DECOMMISSIONED:
                return "D";
            default:
                throw new IllegalArgumentException("Invalid status: " + status);
        }
    }

    @Override
    public Status convertToEntityAttribute(String key) {
        switch (key) {
            case "I":
                return Status.INSTALLED;
            case "P":
                return Status.INSTALL_PENDING;
            case "D":
                return Status.DECOMMISSIONED;
            default:
                throw new IllegalArgumentException("Invalid sttus key: " + key);
        }
    }
}
