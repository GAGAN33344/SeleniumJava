import data.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {

		String courseTitles;
		JsonPath jp =new JsonPath(payload.CoursePrice());

		//Print No of Courses returned by API
		int coursesCount = jp.getInt("courses.size()");
		System.out.println("Total courses count is : " + coursesCount);

		//Print Purchase amount
		int purchaseAmount = jp.getInt("dashboard.purchaseAmount");
		System.out.println("Total purchase amount is : " + purchaseAmount);

		//Print title of the first course
		String firstCourseTitle = jp.getString("courses[0].title");
		System.out.println("First course title is : " + firstCourseTitle);

		//Print title of the third course
		String thirdCourseTitle = jp.getString("courses[2].title");
		System.out.println("Third course title is : " + thirdCourseTitle);

		//Print all courses title and their respective prices
		for(int i=0; i<coursesCount; i++) {
			courseTitles = jp.getString("courses["+i+"].title");
			System.out.println("Title is : " + courseTitles);
			System.out.println(jp.getInt("courses["+i+"].price"));
			//or
			//System.out.println(jp.get("courses["+i+"].price").toString());
		}

		//Print no of copies sold by RPA Course
		for(int i=0; i<coursesCount; i++) {
			courseTitles = jp.getString("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA")) {
				int  RPACopies= jp.getInt("courses["+i+"].copies");
				System.out.println("RPA Copies are : " + RPACopies);
				break;
			}
		}
	}
}
