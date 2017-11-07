package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String strline;
        String strLineSpliter;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Введите разделяемую строку: ");
        strline = br.readLine();
        System.out.println("Введите строку разделитель: ");
        strLineSpliter = br.readLine();

        if (strline.contains(strLineSpliter)) {
            System.out.println("Это разделенная строка: ");
            for (String line : strline.split(strLineSpliter)) {
                System.out.println("\"" + line + "\"");
            }
        }
        else{
            System.out.println("Ошибка!\nСтроку невозможно разделить на подстроки, разделитель в исходной строке не найден");
        }
    }
}
