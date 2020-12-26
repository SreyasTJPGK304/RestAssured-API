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

}

