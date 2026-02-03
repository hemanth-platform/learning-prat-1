package designPatterns.singleton;

public enum AppConfig {
    INSTANCE;

    private String url;

    /*DatabaseConnection() {
        this.url = "jdbc:mysql://localhost:3306/db";
    }*/

    public String getUrl() {
        return url;
    }


    public void loadConfig() {
        System.out.println("Loading config...");
    }

}
