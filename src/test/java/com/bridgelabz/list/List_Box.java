package com.bridgelabz.list;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class List_Box {
    WebDriver driver;

    @BeforeMethod
    public void initialization() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    /*Script to Select few Elements(Date of Birth) in the List Box from FaceBook Website*/
    @Test
    public void faceBook_Select() throws InterruptedException {

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

                System.out.println("*************************DATE*****************************************");
        WebElement list_bdayDate = driver.findElement(By.id("day"));
        Select select_bdayDate = new Select(list_bdayDate);
        List<WebElement> option_bdayDate = select_bdayDate.getOptions();
            int size_bdayDate = option_bdayDate.size();
                System.out.println("Number of Dates present inside the ListBox: " +size_bdayDate);
                System.out.println("List of Dates from the ListBox: ");
            for(WebElement webElement: option_bdayDate){
                String text_bdayDate = webElement.getText();
                System.out.println(text_bdayDate);
            }
        select_bdayDate.selectByIndex(9);
        List<WebElement> selectedDate_Option = select_bdayDate.getAllSelectedOptions();
            int sizeDate_selectedOption = selectedDate_Option.size();
                System.out.println("Number of Selected options: " +sizeDate_selectedOption);
            for (WebElement webElement: selectedDate_Option){
                System.out.println("Selected Date is:" +webElement.getText());
            }

                System.out.println("\n***************************MONTH***************************************");
        WebElement list_bdayMonth = driver.findElement(By.id("month"));
        Select select_bdayMonth = new Select(list_bdayMonth);
        List<WebElement> option_bdayMonth = select_bdayMonth.getOptions();
            int size_bdayMonth = option_bdayMonth.size();
                System.out.println("Number of Months present inside the ListBox: " +size_bdayMonth);
                System.out.println("List of All Months present in the ListBox: ");
            for(WebElement webElement: option_bdayMonth){
                String text_bdayMonth = webElement.getText();
                System.out.println(text_bdayMonth);
            }
        select_bdayMonth.selectByIndex(7);
        List<WebElement> selectedMonth_Option = select_bdayMonth.getAllSelectedOptions();
            int size_selectedOption = selectedMonth_Option.size();
                System.out.println("Number of Selected options: " +size_selectedOption);
            for (WebElement webElement: selectedMonth_Option){
                System.out.println("Selected Month is:" +webElement.getText());
            }

                System.out.println("\n***************************YEAR***************************************");
        WebElement list_bdayYear = driver.findElement(By.id("year"));
        Select select_bdayYear = new Select(list_bdayYear);
        List<WebElement> option_bdayYear = select_bdayYear.getOptions();
            int size_bdayYear = option_bdayYear.size();
                System.out.println("Number of Years present inside the ListBox: " +size_bdayYear);
                System.out.println("Selected Year from the ListBox: ");
            for(WebElement webElement: option_bdayYear){
                String text_bdayYear = webElement.getText();
                System.out.println(text_bdayYear);
            }
        select_bdayYear.selectByIndex(50);
        List<WebElement> selectedYear_Option = select_bdayYear.getAllSelectedOptions();
            int sizeYear_selectedOption = selectedYear_Option.size();
                System.out.println("Number of Selected options: " +sizeYear_selectedOption);
            for (WebElement webElement: selectedYear_Option){
                System.out.println("Selected Year is:" +webElement.getText());
            }

        select_bdayYear.selectByVisibleText("1999");
        select_bdayDate.deselectByIndex(9);
        select_bdayYear.deselectByVisibleText("1999");
        select_bdayMonth.selectByValue("s");

    }

    /*Script to Select few Elements in the List Box - Selenium Notes PDF*/
    @Test
    public void Few_Elements_List_Box() {
        driver.get("src/main/resources/List_Box.html");

        WebElement list = driver.findElement(By.id("mtr"));         //Address of list box - list
            Select s = new Select(list);                            //list - arg, Object of Select class

        List<WebElement>options = s.getOptions();
        int size = options.size();
            System.out.println("No. of Elements present inside the ListBOX is: " +size);
        for(WebElement webElement: options){
                String text = webElement.getText();
            System.out.println(text);
        }
        s.selectByIndex(0);
        s.selectByValue("v");
        s.selectByVisibleText("POORI");

        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        int size2 = allSelectedOptions.size();
            System.out.println("No of selected items that is selected in the LIS BOX - " +size2 +
                    "\nBelow list of selected items - ");
        for (WebElement webElement: allSelectedOptions){
            System.out.println(webElement.getText());
        }

        boolean multiple = s.isMultiple();
            System.out.println("Multiple select or not : " +multiple+ " Yes, it is Multi Select");
        if(multiple){
            WebElement firstSelectedOption = s.getFirstSelectedOption();
                System.out.println(firstSelectedOption.getText() +" :is the first selected item in the List Box");

            s.deselectByIndex(0);
            WebElement firstSelectedOption1 = s.getFirstSelectedOption();
                System.out.println(firstSelectedOption1 + "is the first selected item");
            s.deselectByValue("v");
            WebElement firstSelectedOption2 = s.getFirstSelectedOption();
                System.out.println(firstSelectedOption2 + "is the first selected item");
            s.deselectByVisibleText("POORI");
            List<WebElement> remainingSelectedOptions = s.getAllSelectedOptions();
            int size3 = remainingSelectedOptions.size();
                System.out.println("No of selected items that is selected in the LIST BOX - " +size3);
        }
    }
}
