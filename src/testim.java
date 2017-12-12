import java.io.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testim {
WebDriver driver=new FirefoxDriver();

public void anasayfa(){
//Belirlenen sayfa acılması 
driver.get("http://www.amazon.com");
}
public void kayıt() throws InterruptedException{
//
driver.findElement(By.id("nav-link-accountList"))
.click();
driver.findElement(By.id("ap_email"))
.sendKeys("sabri.elmastas@gmail.com");
Thread.sleep(5000);
//Enter password
driver.findElement(By.id("ap_password"))
.sendKeys("Sabri13");
Thread.sleep(5000);
driver.findElement(By.cssSelector("#signInSubmit"))
.click();

}
public void arama() throws InterruptedException{
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
// Click on the search button
driver.findElement(By.xpath("//input[@value='Go']")).click();
//samsun aramam sonucunda 2 sayfayı secmek için kullanılacak
driver.findElement(By.xpath("//*[@id=\"pagn\"]/span[3]/a")).click();


Thread.sleep(5000);

////samsun arama sonucunda  2 sayfadaki  3  eleman seçilecek
driver.findElement(By.xpath("(//*[@id=\"resultsCol\"]//a[contains(@class,'access-detail-page')])[3]")).click();
driver.findElement(By.id("add-to-wishlist-button-submit")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='View Your List']")).click();

//wish list  sececek  sabri listesini sececek
driver.findElement(By.xpath("//*[@id=\"wl-list-link-3AZXVOVD7RQY2\"]/div")).click();
Thread.sleep(5000);
//Listeden silme işlemini gercekleştirecek


driver.findElement(By.cssSelector("#a-autoid-5 > span > input")).click();

// bağlantı kapatılacak
driver.close();

}


public static void main(String[] args) throws IOException, InterruptedException {

testim a=new testim();
a.anasayfa();
a.kayıt();
a.arama();
}
}