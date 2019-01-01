/**
 * Filename: Singleton
 * Author: aa
 * Date : 2018/12/31 22:57
 * Description : aa
 */


public class Singleton {
    private static singleton uniqueSingleton;  //利用一个静态变量来记录Singlrton类的唯一实例
    private Singleton(){}    //构造器声明为私有，只有自Singleton类内才可以调用构造器
    public static Singleton getInstance(){  //用getInstance90方法实例化对象，并返回这个实例化
        if(uniqueSingleton == null){
            uniqueSingleton  = new Singleton();
        }
        return uniqueInstance;
    }

    //其他的方法和实例变量
}