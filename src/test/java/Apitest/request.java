package Apitest;

import Base.BaseMethods;
import org.junit.Test;

public class request {
    @Test
    public void getAPItest(){
        BaseMethods.getMethod();
    }
    @Test
    public void postAPItest(){
        BaseMethods.postMethod();
    }
    @Test
    public void postAPItest1(){
        BaseMethods.postMethod1();
    }

}

