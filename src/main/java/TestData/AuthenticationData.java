package TestData;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class AuthenticationData {


    // This for Generate login && Signup Data .
    static Faker faker = new Faker();
    static FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB") , new RandomService());


    private static String currentTimeMillis = String.valueOf(System.currentTimeMillis());    // Get current Time Millis
    public static String Username =  currentTimeMillis+faker.name().fullName(); // Generate username
    public static String Password =  currentTimeMillis+faker.internet().password(); // Generate password
    public static String specialCharacters =  fakeValuesService.regexify("[$&@#%!]{10}"); // Generate special Characters

}
