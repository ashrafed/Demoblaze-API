package Auth;

import Base.TestBase;
import TestData.AuthenticationData;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static Base.RequstBase.StatusCode;

public class LoginTest extends TestBase {


    @Test
    @Description("Verify that a user can log in successfully with a valid username and password after sign up .")
    public void TC_01_LoginSuccessfully() {
        // sign up

        Authentication.Authentication(
                Authentication.signupPath,
                AuthenticationData.Username,
                AuthenticationData.Password,
                StatusCode);

        //Login

        Authentication.Authentication(
                Authentication.LoginPath,
                AuthenticationData.Username,
                AuthenticationData.Password,
                StatusCode);
    }


    @Test
    @Description("Verify that a user can log in with a username that contains alphanumeric " +
            "characters, spaces, and special characters (e.g., @, #, $).")
    public void TC_02_VerifyLoginSpecialCharacters() {
        Authentication.Authentication(
                Authentication.LoginPath,
                AuthenticationData.specialCharacters,
                AuthenticationData.specialCharacters,
                StatusCode);
    }


    @Test
    @Description("Verify that a user can log in with a password that is" +
            " longer than the minimum character length requirement.")
    public void TC_03_VerifyMinimumCharacters() {
        Authentication.Authentication(
                Authentication.LoginPath,
                AuthenticationData.specialCharacters,
                AuthenticationData.specialCharacters,
                StatusCode);
    }


    @Test
    @Description("Verify that a user can log in with a username and password that are not the same.")
    public void TC_04_VerifyUserNameAndPasswordThatNotTheSame() {
        Authentication.Authentication(
                Authentication.LoginPath,
                AuthenticationData.specialCharacters,
                AuthenticationData.specialCharacters,
                StatusCode);
    }


    @Test
    @Description("Verify that a user cannot log in with an empty username or password")
    public void TC_05_VerifyEmptyUsernameORpassword() {
        Authentication.Authentication(
                Authentication.LoginPath,
                AuthenticationData.specialCharacters,
                AuthenticationData.specialCharacters,
                StatusCode);
    }


    @Test
    @Description("Verify that a user cannot log in with an empty username or password")
    public void TC_06_VerifyUsernameORpasswordAlreadyUSE() {
        Authentication.Authentication(
                Authentication.LoginPath,
                AuthenticationData.specialCharacters,
                AuthenticationData.specialCharacters,
                StatusCode);
    }


    @Test
    @Description("Verify that the API does not allow users to sign up with commonly used or easily" +
            " guessable passwords (e.g., \"password,\" \"123456,\" \"admin\").")
    public void TC_07_VerifyUsernameORpasswordCommonlyUSE() {
        Authentication.Authentication(
                Authentication.LoginPath,
                AuthenticationData.specialCharacters,
                AuthenticationData.specialCharacters,
                StatusCode);
    }


    @Test
    @Description("Verify that a user can log in successfully with a username that is in a different language")
    public void TC_08_VerifyUsernameORpasswordDifferentLanguage() {
        Authentication.Authentication(
                Authentication.LoginPath,
                "abc",
                "الب",
                StatusCode);
    }


}
