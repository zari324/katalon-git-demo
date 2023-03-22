import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement


//WebUI.executeJavaScript("window.scrollBy(0, 500);", null)
//WebUI.executeJavaScript("window.scrollBy(500, 0);", null)
//Grid= 'Object Repository/SSI/Page_My Attendance/Grid'
//WebUI.scrollToElement(findTestObject('Grid'), 0, -1000)
//WebUI.executeJavaScript("window.scrollBy(1000, 0);", null)

WebUI.maximizeWindow()
Field = 'Object Repository/SSI/Page_Dashboard/Add Time Log'
WebUI.click(findTestObject(Field))


String data = 'Data Files/Data File'

for (def rowNum = 1; rowNum <= findTestData(data).getRowNumbers(); rowNum++) {
	
    String Timein = findTestData(data).getValue(3, rowNum)
    String Timeout = findTestData(data).getValue(4, rowNum)
	
	WebUI.comment("time is"+ Timein)
	WebUI.comment("time is"+ Timeout)
	
	//WebUI.enableSmartWait()
	
	TimeinField = 'Object Repository/SSI/Page_Add Time Log/TimeIn'
	WebUI.sendKeys(findTestObject(TimeinField), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject(TimeinField), Keys.chord(Keys.BACK_SPACE))
	WebUI.sendKeys(findTestObject(TimeinField),Timein, FailureHandling.STOP_ON_FAILURE)
	
	TimeoutField = 'Object Repository/SSI/Page_Add Time Log/TimeOut'
	WebUI.sendKeys(findTestObject(TimeoutField), Keys.chord(Keys.CONTROL, 'a'))
	WebUI.sendKeys(findTestObject(TimeoutField), Keys.chord(Keys.BACK_SPACE))
	WebUI.sendKeys(findTestObject(TimeoutField),Timeout, FailureHandling.STOP_ON_FAILURE)
	
	
}


