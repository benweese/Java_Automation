package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class complicatedPOM {
    WebDriver driver;

    By[] button = new By[12];
    By[] socialM = new By[10];

    By twitterShare = By.className("swp_twitter_icon");
    By linkedInShare = By.className("swp_linkedin_icon");
    //By emailShare = By.className("swp_email_icon");
    By tumblrShare = By.className("swp_tumblr_icon");
    By facebookShare = By.className("swp_facebook_icon");

    By capName = By.id("et_pb_contact_name_0");
    By capEmail = By.id("et_pb_contact_email_0");
    By capMessage = By.id("et_pb_contact_message_0");
    By capAnswer = By.cssSelector("#et_pb_contact_form_0 .et_pb_contact_captcha");
    By capSuccess = By.id("et_pb_contact_form_0");

    By search2 = By.cssSelector("#search-2 #searchform #s");

    By post = By.id("post-8807");

    public complicatedPOM(WebDriver driver){
        this.driver = driver;
    }

    public void setButton(){
        for(int i=0; i<12; i++){
            button[i] = By.className("et_pb_button_" + i);
        }
    }
    public By[] getButton(){
        for(int i=0; i<12; i++){
            button[i] = By.className("et_pb_button_" + i);
        }
        return button;
    }
    public By getButton(int arg){
        By[] buttonArg = getButton();
        return buttonArg[arg];
    }

    public void setSocialM(){
        for(int i=0; i<10; i++){
            socialM[i] = By.className("et_pb_social_media_follow_network_" + i);
        }
    }
    public By[] getSocial(){
        return socialM;
    }

    public By getSocial(int arg){
        By[] socialArg = getButton();
        return socialArg[arg];
    }


}
