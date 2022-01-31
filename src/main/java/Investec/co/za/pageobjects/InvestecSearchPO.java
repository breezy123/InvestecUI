package Investec.co.za.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvestecSearchPO {

    private static WebDriver driver;
    private By searchIcon = By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[3]/a[1]/div[1]");
    private By searchTextfield= By.xpath("//input[@id='searchBarInput']");
    private By searchButton =By.xpath(" //button[contains(text(),'Search')]");
    private By textCashinvest = By.xpath("//p[contains(text(),'Make sure you’re investing in flexible cash invest')]");
    private By signUpbutton = By.xpath("//button[contains(text(),'Sign up')]");


    public InvestecSearchPO(WebDriver driver){ this.driver = driver; }

    public  boolean navigateToPage(){

        try{
            this.driver.navigate().to("https://www.investec.com/") ;
            return true;
        }
        catch(Exception ex){
            System.err.println("[ERROR] Failed to navigate to URL");
            return false;
        }
    }

    public boolean waitForSearchIcon(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(searchIcon));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForSearchTextfield(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(searchTextfield));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForSearchButton(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForInvestrateText(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(textCashinvest));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForSignUpButton(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(signUpbutton));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickSearchIcon(){
        try
        {
            waitForSearchIcon();
            WebElement elementToClick = driver.findElement(searchIcon);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickSearchTextfield(){
        try
        {
            waitForSearchTextfield();
            WebElement elementToClick = driver.findElement(searchTextfield);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickSearchButton(){
        try
        {
            waitForSearchButton();
            WebElement elementToClick = driver.findElement(searchButton);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickTextinvestRate(){
        try
        {
            waitForInvestrateText();
            WebElement elementToClick = driver.findElement(textCashinvest);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickSignUpButton(){
        try
        {
            waitForSignUpButton();
            WebElement elementToClick = driver.findElement(signUpbutton);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean enterSearchValue(String searchValue){

        try
        {
            waitForSearchTextfield();
            WebElement elementToTypeIn = driver.findElement(searchTextfield);
            elementToTypeIn.clear();
            elementToTypeIn.sendKeys(searchValue);
            return true;
        }
        catch(Exception ex)
        {
            System.err.println("Error entering value - " + searchValue + " - " + ex.getMessage());
            return false;
        }
    }

    public boolean backSpaceText(){
        try
        {
            int count =1;
            waitForSearchTextfield();
            WebElement elementToTypeIn = driver.findElement(searchTextfield);
            //elementToTypeIn.clear();

            while(count!=13){
                elementToTypeIn.sendKeys(Keys.BACK_SPACE);
                count++;
            }

            return true;
        }
        catch(Exception ex)
        {
            System.err.println("Error backspacing value(s)" + " - " + ex.getMessage());
            return false;
        }
    }

    public boolean scrollDownTocashInvest(){

        try {

            JavascriptExecutor js = (JavascriptExecutor)driver;
            WebElement Element = driver.findElement(By.xpath("//h4[contains(text(),'Assessing Market Returns Over The Last 10 Years | ')]"));

            js.executeScript("arguments[0].scrollIntoView(true);", Element);
            Thread.sleep(500);
            return true;
        } catch (Exception ex) {
            System.err.print("[ERROR] Failed to scroll down: " + ex.getMessage());
            return false;
        }
    }

    public boolean scrollDownSignUpButton(){

        try {

            JavascriptExecutor js = (JavascriptExecutor)driver;
            WebElement Element = driver.findElement(By.xpath("//h2[contains(text(),'Is your business cash investment yielding positive')]"));

            js.executeScript("arguments[0].scrollIntoView(true);", Element);
            Thread.sleep(500);
            return true;
        } catch (Exception ex) {
            System.err.print("[ERROR] Failed to scroll down: " + ex.getMessage());
            return false;
        }
    }


}
