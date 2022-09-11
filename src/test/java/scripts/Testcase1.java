package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.Skillraryloginpage;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tc1() {
    Skillraryloginpage s = new Skillraryloginpage(driver);
    s.gearsbutton();
    s.skillrarydemoapplication();
    
    utilies.switchingtabs(driver);
    
    SkillraryDemoLoginPage sd= new SkillraryDemoLoginPage(driver);
    utilies.mouseHover(driver,sd.getCoursetab());
    sd.seleniumtrainingtab();

    AddtoCartPage d = new AddtoCartPage(driver);
    utilies.doubleClick(driver, d.getAddtn());
    d.carttocartbtn();
    utilies.alertPopup(driver);
	}

}
