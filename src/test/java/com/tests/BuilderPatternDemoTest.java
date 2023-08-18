package com.tests;

import com.github.javafaker.Faker;
import com.pojo.Employee;
import com.pojo.EmployeeBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BuilderPatternDemoTest {

    @Test
    public void postJsonUsingBuilderTest() {
        Employee employee = EmployeeBuilder.builder()
                .setName("Neetu")
                .setAddress("Gurgaon")
                .setId(generateRandomID())
                .build();

        Response response = given().baseUri("https://dummy.restapiexample.com/")
                .contentType(ContentType.JSON)
                .log()
                .all()
                .body(employee)
                .when()
                .post("/create");
        System.out.println(response.getStatusCode());
    }

    private String generateRandomID() {
        return String.valueOf(new Faker().number().digits(3));
    }
}
