package org.blog.parser.strategy;

import org.blog.Properties;

public class PropertyTimeoutParserStrategy implements PropertyParserStrategy {
    @Override
    public Properties parse(String value, Properties properties) {
        properties.setTimeout(Integer.valueOf(value));
        return properties;
    }
}
