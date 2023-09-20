package PassIndiaDemo.PassIndiaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewApplicationsHomePage {
	
	static WebDriver driver;
	public static void main(String[]args)throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\avina\\OneDrive\\SELENIUM\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		driver.get("https://passport.quiestatechnologies.com/index.php");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        //New Application FORM========>
        
		driver.findElement(By.linkText("New Application")).click();
		Thread.sleep(2000);
		
		
		//1. Service Required------->
		
		driver.findElement(By.id("1_application_for")).click();
		Thread.sleep(2000);

		WebElement TypeOfApplication = driver.findElement(By.xpath("//select[@id='sel_type_appl']"));
		Select z = new Select(TypeOfApplication);
		z.selectByVisibleText("Tatkaal");
		
		WebElement TypeOfPassportBooklet =
				driver.findElement(By.xpath("//select[@id='1_type_of_booklet']"));
		Select y=new Select(TypeOfPassportBooklet);
		y.selectByVisibleText("60 Pages");
		
		

		JavascriptExecutor ScrollDown = ((JavascriptExecutor)driver);
		ScrollDown.executeScript("scroll(0,500)");
		Thread.sleep(2000);
		
		
		//2. Applicant details------->
		
		
		driver.findElement(By.id("contact_2_fname")).sendKeys("Avinash");
		driver.findElement(By.id("txt_middlename")).sendKeys("Balkrushna");
		driver.findElement(By.id("txt_lastname")).sendKeys("Bunde");
		driver.findElement(By.id("txt_aadharno")).sendKeys("262667548765");
		Thread.sleep(2000);


		WebElement Gender=
				driver.findElement(By.xpath("//select[@id='contact_2_gender']"));
		Select x=new Select(Gender);
		x.selectByVisibleText("Male");
		
		WebElement MaritalStatus =
				driver.findElement(By.xpath("//select[@id='contact_2_marital_status']"));
		Select w=new Select(MaritalStatus);
		w.selectByVisibleText("Single");
		
		driver.findElement(By.id("contact_2_dob")).sendKeys("02/04/1998");
		

		WebElement BirthOutOfIndia=
				driver.findElement(By.xpath("//select[@id='sel_place_birth']"));
		Select v=new Select(BirthOutOfIndia);
		v.selectByVisibleText("No");
		
		
		driver.findElement(By.id("contact_2_village")).sendKeys("Ghodegaon");

		WebElement Country=
				driver.findElement(By.xpath("//select[@id='india_country']"));
		Select u=new Select(Country);
		u.selectByVisibleText("INDIA");
		
		
		WebElement State=
				driver.findElement(By.xpath("//select[@id='contact_2_state']"));
		Select t=new Select(State);
		t.selectByVisibleText("Maharashtra");
		
		
		WebElement District=
				driver.findElement(By.xpath("//select[@id='contact_2_district']"));
		Select s=new Select(District);
		s.selectByVisibleText("Akola");
		
		
		WebElement CitizenshipOfIndia =
				driver.findElement(By.xpath("//select[@id='sel_citizenship']"));
		Select r=new Select(CitizenshipOfIndia);
		r.selectByVisibleText("Birth");
		Thread.sleep(2000);

		
		driver.findElement(By.id("txt_pan")).sendKeys("12435675HU");
		driver.findElement(By.id("txt_voter_id")).sendKeys("1246756768");
		

		WebElement EducationalQualification =
				driver.findElement(By.xpath("//select[@id='c_2_qualification']"));
		Select q=new Select(EducationalQualification);
		q.selectByVisibleText("Graduate And Above");
		
		
		WebElement EmploymentType =
				driver.findElement(By.xpath("//select[@id='sel_emp_type']"));
		Select p=new Select(EmploymentType);
		p.selectByVisibleText("Student");


		WebElement  GovtServant =
				driver.findElement(By.xpath("//select[@id='contact_2_sapouse']"));
		Select o=new Select(GovtServant);
		o.selectByVisibleText("No");
		
		
		WebElement NonECRcategory =
				driver.findElement(By.xpath("//select[@id='contact_2_non_ecr']"));
		Select a=new Select(NonECRcategory);
		a.selectByVisibleText("No");
		Thread.sleep(2000);

		
		
		driver.findElement(By.id("txt_visible_dmark")).sendKeys("No");
		

		WebElement OtherNames =
				driver.findElement(By.xpath("//select[@id='sel_any_aliases']"));
		Select b=new Select(OtherNames);
		b.selectByVisibleText("No");
		
		
		WebElement ChangedYourName =
				driver.findElement(By.xpath("//select[@id='sel_chg_name']"));
		Select c=new Select(ChangedYourName);
		c.selectByVisibleText("No");
		Thread.sleep(2000);

		
		//3) FAMILY DETAILS-------->
		
		
		driver.findElement(By.id("myform_3_father_f_name")).sendKeys("Balkrushna");
		driver.findElement(By.id("myform_3_father_m_name")).sendKeys("Rajaram");
		driver.findElement(By.id("myform_3_father_l_name")).sendKeys("Bunde");
		driver.findElement(By.id("myform_3_mother_f_name")).sendKeys("Vimal");
		driver.findElement(By.id("myform_3_mother_m_name")).sendKeys("Balkrushna");
		driver.findElement(By.id("myform_3_mother_l_name")).sendKeys("Bunde");
		driver.findElement(By.id("myform_3_gard_f_name")).sendKeys("Balkrushna");
		driver.findElement(By.id("myform_3_gard_m_name")).sendKeys("Rajaram");
		driver.findElement(By.id("myform_3_gard_l_name")).sendKeys("Bunde");

		Thread.sleep(2000);

		
		//4. Present Residential Address Details------>
		
		
		WebElement AddressOutOfIndia =
				driver.findElement(By.xpath("//select[@id='sel_present_adr_1']"));
		Select d=new Select(AddressOutOfIndia);
		d.selectByVisibleText("No");
		
		driver.findElement(By.id("contact_4_house_no")).sendKeys("45");
		driver.findElement(By.id("contact_4_town")).sendKeys("Village");
		Thread.sleep(2000);

		
		WebElement Countryy=
				driver.findElement(By.xpath("//select[@id='contact_4_country']"));
		Select e=new Select(Countryy);
		e.selectByVisibleText("INDIA");
		
		
		WebElement Statee=
				driver.findElement(By.xpath("//select[@id='state-list']"));
		Select f=new Select(Statee);
		f.selectByVisibleText("Maharashtra");
		
		
		WebElement Districtt=
				driver.findElement(By.xpath("//select[@id='district-list']"));
		Select g=new Select(Districtt);
		g.selectByVisibleText("Akola");
		

		WebElement PoliceStation=
				driver.findElement(By.xpath("//select[@id='p_station_list']"));
		Select h=new Select(PoliceStation);
		h.selectByVisibleText("TELHARA");
		Thread.sleep(2000);

		
		driver.findElement(By.id("contact_4_pincode")).sendKeys("444108");
		driver.findElement(By.id("contact_4_mobile")).sendKeys("7756085708");
		driver.findElement(By.id("contact_4_email")).sendKeys("avinash123@");

		WebElement PermanentAddress=
				driver.findElement(By.xpath("//select[@id='sel_permanent_adr']"));
		Select i=new Select(PermanentAddress);
		i.selectByVisibleText("Yes");
		
		Thread.sleep(2000);

		
		//5. Emergency Contact Details-------->
		
		
		driver.findElement(By.id("contact_5_name_address")).sendKeys("At.post Ghodegaon");
		driver.findElement(By.id("contact_5_mobile")).sendKeys("7756085708");
		driver.findElement(By.id("email5")).sendKeys("avinash123@gmail.com");

		Thread.sleep(2000);

		
		//6. Previous Passport / Application Details------->
		
		
		WebElement IdentityCertificate=
				driver.findElement(By.xpath("//select[@id='sel_identity_cer']"));
		Select j=new Select(IdentityCertificate);
		j.selectByVisibleText("Yes");
		
		driver.findElement(By.id("txt_identity_cer_no")).sendKeys("89876546");
		driver.findElement(By.id("txt_cer_issue_date")).sendKeys("11/12/2021");
		driver.findElement(By.id("txt_cer_exp_date")).sendKeys("04/10/2024");
		driver.findElement(By.id("txt_cert_place_issue")).sendKeys("Pune");
		driver.findElement(By.id("txt_file_no")).sendKeys("143");
		Thread.sleep(2000);


		driver.findElement(By.xpath("//select[@id='sel_prev_cd_opass']")).click();

		
		WebElement  ButNotIssued=
				driver.findElement(By.xpath("//select[@id='sel_appl_not_issue']"));
		Select k=new Select(ButNotIssued);
		k.selectByVisibleText("No");
		
		Thread.sleep(2000);

		
		//7. Other Details-------->
		
		
		WebElement  criminalcourtinIndia=
				driver.findElement(By.xpath("//select[@id='sel_arrest_warrant']"));
		Select m=new Select(criminalcourtinIndia);
		m.selectByVisibleText("No");
		
		WebElement  warrant=
				driver.findElement(By.xpath("//select[@id='sel_warrant']"));
		Select n=new Select(warrant);
		n.selectByVisibleText("No");
		
		
		WebElement   criminaloffence=
				driver.findElement(By.xpath("//select[@id='sel_criminal_offence']"));
		Select zz=new Select(criminaloffence);
		zz.selectByVisibleText("No");
		
		
		WebElement   DeniedPassport=
				driver.findElement(By.xpath("//select[@id='sel_denied_passport']"));
		Select aa=new Select(DeniedPassport);
		aa.selectByVisibleText("No");
		
		
		WebElement   Revoked=
				driver.findElement(By.xpath("//select[@id='sel_passport_revoked']"));
		Select bb=new Select(Revoked);
		bb.selectByVisibleText("No");
		
		
		WebElement    ForeignCountry=
				driver.findElement(By.xpath("//select[@id='sel_political_asylum']"));
		Select cc=new Select(ForeignCountry);
		cc.selectByVisibleText("No");
		
		
		WebElement    EmergencyCertificate=
				driver.findElement(By.xpath("//select[@id='sel_ec']"));
		Select dd=new Select(EmergencyCertificate);
		dd.selectByVisibleText("No");
		
		WebElement    orderprohibiting=
				driver.findElement(By.xpath("//select[@id='prohibit_warrant']"));
		Select ee=new Select(orderprohibiting);
		ee.selectByVisibleText("No");
		
		Thread.sleep(2000);

		
		
		//8. Documents Submitted As Proof----->
		
		
		WebElement    AddressProof=
				driver.findElement(By.xpath("//select[@id='contact_8_document_proof']"));
		Select ff=new Select(AddressProof);
		ff.selectByVisibleText("Aadhaar Card");
		Thread.sleep(2000);

		
		WebElement    IdProof=
				driver.findElement(By.xpath("//select[@id='contact_8_id_proof']"));
		Select gg=new Select(IdProof);
		gg.selectByVisibleText("PAN Card");
		Thread.sleep(2000);

		
		WebElement    EducationProof=
				driver.findElement(By.xpath("//select[@id='contact_8_education_proof']"));
		Select hh=new Select(EducationProof);
		hh.selectByVisibleText("Higher Educational Pass Certificate");
		Thread.sleep(2000);

		
		WebElement    DateOfBirthProof=
				driver.findElement(By.xpath("//select[@id='contact_8_dob_proof']"));
		Select ii=new Select(DateOfBirthProof);
		ii.selectByVisibleText("Voter ID");
		Thread.sleep(2000);

		
		//8. Documents Submitted and FILE UPLOAD----->
		
		driver.findElement(By.xpath("//input[@name='address_doc']")).sendKeys("C:\\Users\\avina\\OneDrive\\SELENIUM\\Datatypes-converted (1).pdf");
		driver.findElement(By.xpath("//input[@name='id_doc']")).sendKeys("C:\\Users\\avina\\OneDrive\\SELENIUM\\Datatypes-converted (1).pdf");
		driver.findElement(By.xpath("//input[@name='education_doc']")).sendKeys("C:\\Users\\avina\\OneDrive\\SELENIUM\\Datatypes-converted (1).pdf");
		driver.findElement(By.xpath("//input[@name='dob_doc']")).sendKeys("C:\\Users\\avina\\OneDrive\\SELENIUM\\Datatypes-converted (1).pdf");
		
		
		
		
		
		driver.findElement(By.name("submit")).click();

		
		
		
		
		
	}
	
	

}
