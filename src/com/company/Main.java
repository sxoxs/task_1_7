package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String strline, strLineSpliter;

        System.out.println("Введите разделяемую строку: ");
        strline = inConsole();
        System.out.println("Введите строку разделитель: ");
        strLineSpliter = inConsole();

        if (strline.contains(strLineSpliter)) {
            System.out.println("Это разделенная строка: ");
            for (String i : strline.split(strLineSpliter)) {
                System.out.println("\"" + i + "\"");
            }
        }
        else{
            System.out.println("Ошибка!\nСтроку невозможно разделить на подстроки, разделитель в исходной строке не найден");
        }
    }

    static String inConsole () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}
