package Base;

import com.shaft.driver.SHAFT;

public class RequstBase {
    protected static SHAFT.API api ;
    public RequstBase(SHAFT.API api){this.api = api;}


    public static final int StatusCode = 200;
    public static final int InternalServerErrorCode= 500;



}
