package cl.falabella.omniChanel.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TransferenciasTercerosPO extends BasePage {

    public TransferenciasTercerosPO (WebDriver driver){ super(driver);}


    /**
     * Seleccion de Cuenta
     */
    @FindBy (id = "selectFieldCuentaOrigenUno")
    WebElement Cuenta;
    /**
     * Seccion de cuenta
     */
    @FindBy (id = "tableAlignOrigen2")
    WebElement tbDatos;
    /**
     * BancoDestino
     */
    @FindBy (xpath = "//select[contains(@caption,'Banco de destino')]//option[contains(value,'')]")
    WebElement lBacoDestino;

    /**
     * Tipo de Cuenta
     */
    @FindBy (id = "selectFieldTipoCuenta")
    WebElement liTipoCUenta;
    @FindBy (xpath = "//select[contains(@caption,'Tipo de cuenta')]//option[contains(text(),'')]")
    WebElement lTipoCuenta;

    public void BancoDestino(int cuenta){
        waitForElementToAppear(lBacoDestino);
        List<WebElement> eles = driver.findElements(By.xpath("//select[contains(@caption,'Banco de destino')]//option[contains(text(),'')]"));
        for (WebElement element : eles) {
            Log(element.getText());
        }
        eles.get(cuenta).click();
    }
    public void TipoDeCuentas(int cuenta){
        waitForElementToAppear(liTipoCUenta);
        List<WebElement> eles = driver.findElements(By.xpath("//select[contains(@caption,'Tipo de cuenta')]//option[contains(text(),'')]"));
        for(WebElement element:eles){
            Log(element.getText());
        }
        eles.get(cuenta).click();


    }




}
