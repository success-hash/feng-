class Single1 {
    public static void main(String[] args){
        System.out.println("single one");}
    private static Single1 instance;
    public static Single1 getInstance() {
        if (instance == null) {
            instance = new Single1();
        }
        return instance;
    }
}