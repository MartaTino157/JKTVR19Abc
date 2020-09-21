/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19abc;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {

    public void run() {
        System.out.println(" ---- ABC ---- ");
        /**
        * Алгоритм: 
        * 
        * Попросить пользователя ввести текст
        * Создать массив символов латиницы char[28]
        * Пройти циклом по алфавиту с поиском текущего символа в строке
        * если -1, то такой буквы нет -> заносим его в массив notChar[28]
        * если -1 не выпадает ни разу -> текст содержит все буквы алфавита
        *
        */
        System.out.println("Введите текст: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        char [] str = text.toCharArray();
        char [] notChar = new char[26];
        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if(str[i]!=alphabet[j]) {
                    System.out.println("Буква "+alphabet[j]+" отсутствует");
                } 
                
            }
            
        }
    }
    
}
