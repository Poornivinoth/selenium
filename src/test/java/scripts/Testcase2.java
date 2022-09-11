package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.Skillraryloginpage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException {
		Skillraryloginpage s = new Skillraryloginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
	
    SkillraryDemoLoginPage sd= new  SkillraryDemoLoginPage(driver);
    utilies.switchingtabs(driver);
    utilies.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
	
    TestingPage tp= new TestingPage(driver);
	utilies.dragdrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
	Point loc = tp.getFacebook().getLocation();
	int x = loc.getX();
	int y = loc.getY();
	
	utilies.scrollBar(driver, x, y);
	tp.facebookicon();
	}
}
