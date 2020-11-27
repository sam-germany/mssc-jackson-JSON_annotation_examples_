package com.springframework.jackson.model;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/*

on the top right side their is a search box click on it and write

"PropertyNamingStrategy"    their are many naming strategies are defined
just take one and put it in the   test/resources/application-snake.properties file

with the name snake.properties   here in the  @ActiveProfiles("snake")
it refer to that .properties file and so we put a link their
 */

@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest{

   @Test
    void testKabab() throws Exception{
       BeerDto dto = getDto();

       String json22 = objectMapper.writeValueAsString(dto);
       System.out.println(json22);
   }




}
