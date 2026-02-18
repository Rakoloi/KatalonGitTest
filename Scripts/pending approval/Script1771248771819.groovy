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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://php-qa.nwk.co.za/nwk/login.php')

WebUI.setText(findTestObject('Page_NWK ERP/Page_NWK Aanteken Skerm/input__txtGebruiker'), '0151776')

WebUI.setText(findTestObject('Page_NWK ERP/Page_NWK Aanteken Skerm/input__pwdWagwoord'), '<span>M@st3rk3y</span>')

WebUI.click(findTestObject('Page_NWK ERP/Page_NWK Aanteken Skerm/button_Teken in  Login'))

WebUI.click(findTestObject('Page_NWK ERP/i_fa fa fa-info-circle fa-stack-1x fa-inverse'))

WebUI.click(findTestObject('Page_NWK ERP/a_Client Information'))

WebUI.click(findTestObject('Page_NWK ERP/a_Pending approval'))

WebUI.click(findTestObject('Page_NWK ERP/span_fa fa-sign-out'))

WebUI.closeBrowser()

