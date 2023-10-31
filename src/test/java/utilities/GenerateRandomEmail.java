package utilities;

import org.apache.commons.lang3.RandomStringUtils;


public class GenerateRandomEmail {

    public static String generateRandomEmail(){

        return RandomStringUtils.randomAlphabetic(4)  + "@gmail.com";
    }
}
