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

Mobile.startApplication('C:\\Users\\AyshaPutri\\Katalon Studio\\TravelokaAutomateTest\\androidapp\\traveloka-3-47-0.apk', 
    true)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.EditText - Indonesia'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Indonesia'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Lanjutkan'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.view.View'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Lewati untuk saat ini'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Lanjut'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Tiket Pesawat'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.EditText - Surabaya (SUB)'), 0)

Mobile.setText(findTestObject('Case1-Book Flight One Way/android.widget.EditText - Cari kota atau bandara'), 'Padang', 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Padang, Indonesia'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.EditText - Economy'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - SELESAI'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Cari'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - OK, Mengerti'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.view.ViewGroup'), 0)

WebUI.delay(3)

Mobile.pressBack()

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Pilih'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Case1-Book Flight One Way/android.widget.EditText (1)'), 'Maya', 0)

Mobile.setText(findTestObject('Case1-Book Flight One Way/android.widget.EditText (2)'), 'Maulani', 0)

Mobile.setText(findTestObject('Case1-Book Flight One Way/android.widget.EditText (3)'), '85100733977', 0)

Mobile.setText(findTestObject('Case1-Book Flight One Way/android.widget.EditText (4)'), 'my.maulani@gmail.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Simpan'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Masukkan sebagai traveler'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Nyonya'), 0)

Mobile.setText(findTestObject('Case1-Book Flight One Way/android.widget.EditText (5)'), '321234567890', 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Simpan (1)'), 0)

Mobile.scrollToText('LANJUTKAN')

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - LANJUTKAN'), 0)

Mobile.scrollToText('Lanjutkan')

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Lanjutkan (1)'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Ya, Lanjutkan'), 0)

WebUI.delay(20)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Coba Sekarang'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Pilih'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - Transfer BCA'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Bayar dengan Transfer BCA'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - Saya Sudah Bayar'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.TextView - OK'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Case1-Book Flight One Way/android.widget.Button - COBA SEKARANG (1)'), 0)

Mobile.closeApplication()

