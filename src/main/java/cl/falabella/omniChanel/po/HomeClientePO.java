package cl.falabella.omniChanel.po;

import cl.falabella.omniChanel.util.OmniChanelUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HomeClientePO extends BasePage{


    public HomeClientePO (WebDriver driver){
        super(driver);
    }
    PaginaInicioPO page;
    /** popUpHome: es un popup que aparece despues de ingresar a la pagina
     * botMasTarde: es para salir del popUp y continuar flujo
     */
    @FindBy (id = "cyberbankBody")
    WebElement popUpErrorInicio;
    @FindBy (id="imageComponent0")
    WebElement popUpHome;
    @FindBy (xpath = "//p[contains(text(),'Más tarde')]")
    WebElement botMasTarde;


    /*******************************/
    /**Se revisan la cantidad de prodcutos desplegados en el home */
    @FindBy(id = "tableAlignProductosPrimarios")
    WebElement primeroProductos;
    @FindBy(id = "tableAlignProductosSecundarios")
    WebElement segundosProdcutos;
    @FindBy(xpath = "(//button[contains(@class,'action-button_flecha-derecha') and (@onclick)])[2]")
    WebElement btnFlechaDerecha;
    /**Se verifica el boton para mostrar mas prodcutos */
    @FindBy (id = "btnOtrosProductos")
    WebElement botMasProductos;
    /**Sección de NAV en el home
     * Botones: Tranferencias -> Aterceros mismo Banco -> Cuentas Propias -> Agregar Destinatarios -> TRX Programadas -> historial de TRX
     * */
    @FindBy (id ="TRANSFERENCIAS")
    WebElement btnTransferencia;
    @FindBy(id="ATercerosMismoBanco")
    WebElement btnTRXTercerosMismoBanco;
    @FindBy (id = "Acuentaspropias")
    WebElement BtnTRXmismaCuenta;
    @FindBy (id = "AgendaDestinatarios")
    WebElement btnMisContactos;
    @FindBy(id = "Programada")
    WebElement btnTRXProgramadas;
    @FindBy (id = "CartolaDeTransferencias")
    WebElement btnCartolaTRX;
    /*************************************/

    @FindBy (id = "pagos")
    WebElement btnPagarRecargas;
    @FindBy (id = "AvanceYSuperAvance")
    WebElement btnAvances;
    @FindBy (id ="Invertir")
    WebElement btnInvertir;
    @FindBy (id="SolicitarProductos")
    WebElement btnSolicitar;
    @FindBy (id="CMRpuntosybeneficios")
    WebElement btnCmrPuntos;
    @FindBy (id="Descuestos")
    WebElement btnDescuentos;


    public void popUpError(){
        if (waitForClick(popUpErrorInicio)){
            String pop = popUpErrorInicio.getText();
            Log(pop);


        }else{
            Log("Se carga pagina");
        }
    }



    public void verificacionpopUp(){
        if(isVisible(popUpHome)){
            Log("Aparece PopUp");
            waitForElementToAppear(botMasTarde);
            botMasTarde.click();
        }else{
            Log("El popUP no es visible");
        }
    }
    /**Verifica la cantidad de productos desplegados en pantalla*/
    public boolean ProductosPrimarios(){
        int cuenta =0;
        if (isVisible(primeroProductos)){
        List<WebElement> eles = driver.findElements(By.xpath("//div[contains(@id,'tableAlignProductosPrimarios')]//div[contains(@class,'tableDiv table-align_default_consolidada')]"));
        for (WebElement element : eles) {
           // Log( cuenta + element.getText());
            cuenta = cuenta+1;
            }
        Log("Cantidad de Cuentas desplegadas = "+cuenta);
        assert (cuenta >= 2);
        }
        return true;
        }
    /**Se verifica la cantidad de productos desplegados despues de verificar si existe la opción de mas productos*/
    public boolean ProductosSecundarios(){
        int cuenta = 0;
        if(isVisible(segundosProdcutos)){
            List<WebElement> eles = driver.findElements(By.xpath("//div[contains(@id,'tableAlignProductosSecundarios')]//div[contains(@class,'repeteableSection')]"));
            for(WebElement element:eles){
                //Log(cuenta + element.getText());
                cuenta = cuenta +1;
                }
            Log("Cantidad de Cuentas desplegadas = "+cuenta);
            assert (cuenta >= 2);
            }
        return true;
        }

    public void masProductos(){
        if(isVisible(botMasProductos)){
            waitForElementToAppear(botMasProductos);
            botMasProductos.click();
            Log("Se pincha mas Productos");
        }else{
            Log("El cliente no tiene mas de una cuenta ");
            assertFalse(true);

        }
    }

    public void TrxTerceros(){
        position(driver,btnTransferencia);
        waitForElementToAppear(btnTRXTercerosMismoBanco);
        btnTRXTercerosMismoBanco.click();

    }
    public void pagaroRecarga(){
        waitForElementToAppear(btnPagarRecargas);
        btnPagarRecargas.click();
    }
    public void AvancesySuperAvance(){
        waitForElementToAppear(btnAvances);
        btnAvances.click();
    }
    public void invertir(){
        waitForElementToAppear(btnInvertir);
        btnInvertir.click();
    }
    public void SolicitarProducto(){
        waitForElementToAppear(btnSolicitar);
        btnSolicitar.click();
    }
    public void CRMPuntos(){
        waitForElementToAppear(btnCmrPuntos);
        btnCmrPuntos.click();
    }
    public void Descuentos(){
        waitForElementToAppear(btnDescuentos);
        btnDescuentos.click();
    }

}
