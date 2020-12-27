package Base;


import Utils.utils;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;


import static io.restassured.RestAssured.given;
public class BaseMethods  {

    @Test


    public static void getMethod() {

        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReports/demo.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);

        ExtentTest logger = extent.createTest("Launching URL GET Method");

        given().baseUri(utils.URL()).log().all()
                .get("https://reqres.in/api/users/2").then().log().all();
        logger.log(Status.INFO,"launching browser");
        logger.log(Status.PASS,"browser launched");
        extent.flush();

    }
        @Test
    public static void postMethod() {
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReports/demo.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger2 = extent.createTest("POST Method");

        given().baseUri(utils.URL()).log().all()
                .body(utils.postdetails("Sreyas", "Software intern"))
                .post("https://reqres.in/api/users").then().log().all();
        logger2.log(Status.INFO,"Post Method");
        logger2.log(Status.PASS,"Post Method Test Execution");
        extent.flush();

    }

    @Test

    public static void postMethod1() {
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReports/demo.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);

        ExtentTest logger3 = extent.createTest("Post Method1");
        given().baseUri(utils.URL()).log().all()
                .body(utils.postdetails("Shridhar", "Software intern"))
                .post("https://reqres.in/api/users").then().log().all();
        logger3.log(Status.INFO,"Post Method1");
        logger3.log(Status.PASS,"Post Method1 Test Execution");
        extent.flush();


    }

}



