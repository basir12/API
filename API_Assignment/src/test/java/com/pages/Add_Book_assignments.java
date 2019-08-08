package com.pages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import files.Payload_Assign;
import files.Utilities;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Add_Book_assignments {

	static String endPoint = "http://216.10.245.166";
	public static Response response;
	static String MessageValue;

	@BeforeMethod
	public void beforMethod() {

		RestAssured.baseURI = endPoint;

	}

	@Test
	public void auntintication() {

		response = given().contentType(ContentType.JSON).body(Payload_Assign.b(Utilities.rendamStirng(), 1234567))
				.when().post("/Library/Addbook.php");

		String resp = response.asString();

		System.out.println(resp);

	}

	@Test
	public void getBook() {

		response = given().contentType(ContentType.JSON).param("AuthorName", "John foe").when()
				.get("/Library/GetBook.php").then().statusCode(200).extract().response();
		System.out.println(response.asString());

	}

}
