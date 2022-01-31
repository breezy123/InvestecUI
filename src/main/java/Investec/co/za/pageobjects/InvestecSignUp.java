package Investec.co.za.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvestecSignUp {

    private static WebDriver driver;
    private By firstNametxt = By.xpath("//body/div[2]/div[3]/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/fieldset[2]/div[1]/text-input[1]/div[1]/div[1]/input[1]");
    private By surnametxt = By.xpath("//body/div[2]/div[3]/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/fieldset[2]/div[2]/text-input[1]/div[1]/div[1]");
    private By emailAddress = By.xpath("//body/div[2]/div[3]/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/fieldset[2]/div[3]/text-input[1]/div[1]/div[1]");
    private By checkBox = By.xpath("//body/div[2]/div[3]/div[7]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/fieldset[2]/div[4]/checkbox-input[1]/div[1]/div[1]/div[1]/button[1]");
    private By submitButton = By.xpath("//button[contains(text(),'Submit')]");
    private By lblsuccessMessage = By.xpath("//h3[contains(text(),'Thank you')]");
    private By lblsuccessMessage1 = By.xpath("//h4[contains(text(),'We look forward to sharing out of the ordinary ins')]");

    public InvestecSignUp(WebDriver driver){ this.driver = driver; }


    public boolean waitForFirstName(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(firstNametxt));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForSurname(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(surnametxt));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForemailAddress(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddress));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitCheckBxoxMyself(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(checkBox));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForSubmitButton(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForThankMessage(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(lblsuccessMessage));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean waitForThankMessage1(){
        try
        {
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(lblsuccessMessage1));
            return true;
        }
        catch (Exception ex)
        {
            System.err.print("[ERROR] Failed to wait element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickFirstNametextfield(){
        try
        {
            waitForFirstName();
            WebElement elementToClick = driver.findElement(firstNametxt);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickSurnametextfield(){
        try
        {
            waitForSurname();
            WebElement elementToClick = driver.findElement(surnametxt);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickEmailaddresstextfield(){
        try
        {
            waitForemailAddress();
            WebElement elementToClick = driver.findElement(emailAddress);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickCheckBoxMyself(){
        try
        {
            waitCheckBxoxMyself();
            WebElement elementToClick = driver.findElement(checkBox);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean clickButtonSubmit(){
        try
        {
            waitForSubmitButton();
            WebElement elementToClick = driver.findElement(submitButton);
            elementToClick.click();
            return true;
        }
        catch(Exception ex)
        {
            System.err.print("[ERROR] Failed to click element: "+ex.getMessage());
            return false;
        }
    }

    public boolean enterFirstName(String firstName){

        try
        {
            clickFirstNametextfield();
            WebElement elementToTypeIn = driver.findElement(firstNametxt);
            elementToTypeIn.clear();
            elementToTypeIn.sendKeys(firstName);
            return true;
        }
        catch(Exception ex)
        {
            System.err.println("Error entering value - " + firstName + " - " + ex.getMessage());
            return false;
        }
    }

    public boolean enterSurname(String surname){

        try
        {
            clickSurnametextfield();
            WebElement elementToTypeIn = driver.findElement(surnametxt);
            elementToTypeIn.clear();
            Thread.sleep(1000);
            elementToTypeIn.sendKeys(surname);
            return true;
        }
        catch(Exception ex)
        {
            System.err.println("Error entering value - " + surname + " - " + ex.getMessage());
            return false;
        }
    }

    public boolean enterEmailAddress(String emailaddress){

        try
        {
            clickEmailaddresstextfield();
            WebElement elementToTypeIn = driver.findElement(emailAddress);
            elementToTypeIn.clear();
            elementToTypeIn.sendKeys(emailaddress);
            return true;
        }
        catch(Exception ex)
        {
            System.err.println("Error entering value - " + emailaddress + " - " + ex.getMessage());
            return false;
        }
    }
}
