package org.blog.parser;

import org.blog.Properties;
import org.blog.PropertiesKey;
import org.blog.parser.strategy.PropertyBaseUrlParserStrategy;
import org.blog.parser.strategy.PropertyParserStrategy;
import org.blog.parser.strategy.PropertyTimeoutParserStrategy;

import java.util.EnumMap;
import java.util.List;

public class PropertiesParser {
    private final EnumMap<PropertiesKey, PropertyParserStrategy> parserStrategies = new EnumMap<>(PropertiesKey.class);

    public PropertiesParser() {
        parserStrategies.put(PropertiesKey.BASE_URL, new PropertyBaseUrlParserStrategy());
        parserStrategies.put(PropertiesKey.TIMEOUT, new PropertyTimeoutParserStrategy());
        parserStrategies.put(PropertiesKey.PORT, new PropertyTimeoutParserStrategy());
    }

    public Properties parse(List<String> lines) {
        Properties properties = new Properties();

        for (String line : lines) {
            String [] values = line.split("=");
            String key = values[0];
            String value = values[1];

            properties = parserStrategies.get(PropertiesKey.getEnumByKey(key)).parse(value, properties);
        }

        return properties;
    }
}
