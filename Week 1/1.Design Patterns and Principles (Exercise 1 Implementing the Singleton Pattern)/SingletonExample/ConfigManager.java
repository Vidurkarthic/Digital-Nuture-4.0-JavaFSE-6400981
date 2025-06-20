package SingletonExample;

class ConfigManager {
    // Eager initialization of singleton instance
    private static final ConfigManager uniqueConfig = new ConfigManager();

    // Private constructor to prevent external instantiation
    private ConfigManager() {
        System.out.println("ConfigManager initialized");
    }

    // Public method to return the single instance
    public static ConfigManager getConfig() {
        return uniqueConfig;
    }
}
