public class Main {
        public static void main(String[] arg) {
            // Задание 1
            int i = 0;
            while (i < 10)
                System.out.print(++ i + " ");
            System.out.println();
            for (; i > 0; i --) {
                System.out.print(i + " ");
            }
            // Задание 2
            int friday = 4;
            for ( int trueFriday = friday; trueFriday <= 31 ; trueFriday += 7 ) {
                System.out.println("Сегодня пятница, " + trueFriday + "-е число. Необходимо подготовить отчет.");
            }
            // Зажание 3
            int firstYear = 2022 - 200;
            int lastYear = 2022 + 100;
            for (;firstYear <= lastYear;firstYear ++ ) {
                if (firstYear % 79 == 0)
                    System.out.println(firstYear);
            }
        }
}