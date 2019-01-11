package org.blog.parser.strategy;

import org.blog.Properties;

public interface PropertyParserStrategy {
    Properties parse(String value, Properties properties);
}
