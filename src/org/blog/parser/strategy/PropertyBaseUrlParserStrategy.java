package org.blog.parser.strategy;

import org.blog.Properties;

public class PropertyBaseUrlParserStrategy implements PropertyParserStrategy {
    @Override
    public Properties parse(String value, Properties properties) {
        properties.setBaseUrl(value);
        return properties;
    }
}
