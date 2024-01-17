package com.networking;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
  public static void main(String[] args) throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();

    // Serialize an object to JSON
    People person = new People("John Doe", 25);
    String jsonString = objectMapper.writeValueAsString(person);
    System.out.println("Serialized JSON: " + jsonString);

    // Deserialize JSON to an object
    String jsonToDeserialize = "{\"name\":\"Jane Doe\",\"age\":30}";
    People deserializedPerson = objectMapper.readValue(jsonToDeserialize,
        People.class);
    System.out.println("Deserialized Person: " + deserializedPerson);
  }
}
