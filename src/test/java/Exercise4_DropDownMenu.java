import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;



public class Exercise4_DropDownMenu {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","/driver/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownBtn = driver.findElement(By.id("dropdownMenuButton"));
        dropDownBtn.click();
        WebElement autocompleteOption = driver.findElement(By.id("autocomplete"));


        autocompleteOption.click();
        WebElement autocompleteText = driver.findElement(By.xpath("/html/body/div[1]/h1"));
        Boolean ver1= autocompleteText.isDisplayed();

        System.out.print(ver1);
        driver.quit();






    }


}
