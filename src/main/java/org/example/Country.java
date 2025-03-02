package org.example;

import org.springframework.web.client.RestClient;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Country {
    public static void main(String[] args) {
        System.out.printf("Ввведите страну:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String url = "https://restcountries.com/v3.1/alpha/"+input;
        // Получаем данные по API
        RestClient restClient = RestClient.create();
        String response = restClient.
                get().
                uri(url).
                retrieve().
                body(String.class);

        System.out.println("Ответ:" + response);
    }
}
