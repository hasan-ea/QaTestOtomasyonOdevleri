package ders21.xpath.odevi;

public class XpathTest1 {

    @Test
    public void clickButtonTest() {

        driver.get(" ");

        // Buttons menüsü
        driver.findElement(By.xpath(" ")).click();

        // Click Me butonu
        driver.findElement(By.xpath(" ")).click();

        // Sonuç mesajı
        WebElement message = driver.findElement(By.xpath(" "));

        // Assertion
        Assert.assertEquals(message.getText(), " ");
    }

}
