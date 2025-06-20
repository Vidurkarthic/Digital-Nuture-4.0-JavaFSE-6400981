package SingletonExample;

public class MainApp {
    public static void main(String[] args) {
        ConfigManager config1 = ConfigManager.getConfig();
        ConfigManager config2 = ConfigManager.getConfig();

        System.out.println("Is only one instance used? " + (config1 == config2));
    }
}
