package org.blog.parser;

import org.blog.Properties;
import org.blog.PropertiesKey;
import org.blog.parser.strategy.PropertyBaseUrlParserStrategy;
import org.blog.parser.strategy.PropertyParserStrategy;
import org.blog.parser.strategy.PropertyPortParserStrategy;
import org.blog.parser.strategy.PropertyTimeoutParserStrategy;

import java.util.EnumMap;
import java.util.List;
import java.util.Optional;

public class PropertiesParser {
    private final EnumMap<PropertiesKey, PropertyParserStrategy> parserStrategies = new EnumMap<>(PropertiesKey.class);

    public PropertiesParser() {
        parserStrategies.put(PropertiesKey.BASE_URL, new PropertyBaseUrlParserStrategy());
        parserStrategies.put(PropertiesKey.TIMEOUT, new PropertyTimeoutParserStrategy());
        parserStrategies.put(PropertiesKey.PORT, new PropertyPortParserStrategy());
    }

    public Properties parse(List<String> lines) {
        final Properties properties = new Properties();

        for (String line : lines) {
            String [] values = line.split("=");
            final String key = values[0];
            final String value = values[1];

            Optional.of(parserStrategies.get(PropertiesKey.getEnumByKey(key)))
                    .ifPresent(strategy -> strategy.parse(value, properties));
        }

        return properties;
    }
}
