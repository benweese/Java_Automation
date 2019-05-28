package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class complicatedPOM {
    WebDriver driver;
    By[] button = new By[12];


    public complicatedPOM() {
        for(int i=0; i < 12; i++) {
            button[i] = By.className("et_pb_button et_pb_button_" + Integer.toString(i) + " et_pb_bg_layout_light");
        }
    }

    public complicatedPOM(WebDriver driver){
        this.driver = driver;
    }
}
