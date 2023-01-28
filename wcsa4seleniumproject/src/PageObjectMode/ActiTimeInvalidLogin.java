package PageObjectMode;

import DataDrivenFrameWork.Flib;

public class ActiTimeInvalidLogin extends BaseTest{

	public static void main(String[] args) {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount(EXCEL_PATH, "Invalidcreds");
		for(int i=1;i<rc;i++)
		{
		String invalidUsername = flib.readExcelData(EXCEL_PATH,"Invalidcreds", i,0);
		String invalidPassword=flib.readExcelData(EXCEL_PATH, "Invalidcreds", i, 1);
	}
	}
}
