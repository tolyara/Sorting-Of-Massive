package Package_sorting;

import java.util.*;
import java.io.*;
import java.nio.file.FileSystemException;

import java.math.*;

public class SortingMain {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] massive_fact1 = new int[10];
        int[] massive_fact2 = new int[10];
        int[] massive_fact3 = new int[10];

        System.out.println("Программа сортирует массив из 10 чисел. Применяются 3 вида сортировки - вставками, выбором и пузырьком.");
        System.out.print("Будут созданы 3 разных массива, каждый из них будет заполнен случайными числами от 0 до 100. Для продолжения нажмите любую клавишу > ");

        reader.readLine();

        // Заполняем наши 3 массива
        for (int i = 0; i < massive_fact1.length; i++) massive_fact1[i] = (int) (Math.random() * 100);
        for (int i = 0; i < massive_fact2.length; i++) massive_fact2[i] = (int) (Math.random() * 100);
        for (int i = 0; i < massive_fact3.length; i++) massive_fact3[i] = (int) (Math.random() * 100);

        // Работаем с первым массивом
        System.out.println();
        System.out.print("Ваш первый массив: ");
        for (int i = 0; i < massive_fact1.length; i++) {
            System.out.print(massive_fact1[i] + " ");
        }
        System.out.println();
        System.out.print("Сортировка данного массива чисел вставками: ");
        MassiveSorting mass_s = new MassiveSorting();
        mass_s.sorting_insertion(massive_fact1);
        for (int element : massive_fact1) System.out.print(element + " ");
        System.out.println();
        System.out.println();

        // Работаем со вторым массивом
        System.out.print("Ваш второй массив: ");
        for (int i = 0; i < massive_fact2.length; i++) {
            System.out.print(massive_fact2[i] + " ");
        }
        System.out.println();
        System.out.print("Сортировка данного массива чисел выбором  : ");
        mass_s.sorting_selection(massive_fact2);
        for (int element : massive_fact2) System.out.print(element + " ");
        System.out.println();
        System.out.println();

        // Работаем с третьим массивом
        System.out.print("Ваш третий массив: ");
        for (int i = 0; i < massive_fact3.length; i++) {
            System.out.print(massive_fact3[i] + " ");
        }
        System.out.println();
        System.out.print("Сортировка данного массива чисел пузырьком: ");
        mass_s.sorting_bubble(massive_fact3);
        for (int element : massive_fact3) System.out.print(element + " ");
        System.out.println();

    }

}
