package designPatterns.singleton;

public enum DatabaseConnection {

    INSTANCE;

    private String url;

    public synchronized void init(String url) {
        if (this.url != null) {
            throw new IllegalStateException("Already initialized");
        }
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
