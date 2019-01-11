package org.blog;

public class Properties {
    private String baseUrl = "http://1024kb.pl/";
    private String port = "8080";
    private int timeout = 10000;

    public Properties() {

    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getPort() {
        return port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "baseUrl='" + baseUrl + '\'' +
                ", port='" + port + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}
