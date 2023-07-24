package Assignment2;

public final class Singleton {

    private static Singleton instance;

   
    private Singleton() {
        
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    

        public static void main(String[] args) {
           
            Singleton singletonInstance1 = Singleton.getInstance();
            Singleton singletonInstance2 = Singleton.getInstance();

          
            System.out.println("singletonInstance1 == singletonInstance2: " 
            + (singletonInstance1 == singletonInstance2));
        }
}

