import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class FormPage {
    public static void SubmitForm (WebDriver driver) {
        WebElement firstnameField = driver.findElement(By.id("first-name"));
        firstnameField.sendKeys("Ceci");
        WebElement lastnameField = driver.findElement(By.id("last-name"));
        lastnameField.sendKeys("Fig");
        WebElement jobTitleField = driver.findElement(By.id("job-title"));
        jobTitleField.sendKeys("Engineer");
        WebElement educationRadioB = driver.findElement(By.id("radio-button-3"));
        educationRadioB.click();
        WebElement sexOption = driver.findElement(By.id("checkbox-2"));
        sexOption.click();
        WebElement yearsOfExperience = driver.findElement(By.cssSelector("option[value='1']"));
        yearsOfExperience.click();
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/28/2024");
        dateField.sendKeys(Keys.RETURN);
        WebElement submitBtn = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitBtn.click();
    }
}
