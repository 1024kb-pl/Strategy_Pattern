package org.blog;

public class Main {

    public static void main(String[] args) {
        PropertiesLoader loader = new PropertiesLoader();

        Properties properties = loader.loadProperties("src/resources/application.properties");

        System.out.println(properties);
    }
}
