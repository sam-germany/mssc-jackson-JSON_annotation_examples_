package com.springframework.jackson.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;



@JsonTest
class BeerDtoTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test          // hier serialization means that their is a object and we are converting it to a JSON object
    void testSerializeDto22() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString22 = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString22);
    }

    @Test
    void testDeserialize22() throws IOException {
        String json22 = "{\"id\":\"639c00ff-9993-4ec1-af12-8277c85f93bb\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2019-06-03T21:01:53-0400\",\"lastUpdatedDate\":\"2019-06-02T16:35:58.321872-04:00\"}";
        System.out.println("AAA : " + json22);


        BeerDto dto = objectMapper.readValue(json22, BeerDto.class);
        System.out.println(dto);

/* json22  = {
               "id" : "639c00ff-9993-4ec1-af12-8277c85f93bb",
               "beerName" : "BeerName",
               "beerStyle" : "Ale",
               "upc" : 123123123123,
               "price" : 12.99,
               "createdDate" : "2019-06-02T16:35:58.321001-04:00",
               "lastUpdatedDate" : "2019-06-02T16:35:58.321872-04:00"
             }

he created a JSON object  \"   it will print  "   only one double-quote.
just for showing purpose he create this json object.
*/
    }





}
