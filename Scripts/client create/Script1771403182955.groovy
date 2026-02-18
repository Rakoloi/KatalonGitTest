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

WebUI.setText(findTestObject('create client/Page_NWK Aanteken Skerm/input_Personeelnommer _ Employee number'), '0151776')

WebUI.setText(findTestObject('create client/Page_NWK Aanteken Skerm/input_Wagwoord _ Password'), '<span>M@st3rk3y</span>')

WebUI.click(findTestObject('create client/Page_NWK Aanteken Skerm/button_btnSubmit'))

WebUI.click(findTestObject('create client/Page_NWK ERP/a_1763'))

WebUI.click(findTestObject('create client/Page_NWK ERP/a_Client Information'))

WebUI.click(findTestObject('create client/Page_NWK ERP/a_Create client'))

WebUI.click(findTestObject('create client/Page_NWK ERP/iframe_renderHier'))

WebUI.mouseOver(findTestObject('create client/Page_NWK ERP/li_select2-_TIPE_REKENING-result-z6p9-MD'))

WebUI.click(findTestObject('create client/Page_NWK ERP/li_select2-_TIPE_REKENING-result-z6p9-MD'))

WebUI.click(findTestObject('create client/Page_NWK ERP/span_select2-_KM_TIPE_REGSENT-container'))

WebUI.click(findTestObject('create client/Page_NWK ERP/span_select2-_KM_TIPE_ID-container'))

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_ID number'), '0204115361089')

WebUI.click(findTestObject('create client/Page_NWK ERP/span_select2-_KM_TITEL-container'))

WebUI.click(findTestObject('create client/Page_NWK ERP/button_Pick a date'))

WebUI.click(findTestObject('create client/Page_NWK ERP/td_February, 2026'))

WebUI.click(findTestObject('create client/Page_NWK ERP/td_'))

WebUI.click(findTestObject('create client/Page_NWK ERP/td_11'))

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_Surname'), 'rakoloi')

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_Initials'), 'mm')

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_Full names _ Bussiness name'), 'ditau farming pty')

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_Nickname'), 'mosa')

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_1'), '0670274424')

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_1_1'), '0670274424')

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_1_2'), 'rakoloimosa@gmail.com')

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_Soek_Search'), '')

WebUI.click(findTestObject('create client/Page_NWK ERP/span_select2-_DIV_BRON_AAND-container'))

WebUI.click(findTestObject('create client/Page_NWK ERP/span_select2-_DIV_PROEFB_AAND-container'))

WebUI.click(findTestObject('create client/Page_NWK ERP/span_select2-_DIV_STAAT_DRUK-container'))

WebUI.click(findTestObject('create client/Page_NWK ERP/span_select2-_DIV_BTW_KATEGORIE-container'))

WebUI.setText(findTestObject('create client/Page_NWK ERP/input_VAT flag'), 't')

WebUI.click(findTestObject('create client/Page_NWK ERP/div_noty_modal'))

