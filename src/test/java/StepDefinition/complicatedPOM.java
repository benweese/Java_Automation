package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class complicatedPOM {
    WebDriver driver;

    By button0 = By.className("et_pb_button_0");
    By button1 = By.className("et_pb_button_1");
    By button2 = By.className("et_pb_button_2");
    By button3 = By.className("et_pb_button_3");
    By button4 = By.className("et_pb_button_4");
    By button5 = By.className("et_pb_button_5");
    By button6 = By.className("et_pb_button_6");
    By button7 = By.className("et_pb_button_7");
    By button8 = By.className("et_pb_button_8");
    By button9 = By.className("et_pb_button_9");
    By button10 = By.className("et_pb_button_10");
    By button11 = By.className("et_pb_button_11");

    By socialM0 = By.className("et_pb_social_media_follow_network_0");
    By socialM1 = By.className("et_pb_social_media_follow_network_1");
    By socialM2 = By.className("et_pb_social_media_follow_network_2");
    By socialM3 = By.className("et_pb_social_media_follow_network_3");
    By socialM4 = By.className("et_pb_social_media_follow_network_4");
    By socialM5 = By.className("et_pb_social_media_follow_network_5");
    By socialM6 = By.className("et_pb_social_media_follow_network_6");
    By socialM7 = By.className("et_pb_social_media_follow_network_7");
    By socialM8 = By.className("et_pb_social_media_follow_network_8");
    By socialM9 = By.className("et_pb_social_media_follow_network_9");

    By twitterShare = By.className("swp_twitter_icon");
    By linkedInShare = By.className("swp_linkedin_icon");
    //By emailShare = By.className("swp_email_icon");
    By tumblrShare = By.className("swp_tumblr_icon");
    By facebookShare = By.className("swp_facebook_icon");

    public complicatedPOM(WebDriver driver){
        this.driver = driver;
    }

    public By[] getButton(){
        By[] array = new By[12];
        array[0] = button0;
        array[1] = button1;
        array[2] = button2;
        array[3] = button3;
        array[4] = button4;
        array[5] = button5;
        array[6] = button6;
        array[7] = button7;
        array[8] = button8;
        array[9] = button9;
        array[10] = button10;
        array[11] = button11;
        return array;
    }

    public By[] getSocial(){
        By[] array = new By[10];
        array[0] = socialM0;
        array[1] = socialM1;
        array[2] = socialM2;
        array[3] = socialM3;
        array[4] = socialM4;
        array[5] = socialM5;
        array[6] = socialM6;
        array[7] = socialM7;
        array[8] = socialM8;
        array[9] = socialM9;

        return array;
    }


}
