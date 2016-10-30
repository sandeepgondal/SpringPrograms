package com.sandy.spring.di.propertyvalues;

public class DatabaseBean {

    private String databaseURL;
    private String databaseUsername;
    private String databasePassword;
    private String databaseDriverName;

    public DatabaseBean() {
    }

    public String getDatabaseURL() {
        return databaseURL;
    }

    public void setDatabaseURL(final String databaseURL) {
        this.databaseURL = databaseURL;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public void setDatabaseUsername(final String databaseUsername) {
        this.databaseUsername = databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(final String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public String getDatabaseDriverName() {
        return databaseDriverName;
    }

    public void setDatabaseDriverName(final String databaseDriverName) {
        this.databaseDriverName = databaseDriverName;
    }

    @Override
    public String toString() {
        return "DatabaseBean{" +
                "databaseURL='" + databaseURL + '\'' +
                ", databaseUsername='" + databaseUsername + '\'' +
                ", databasePassword='" + databasePassword + '\'' +
                ", databaseDriverName='" + databaseDriverName + '\'' +
                '}';
    }
}
