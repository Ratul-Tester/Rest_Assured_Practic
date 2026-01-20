package com.ratultester.RestfulBooker_CRUD.GET.NonBDDStyle;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class getOperationNonBDDStyle {

    public static void main(String[] args) {
        RequestSpecification rs = RestAssured.given();
                rs.baseUri("https://restful-booker.herokuapp.com").basePath("/booking").log().all();
                        rs.when().log().all().get();
                                rs.then().log().all().statusCode(200);
    }
}
