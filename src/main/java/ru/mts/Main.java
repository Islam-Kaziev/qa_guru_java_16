package ru.mts;

public class Main {
        public static void main(String[] args) {

                // Переполнение
                int intValue = 350;
                byte intByte = intValue;
                System.out.println(intByte);

                byte z = 2;
                byte e = 127;
                System.out.println(z + e);


                // Вычисление разных комбинации типов данных

                int x = 20;
                double y = 50.32;
                short a = 34;
                System.out.println(x + y);
                System.out.println(x / y);
                System.out.println(y - a);
                System.out.println(y * a - 2);
        }
}