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

String data = 'Data Files/Data File'

for (def rowNum = 1; rowNum <= findTestData(data).getRowNumbers(); rowNum++) {
    String StartDate = findTestData(data).getValue(1, rowNum)
    String EndDate1 = findTestData(data).getValue(2, rowNum)
	
	
    StartDatee = 'Object Repository/SSI/Page_My Attendance/startDate'
    WebUI.sendKeys(findTestObject(StartDatee), StartDate, FailureHandling.STOP_ON_FAILURE)

    EndDatee = 'Object Repository/SSI/Page_Dashboard/EndDate'
	WebUI.click(findTestObject(EndDatee),FailureHandling.STOP_ON_FAILURE)
    WebUI.sendKeys(findTestObject(EndDatee), EndDate1, FailureHandling.STOP_ON_FAILURE)

    Click = 'Object Repository/SSI/Page_Dashboard/Search'

    WebUI.click(findTestObject(Click), FailureHandling.STOP_ON_FAILURE)

   
    WebUI.comment('Start Date is -> ' + StartDate)
    WebUI.comment('end Date is -> ' + EndDate1)
}



