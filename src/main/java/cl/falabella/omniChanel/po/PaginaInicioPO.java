package cl.falabella.omniChanel.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.assertTrue;

public class PaginaInicioPO extends BasePage{

    public PaginaInicioPO (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[contains(@caption,'Rut')]")
    WebElement RUTogin;
    @FindBy (xpath = "//input[contains(@caption,'Multiclave')]")
    WebElement PassLogin;
    @FindBy (id = "actionButtonIngresarBFCH")
    WebElement ingresarButton;
    @FindBy (id = "errorMsgPlaceholder")
    WebElement poUpError;

    public void Login (){
        Log("Se ingresa a OmniChanel");
        driver.get("http://omnichanneltest.bancofalabella.cl/Techbank/sso");
        waitForElementToAppear(RUTogin);
        RUTogin.sendKeys("17087563k");
        waitForElementToAppear(PassLogin);
        PassLogin.sendKeys("000111");
        waitForElementToAppear(ingresarButton);
        ingresarButton.click();
    }
    public void popUp(){
        if (isVisible(poUpError)){
            poUpError.getText();
            assertTrue(false);
            Log("Error de pagina");
        }

    }

}
