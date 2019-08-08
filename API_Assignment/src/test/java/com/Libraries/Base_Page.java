package com.Libraries;

import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.response.Response;

public class Base_Page {

	static String endPoint = "http://216.10.245.166";
	public static Response response;

	@BeforeMethod
	public void beforMethod() {

		response = given().when().get(endPoint);

		String resStg = response.asString();
		System.out.println("Response as Stirng:\t" + resStg);

		int statusCode = response.getStatusCode();
		System.out.println("This is the Endpoint title statuse code:\t" + statusCode);

	}

	@AfterMethod
	public void afterMethod() {

	}

}
