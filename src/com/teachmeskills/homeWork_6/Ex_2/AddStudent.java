package com.teachmeskills.homeWork_6.Ex_2;
/*Задача 2
Создать класс для описания студента нашей группы.
Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
Создать объекты этого класса для каждого из студента нашей группы.
Поместить все эти обеъекты в массив.
Пройти по массиву циклом for-each и вывести информацию на консоль.
import java.util.Scanner;

 */

import java.util.Scanner;

public class AddStudent {
        public static void main(String[] args){
            String name;
            String surname;
            String passportNumber;
            String groupName;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of students in this group: ");
            int groupSize = scanner.nextInt();
            Student[] group = new Student[groupSize];
            Scanner scan = new Scanner(System.in);

            int count = 1;
            for (int i = 0; i < group.length; i++) {
                System.out.println("Enter the name of student № " + count + " : ");
                name = scan.nextLine();
                System.out.println("Enter the surname of student № " + count + " : ");
                surname = scan.nextLine();
                System.out.println("Enter a passport number of student № " + count + " : ");
                passportNumber = scan.nextLine();
                System.out.println("Enter a number group of student № " + count + " : ");
                groupName = scan.nextLine();
                group[i] = Student.createStudent(name,surname,passportNumber,groupName);
                count++;
            }

            for (Student i: group) {
                System.out.println("Name: " + i.name +" " + i.surname + ". Passport number: " + i.passportNumber + ". Group name: " + i.groupName);
            }
        }
    }

