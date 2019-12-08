package com.cybertek.AssigmentXpathLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackShorcut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        WebElement Username=driver.findElement(By.id("prependedInput"));
        Username.sendKeys("salesmanager101");

        WebElement Password=driver.findElement(By.id("prependedInput2"));
        Password.sendKeys("UserUser123");

        WebElement Login=driver.findElement(By.id("_submit"));
        Login.click();

        WebElement dashboards=driver.findElement(By.xpath("//ul[@class='nav-multilevel main-menu']/li[1]/a/span"));
        Thread.sleep(2000);
        dashboards.click();

        WebElement dashboard=dashboards.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));
        Thread.sleep(2000);
        dashboard.click();

        String actual="https://qa2.vytrack.com/dashboard/view/1?change_dashboard=1";
        String expected=driver.getCurrentUrl();

        if (actual.equals(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(2000);

        WebElement shortcut=driver.findElement(By.xpath("//i[@class='fa-share-square']"));
        Thread.sleep(1000);
        shortcut.click();

        WebElement seeFullList=driver.findElement(By.linkText("See full list"));
        Thread.sleep(1000);
        seeFullList.click();
        Thread.sleep(2000);
        WebElement oppose=driver.findElement(By.xpath("//div[@id='container']/div[2]/div/table/tbody/tr[21]/td/a"));

        Thread.sleep(2000);
        oppose.click();
        Thread.sleep(2000);

        String actual1="https://qa2.vytrack.com/opportunity?grid%5Bsales-opportunity-grid%5D=i%3D1%26p%3D25%26s%255BcreatedAt%255D%3D1%26f%255Bstatus%255D%255Btype%255D%3D2%26f%255Bstatus%255D%255Bvalue%255D%255B%255D%3Dlost%26f%255Bstatus%255D%255Bvalue%255D%255B%255D%3Dwon%26c%3Did0.name1.createdAt1.updatedAt0.contactName1.closeRevenue0.closeReasonLabel0.closeDate1.budgetAmount1.probability1.status1.primaryEmail1.ownerName1.accountName0.timesContacted0.timesContactedIn0.timesContactedOut0.lastContactedDate0.lastContactedDateIn0.lastContactedDateOut0.daysSinceLastContact0%26v%3Dopportunity.open%26a%3Dgrid";
        String expected1=driver.getCurrentUrl();
        if (actual1.equals(expected1)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement shortcut2=driver.findElement(By.xpath("//header[@id='oroplatform-header']/div/div/div[2]/div/a/i"));
        Thread.sleep(2000);
        shortcut2.click();

        WebElement seefulllist2=driver.findElement(By.linkText("See full list"));
        Thread.sleep(2000);
        seefulllist2.click();
        Thread.sleep(2000);
        WebElement VehicleServiceLogs=driver.findElement(By.xpath("//div[@id='container']/div[2]/div/table/tbody/tr[17]/td/a"));
        Thread.sleep(2000);
        VehicleServiceLogs.click();
        Thread.sleep(2000);
        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='message']"));
        Thread.sleep(2000);
        String actual2="You do not have permission to perform this action.";
        String expected2=errorMessage.getText();
        if (actual2.equals(expected2)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        Thread.sleep(2000);
        String actual3="https://qa2.vytrack.com/entity/Extend_Entity_VehicleServicesLogs";
        String expected3=driver.getCurrentUrl();
        if (actual3.equals(expected3)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //*[@id="history-content"]/ul/li[10]/a

       // WebElement dashboard=driver.findElement(By.cssSelector("h1[class='oro-subtitle']"));




//        System.out.println(dashboard.getText() );
//

        //driver.quit();
    }
}
