package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionsWithWebElements {
    WebDriver driver;
    Logger log;

    public ActionsWithWebElements(WebDriver webDriver){
        this.driver=webDriver;
        log=Logger.getLogger(getClass());
    }

    /**This is input text into the field
     * @param inputField
     * @param inputText
     */
    public void inputTextToField(String inputField ,String inputText ){
        try{
            driver.findElement(By.xpath(inputField)).clear();
            driver.findElement(By.xpath(inputField)).sendKeys(inputText);
            log.info("Text is inputed");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Text isn't inputrd");
            Assert.fail("Can't work input");
        }

    }
    /**
     * @param buttonPlace
     */
    public void clickButton(String buttonPlace) {
        try{
            driver.findElement(By.xpath(buttonPlace)).click();
            log.info("Button clicked");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Button isn't clicked");
            Assert.fail("Cant't click button");
        }
    }
    /**Select by text in dropdown
     * @param locatorDd
     * @param textDd
     * */
    public  void selectDdByText(String locatorDd, String textDd){
        try{
            Select selectDd=new Select(driver.findElement(By.xpath(locatorDd)));
            selectDd.selectByVisibleText(textDd);
            log.info("Text selected");

        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Text dosen't select");
            Assert.fail("Cannot select");
        }

    }

    /**Select by value from Drop Down
     * @param locatorDD
     * @param valueDD
    * */
    public void selectDdByValure(String locatorDD,String valueDD){
        try{
            Select selectDD=new Select(driver.findElement(By.xpath(locatorDD)));
            selectDD.selectByValue(valueDD);
            log.info("Selection work ok");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Select failed");
        }
    }

    /**
     *
     */
    public void selectCheckBox(String locatorCheckBox,boolean isNeededStatus ){
        try{
            if(driver.findElement(By.xpath(locatorCheckBox)).isSelected() && !isNeededStatus){
                driver.findElement(By.xpath(locatorCheckBox)).click();
            }else if((!driver.findElement(By.xpath(locatorCheckBox)).isSelected()) && isNeededStatus){
                driver.findElement(By.xpath(locatorCheckBox)).click();
            }log.info("Ok");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Error");
        }
    }
}
