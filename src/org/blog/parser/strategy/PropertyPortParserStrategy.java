package org.blog.parser.strategy;

import org.blog.Properties;

public class PropertyPortParserStrategy implements PropertyParserStrategy {
    @Override
    public Properties parse(String value, Properties properties) {
        properties.setPort(value);
        return properties;
    }
}
