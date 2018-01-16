package singletonPattern;

import java.io.Serializable;

public class SingletonSample implements Serializable,Cloneable {

    private SingletonSample(){}
    
    private static class SingletonHelper{
        private static final SingletonSample INSTANCE = new SingletonSample();
    }
    
    public static SingletonSample getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
 // implement readResolve method
    protected Object readResolve() {
        return getInstance();
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
    	  return getInstance();
    }
}