package com.mvnproject.utilities;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TestData {

    private static ObjectMapper objectMapper = new ObjectMapper();

    private static JsonNode data;

    static {
        try {
            File file = new File("D:/Maven Project/demo/src/test/java/com/mvnproject/resources/TestData.json");
            data = objectMapper.readTree(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) {
        return data.get(key).asText();
    }
}