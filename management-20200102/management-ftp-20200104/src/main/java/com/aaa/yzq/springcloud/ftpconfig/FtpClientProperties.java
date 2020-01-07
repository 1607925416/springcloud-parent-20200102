package com.aaa.yzq.springcloud.ftpconfig;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description :
 * @Author      : cat
 * @exception   :
 * @CreateDate  : 2020/1/4 16:20
 * @Version     : 1.0
 */
@Component
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "ftp.client")
public class FtpClientProperties {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private String encoding;
    private Integer connectTimeout;
    private String basePath;
    private String httpPath;

    @Override
    public String toString() {
        return "FtpClientProperties{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", encoding='" + encoding + '\'' +
                ", connectTimeout=" + connectTimeout +
                ", basePath='" + basePath + '\'' +
                ", httpPath='" + httpPath + '\'' +
                '}';
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getHttpPath() {
        return httpPath;
    }

    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }
}
