package DesignPatterns.Creational;

//public class Singelton {
//    private static Singelton instance = new Singelton();
//    private Singelton(){}
//    public static Singelton getInstance(){
//        return instance;
//    }
//}

//public class Singelton {
//    private static Singelton instance;
//    private Singelton(){}
//    public static Singelton getInstance(){
//        if(instance == null){
//            instance = new Singelton();
//        }
//        return instance;
//    }
//}

//public class Singelton {
//    private static Singelton instance;
//    private Singelton(){}
//    public static synchronized Singelton getInstance(){
//        if(instance == null){
//            instance = new Singelton();
//        }
//        return instance;
//    }
//}

public class Singelton {
    private static Singelton instance;
    private Singelton(){}
    public static Singelton getInstance(){
        if(instance == null){
            synchronized (Singelton.class){
                if(instance == null){
                    instance = new Singelton();
                }

            }
        }
        return instance;
    }
}
