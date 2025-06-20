package SingletonDemo;

public class DemoRunner {
    public static void main(String[] args) {

        ResourceManager r1 = ResourceManager.acquire();
        ResourceManager r2 = ResourceManager.acquire();

        System.out.println("Do both references point to the same object? " + (r1 == r2));
    }
}
