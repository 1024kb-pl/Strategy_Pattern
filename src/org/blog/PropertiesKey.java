package org.blog;

import com.sun.javafx.fxml.PropertyNotFoundException;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public enum PropertiesKey {
    BASE_URL("1024kb.baseurl"),
    PORT("1024kb.port"),
    TIMEOUT("1024kb.timeout");

    private final String key;

    PropertiesKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static PropertiesKey getEnumByKey(String key) {
        List<PropertiesKey> propertiesKeys = new LinkedList<>(Arrays.asList(PropertiesKey.values()));
        return propertiesKeys.stream()
                .filter(propertyKey -> propertyKey.getKey().equals(key))
                .findFirst()
                .orElseThrow(PropertyNotFoundException::new);
    }
}
