package PageObjectMode;

import KeyWordDrivenFrameWork.BaseTest;
import KeyWordDrivenFrameWork.Flib;

public class ActiTimeValidLogin extends BaseTest {
public static void main(String[] args) {
    BaseTest bt = new BaseTest();
    //
    bt.openBrowser();
    
    //read data from property file
    Flib flib = new Flib();
    
    LoginPage lp = new LoginPage(driver);
    
    lp.actiTimeValidLogin 
    
}

}
