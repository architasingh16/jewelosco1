/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author archita
 */
public class Jewelosco {
    private WebDriver driver;
    private String baseUrl;
    
    public Jewelosco() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
         System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://www.google.com/";
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testJoscoSigninTestCase1() throws Exception {
        driver.get("https://www.jewelosco.com/?&pushSection=home&cmpid=ps_jwo_jwod_ecom_goo_20200803_71700000068618306_58700006102242188_43700055155057812&gclid=Cj0KCQiA-JacBhC0ARIsAIxybyMZ2LmRo5OGdhjHn7sqtkljiHYu6dvBYLuslP2Xm-g7C-tLZsK8QdkaAmUDEALw_wcB&gclsrc=aw.ds");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Your Store'])[1]/following::span[1]")).click();
        driver.findElement(By.id("sign-in-modal-link")).click();
        driver.findElement(By.id("label-email")).click();
        driver.findElement(By.id("label-email")).clear();
        driver.findElement(By.id("label-email")).sendKeys("ash.potdar15@gmail.com");
        driver.findElement(By.id("label-password")).click();
        driver.findElement(By.id("label-password")).clear();
        driver.findElement(By.id("label-password")).sendKeys("1234");
        driver.findElement(By.id("btnSignIn")).click();
    }
     @Test
    public void testProductCheckTestCase2() throws Exception {
        driver.get("https://www.jewelosco.com/?&pushSection=home&cmpid=ps_jwo_jwod_ecom_goo_20200803_71700000068618306_58700006102242188_43700055155057812&gclid=Cj0KCQiA4aacBhCUARIsAI55maEgQXodLZD-JjFdk5TQMDJHp55Qqt889iFogsb8agCff8C2yx8MNIcaAiMbEALw_wcB&gclsrc=aw.ds");
        driver.findElement(By.id("skip-main-content")).click();
        driver.findElement(By.id("skip-main-content")).clear();
        driver.findElement(By.id("skip-main-content")).sendKeys("bread");
        driver.findElement(By.name("search-form")).submit();
        driver.get("https://www.jewelosco.com/shop/search-results.html?q=bread");
        driver.findElement(By.id("pg196010254")).click();
        driver.get("https://www.jewelosco.com/shop/product-details.196010254.html");
        driver.findElement(By.id("addButton_196010254")).click();
    }
     @Test
    public void testJoscoTestCase3() throws Exception {
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.google.com/search?q=jewel+osco&oq=&aqs=chrome.5.35i39i362l3j46i39i199i362i465j35i39i362l4.67905397j0j7&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='tads']/div/div/div/div/div/a/div/div/span")).click();
        driver.get("https://www.jewelosco.com/?&pushSection=home&cmpid=ps_jwo_jwod_ecom_goo_20200803_71700000068618306_58700006102242188_43700055155057812&gclid=Cj0KCQiAm5ycBhCXARIsAPldzoW9NVjd0aY_NjrPnW-3_I_cpU2EXpuY7fkG9Rg8X6zK2f_ulyFWw6UaAsPCEALw_wcB&gclsrc=aw.ds");
        driver.findElement(By.id("skip-main-content")).click();
        driver.findElement(By.id("skip-main-content")).clear();
        driver.findElement(By.id("skip-main-content")).sendKeys("vegetables");
        driver.findElement(By.name("search-form")).submit();
        driver.get("https://www.jewelosco.com/shop/search-results.html?q=vegetables");
        driver.findElement(By.id("addButton_960056217")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='true'])[1]/following::*[name()='svg'][1]")).click();
    }
}
