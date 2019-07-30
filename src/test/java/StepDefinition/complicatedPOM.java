package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 class complicatedPOM {
    private WebDriver driver;

    //These are private arrays that has a getter and setter.
    private By[] button = new By[12];
    private By[] socialM = new By[10];

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

    complicatedPOM(WebDriver driver){
        this.driver = driver;
    }

    //This inputs the correct class names into the array.
    void setButton(){
        for(int i=0; i<12; i++){
            button[i] = By.className("et_pb_button_" + i);
        }
    }

    //This gets a single button.
    By getButton(int arg){
        return button[arg];
    }

    //This inputs the correct class names into the array.
    void setSocialM(){
        for(int i=0; i<10; i++){
            socialM[i] = By.className("et_pb_social_media_follow_network_" + i);
        }
    }

    //This gets a single icon.
    By getSocial(int arg){
        return socialM[arg];
    }

}
