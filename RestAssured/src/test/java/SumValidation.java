import org.testng.Assert;
import org.testng.annotations.Test;
import data.payload;
import io.restassured.path.json.JsonPath;

public class SumValidation{
	@Test
	public void jsonSumValidation() {
		int totalForCourses =0;
		JsonPath jp =new JsonPath(payload.CoursePrice());

		//Print No of Courses returned by API
		int coursesCount = jp.getInt("courses.size()");
		System.out.println("Total courses count is : " + coursesCount);

		//Print Purchase amount
		int purchaseAmount = jp.getInt("dashboard.purchaseAmount");
		System.out.println("Total purchase amount is : " + purchaseAmount);

		//Verify if sum of all course prices matches with purchase amount
		for(int i=0; i<coursesCount; i++) {
			int  Price= jp.getInt("courses["+i+"].price");
			int  Copies= jp.getInt("courses["+i+"].copies");
			totalForCourses = totalForCourses + (Price * Copies);
		}
		Assert.assertEquals(totalForCourses,purchaseAmount);
	}
}
