package utilities;

import org.junit.Before;

import java.util.Locale;

import static utilities.CofigReader.getProperty;

public class EnvironmentManager {
    //we will use this class to set up all the environment variables

    //our environments will have different urls, user credentials, api endpoints
    public static String baseUrl;
    public static String username;
    public static String password;

public static void setUpEnvironment() throws Exception{
    switch(CofigReader.getProperty("environment").toLowerCase()){
        case"dev":
            DEV();
             break;
        case"qa":
            QA();
            break;
        case"prod":
        PROD();
            break;
        default:
            //here you can set qa env to be default
            throw new Exception("Invalid environment in configuration.properties. \n" +
                    "Please select from Dev, Qa, Prod");

    }
}

 public static  String endpoint;
    private static void DEV(){
        //to set up dev variables
        baseUrl = "https://www.dev-meetup.com/";
        username = "TestUserDev";
        password = "test123";
    }

    private static void QA(){
        //to set up QA variables
        baseUrl = "https://www.qa-meetup.com/";
        username = "TestUserQA";
        password = "test123";
    }

    private static void PROD(){
        //to set up prod variables
        baseUrl = "https://www.meetup.com/";
        username = "ProdTest";
        password = "test123";

    }

    }
