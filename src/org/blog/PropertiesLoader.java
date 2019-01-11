package org.blog;

import org.blog.parser.PropertiesParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PropertiesLoader {
    private PropertiesParser propertiesParser = new PropertiesParser();

    public Properties loadProperties(String fileName) {
        List<String> propertiesLines = loadPropertiesLines(fileName);

        return propertiesParser.parse(propertiesLines);
    }

    private List<String> loadPropertiesLines(String fileName) {
        List<String> propertiesLines = new LinkedList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

            String line = bufferedReader.readLine();
            while (line != null) {
                propertiesLines.add(line);
                line = bufferedReader.readLine();
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return propertiesLines;
    }
}
