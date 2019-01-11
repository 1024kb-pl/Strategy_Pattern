package org.blog.parser;

import org.blog.Properties;
import org.blog.PropertiesKey;

import java.util.List;

public class PropertiesParser {
    public Properties parse(List<String> lines) {
        Properties properties = new Properties();

        for (String line : lines) {
            properties = parse(properties, line);

        }

        return properties;
    }

    private Properties parse(Properties properties, String line) {
        final String [] values = line.split("=");
        final String key = values[0];
        final String value = values[1];

        final PropertiesKey keyEnum = PropertiesKey.getEnumByKey(key);

        switch (keyEnum) {
            case BASE_URL:
                properties.setBaseUrl(value);
                return properties;

            case TIMEOUT:
                properties.setTimeout(Integer.valueOf(value));
                return properties;

            case PORT:
                properties.setPort(Integer.valueOf(value));
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;

            case ANY:
                properties.setAny(value);
                return properties;
        }

        return properties;
    }
}
