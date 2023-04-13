package Locators;

public class LoginLocators {

    public final String lusername = "//input[@placeholder='Username']";
    public final String lpassword = "//input[@placeholder='Password']";
    public final String lLogin_Button = "//button[@type='submit']";
    public final String lInvalid_Credential_Error = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']";
    public final String lpass_blank = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']";
    public final String luser_blank = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']";
    public final String lpassblank_userblank = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/span[1]";
    public final String luserblank_passblank = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/span[1]";
    public final String ldashboard = "//header/div[1]/div[1]/span[1]/h6[1]";

    public void getatime(){
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
