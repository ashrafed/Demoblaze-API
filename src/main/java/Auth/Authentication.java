package Auth;

import com.shaft.driver.SHAFT;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class Authentication {
    static SHAFT.API api;
    public Authentication(SHAFT.API api){this.api= api;}

    public static String signupPath = "/signup";     //Sign up Service Path:
    public static String LoginPath = "/login";    //Login Service Path:


    // This Function for  Login && Signup :
    public static Response Authentication(
            String ServiceName,String username, String password , int StatusCode){
        JSONObject body = new JSONObject();
        body.put("username" ,username);
        body.put("password" ,password);
        return api.post(ServiceName)
                .setContentType(ContentType.JSON)
                .addHeader("Content-Type" ,"application/json")
                .setTargetStatusCode(StatusCode)
                .setRequestBody(body)
                .performRequest();
    }

}
