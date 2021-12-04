// Feb - 28 days (не учитывается вис год когда колво дней в месяце - 29)
// Jan, Mar, May, Jul, Aug, Oct, Dec - 31 days
// Apr, Jun, Sep, Nov - 30 days


package com.company;

import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy, обратите внимание нули в днях и месяцах опциональны, временной интервал(в годах) - 1900-9999гг.");

        String pattern = "^(31(/)(0?[13578]|1[02])(/)(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))|((29|30)(/)(0?[13456789]|1[0-2])(/)(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))|((0?[1-9]|1[0-9]|2[0-8])(/)(0?[1-9]|1[0-2])(/)(19[0-9][0-9]|[2-9][0-9][0-9][0-9]))$";

        String text = scan.nextLine();

        scan.close();

        boolean matcher = Pattern.matches(pattern, text);

        if (matcher) {
            System.out.println("Введённая дата соответствует формату dd/mm/yyyy");
        } else {
            System.out.println("Введённая дата не соответствует формату dd/mm/yyyy");
        }

        // day 01-28
        // 0?[0-9]|1[0-9]|2[1-8]
        // (31(/)(0?[13578]|1[02])) | ((29|30)(/)(0?[13456789]|1[0-2])) | ((0?[1-9]|1[0-0]|2[0-8])(/)
        // (0?[1-9]|1[0-2]))

        // month
        // 0?[1-9]|1[0-2]

        // year
        // 19[0-9][0-9]|[2-9][0-9][0-9][0-9]
    }
}