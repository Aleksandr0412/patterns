package com.aleksandr0412.builder;


import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        var builder = new EmailBuilder();

        var content = new Content("Привет Всем!!!", "С уважением, Петров Александр, java-разработчик");

        var mail = builder.subject("Приветствие")
                .from("Александр Петров")
                .to("Илья")
                .to("Александр")
                .toAll(List.of("Алексей", "Михаил"))
                .to("Екатерина")
                .copyToAll(List.of("Амир"))
                .copyTo("Павел")
                .copyToAll(Set.of("Сергей", "Иван"))
                .copyTo("Алексей Т")
                .content(content)
                .build();

        System.out.println(mail);
    }

}