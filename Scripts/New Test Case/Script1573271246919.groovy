import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable


System.setProperty("webdriver.chrome.driver", "D:\\Katalon_Studio_Windows_64-7.0.8\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe")

System.setProperty("webdriver.gecko.driver", "D:\\Katalon_Studio_Windows_64-7.0.8\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe")

WebDriver driver1 = new ChromeDriver()

WebDriver driver2 = new FirefoxDriver()

DriverFactory.changeWebDriver(driver1)

WebUI.navigateToUrl("https://www.katalon.com/download/")

DriverFactory.changeWebDriver(driver2)

WebUI.navigateToUrl("https://www.katalon.com/download/")

DriverFactory.changeWebDriver(driver1)

WebUI.sendKeys(findTestObject('Object Repository/user'), "test username in first browser")

DriverFactory.changeWebDriver(driver2)

WebUI.sendKeys(findTestObject('Object Repository/user'), "test username in second browser")















