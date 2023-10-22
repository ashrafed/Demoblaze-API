package Auth;

import Base.TestBase;
import TestData.AuthenticationData;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static Base.RequstBase.InternalServerErrorCode;
import static Base.RequstBase.StatusCode;

public class SignupTest extends TestBase {

    @Test
    @Description("Verify that a user can sign up successfully with a valid username and password")
    public void TC_01_SignupSuccessfully() {
        Authentication.Authentication(
                Authentication.signupPath,
                AuthenticationData.Username,
                AuthenticationData.Password ,
                StatusCode);
    }


    @Test
    @Description("Verify that a user can sign up with a username that contains " +
            "alphanumeric characters, spaces, and special characters (e.g., @, #, $)")
    public void TC_02_VerifySpecialCharacters() {
        Authentication.Authentication(
                Authentication.signupPath,
                AuthenticationData.specialCharacters,
                AuthenticationData.specialCharacters ,
                StatusCode);
    }


    @Test
    @Description("Verify that a user can sign up with a password that is longer " +
            "than the minimum character length requirement.")
    public void TC_03_VerifyMinimumCharacters() {
        Authentication.Authentication(
                Authentication.signupPath,
                "1",
               "1" ,
                StatusCode);
    }


    @Test
    @Description("Verify that a user can sign up with a username and password that are not the same")
    public void TC_04_VerifyUserNameAndPasswordThatNotTheSame() {
        Authentication.Authentication(
                Authentication.signupPath,
                AuthenticationData.Username,
                AuthenticationData.Password ,
                StatusCode);
    }


    @Test
    @Description("Verify that a user cannot sign up with an empty username or password.")
    public void TC_05_VerifyEmptyUsernameORpassword() {
        Authentication.Authentication(
                Authentication.signupPath,
                "",
                "" ,
                InternalServerErrorCode);
    }


    @Test
    @Description("Verify that a user cannot sign up with a username that is already in use")
    public void TC_06_VerifyUsernameORpasswordAlreadyUSE() {
        Authentication.Authentication(
                Authentication.signupPath,
                AuthenticationData.Username,
                AuthenticationData.Password ,
                StatusCode);


        Authentication.Authentication(
                Authentication.signupPath,
                AuthenticationData.Username,
                AuthenticationData.Password ,
                StatusCode);
    }


    @Test
    @Description("Verify that the API does not allow users to sign up with commonly used or easily" +
            " guessable passwords (e.g., \"password,\" \"123456,\" \"admin\").")
    public void TC_07_VerifyUsernameORpasswordCommonlyUSE() {
        Authentication.Authentication(
                Authentication.signupPath,
                "123456",
                "admin" ,
                StatusCode);

    }



}
