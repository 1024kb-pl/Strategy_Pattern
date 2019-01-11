package org.blog;

public class Properties {
    private String baseUrl = "http://1024kb.pl/";
    private int port = 8080;
    private int timeout = 10000;

    public Properties() {

    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public int getPort() {
        return port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void setPort(int port) {
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
