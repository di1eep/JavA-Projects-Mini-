import java.util.Scanner;

public class Main {

    public static <string> void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int DD = scan.nextInt();
        int MM = scan.nextInt();
        int YYYY = scan.nextInt();

        int last_2_digits_of_year = YYYY % 100;
        int year_divided_by_4 = last_2_digits_of_year / 4;
        int number = 6;
        
        int MM_M = 0;

            if(MM == 1 || MM == 10){
                MM_M = 0; }
            else if(MM == 5){
            MM_M = 1; }
            else if(MM == 8){
            MM_M = 2; }
            else if(MM == 2 || MM == 3 || MM == 11){
            MM_M = 3; }
            else if(MM == 6) {
            MM_M = 4; }
            else if(MM == 9 || MM == 12){
            MM_M = 5; }
            else{
            MM_M = 6; }



        int happy_new_year = last_2_digits_of_year + year_divided_by_4 + DD + MM_M + number;
        int number_of_week = happy_new_year % 7;


            switch(number_of_week) {
                case 0:System.out.println("Sunday");
                break;
                case 1:System.out.println("Monday");
                    break;
                case 2:System.out.println("Tuesday");
                    break;
                case 3:System.out.println("Wednesday");
                    break;
                case 4:System.out.println("Thursday");
                    break;
                case 5:System.out.println("Friday");
                    break;
                case 6:System.out.println("Saturday");
                    break;


            }
        }
        }