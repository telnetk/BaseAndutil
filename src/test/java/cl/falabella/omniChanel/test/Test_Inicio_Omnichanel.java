package cl.falabella.omniChanel.test;

import cl.falabella.omniChanel.po.BasePage;
import cl.falabella.omniChanel.po.HomeClientePO;
import cl.falabella.omniChanel.po.PaginaInicioPO;
import cl.falabella.omniChanel.po.TransferenciasTercerosPO;
import cl.falabella.omniChanel.util.OmniChanelUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Test_Inicio_Omnichanel {
    WebDriver driver;
    PaginaInicioPO page;
    HomeClientePO home;
    BasePage base;
    OmniChanelUtils util;
    TransferenciasTercerosPO trx;

    /**
     * Se crea BeforeEach SetUp para iniciar un chrome y se dan las opciones de maximizar y headless
     * headles es un chrome que se maneja en segundo plano
     * Start Maximized agranda la pantalla en su maxima
     */
    @BeforeEach    public void SetUp(){
        BasicConfigurator.configure();// log4g
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--start-maximized");
        //options.addArguments("--headless");//Se inicia Chrome en segundo plano
        driver = new ChromeDriver(options);
        this.page = new PaginaInicioPO(driver);
        this.home = new HomeClientePO(driver);
        this.base = new BasePage(driver);
        this.util = new OmniChanelUtils();
        this.trx = new TransferenciasTercerosPO(driver);
    }

    @Test    public void Test_inicio() throws IOException {
        page.Login();
        home.popUpError();
        page.esperaCargaFalabellaOmnichanel();
        home.verificacionpopUp();
        page.esperaCargaFalabellaOmnichanel();
        home.ProductosPrimarios();
        util.scroll(driver);
        home.masProductos();
        home.ProductosSecundarios();
        //page.esperaCargaFalabellaOmnichanel();
        //util.scrollUp(driver);
        //home.TransferenciasTrxTerceros();

    }
    @Test public void Test_MisPOrductos(){
        
        page.Login();
        page.esperaCargaFalabellaOmnichanel();
        home.verificacionpopUp();
        page.esperaCargaFalabellaOmnichanel();
        home.TrxTerceros();
        base.esperaCargaFalabellaOmnichanel();
        trx.BancoDestino(1);
        base.Log("Vamos a seleccionar tipo cuenta");
        trx.TipoDeCuentas(1);
        base.waitFor(10);


    }

    @AfterEach    public void cerrar(){
        driver.close();
    }

}
