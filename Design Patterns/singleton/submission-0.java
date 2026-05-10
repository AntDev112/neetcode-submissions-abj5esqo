static class Singleton {
    private String value;
    private static Singleton instance;

    private Singleton() {
        value = new String();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
