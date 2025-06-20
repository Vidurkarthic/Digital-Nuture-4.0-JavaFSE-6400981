package SingletonDemo;
public class ResourceManager {
    private static ResourceManager singletonResource;
    private ResourceManager() {
        System.out.println("ResourceManager instance created");
    }
    public static synchronized ResourceManager acquire() {
        if (singletonResource == null) {
            singletonResource = new ResourceManager();
        }
        return singletonResource;
    }
}
