package company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class Main  extends Menu {
    public static void main(String[] args) throws IOException {
        BufferedReader fileR = new BufferedReader(new FileReader("src/company/dictionary"));
        ArrayList<company.infa> info = new ArrayList<>();
        String line;
        while ((line = fileR.readLine()) != null) {
            String[] words = line.split(":");
            info.add(new company.infa(words[0], words[1], words[2], words[3]));
        }
            int q;
            do {
                System.out.println("Choose an action: ");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("1 - Перевести с русского на английский ");
                System.out.println("2 - Перевести с английского на русский");
                System.out.println("3 - Показать краткое значение фразеологизма на русском");
                System.out.println("4 - Показать краткое значение фразеологизма на английском");
                System.out.println("5 - Завершить работу");
                q = sc1.nextInt();
                switch (q) {
                    case 1: {
                        SearchEng(info);
                        break;
                    }
                    case 2: {
                        SearchReversoinfo(info);
                        break;
                    }
                    case 3: {
                        Show_discribesRus(info);
                        break;
                    }
                    case 4: {
                        Show_discribesEng(info);
                        break;
                    }
                    case 5: {
                        System.out.println("Работа завершена!");
                        break;
                    }
                    default: {
                        System.out.println("Произошла ошибка, попробуйте еще раз!");
                    }
                }
            }
            while (q != 5);

        }
    }
