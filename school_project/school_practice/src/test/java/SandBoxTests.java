/*
 * @(#)SandBoxTests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SandBoxTests {

    private static RequestSpecification spec;

    @BeforeAll
    public static void init() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setProxy("gate.swissre.com", 9443)
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @Test
    public void simpleBackEndTest() {
        User[] users = given()
                .spec(spec)
                .when()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(User[].class);

        Post[] posts = given()
                .spec(spec)
                .when()
                .get("posts")
                .then()
                .statusCode(200)
                .extract().as(Post[].class);

        assertTrue(Arrays.stream(posts).anyMatch(p -> p.getBody().startsWith("odio fugit voluptatum ducimus earum autem est incidunt")));
        assertTrue(Arrays.stream(users).anyMatch(u -> u.getName().equals("Chelsey Dietrich")));

        Integer userId = 0;

        for (int i = 0; i < posts.length; i++) {
            if (posts[i].getBody().startsWith("odio fugit voluptatum ducimus earum autem est incidunt")) {
                userId = posts[i].getUserId();
            }
        }

        String userName = null;

        for (int i = 0; i < users.length; i++) {
            if (userId.equals(users[i].getId())) {
                userName = users[i].getName();
            }
        }

        assertEquals("Chelsey Dietrich", userName);
    }
}