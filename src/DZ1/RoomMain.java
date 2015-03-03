package DZ1;

import java.util.Scanner;

public class RoomMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumWeight = 0;
        boolean tryAgain = true;

        while (tryAgain) {
            String turn;
            System.out
                    .println("Чтобы добавить, в комнату, стул нажмите - '1', чтобы убрать стул - '-1' стол - '2'/'-2'," +
                            " диван - '3'/'-3'. Для выхода нажмите '0'.");
            turn = in.nextLine();
            switch (turn) {
                case "1":
                    Chair.addChair();
                    sumWeight += Chair.weight;
                    System.out.println("Вес мебели равен " + sumWeight);
                    break;
                case "-1":
                    if (Chair.counter > 0) {
                        Chair.removeChair();
                        sumWeight -= Chair.weight;
                        System.out.println("Вес мебели равен " + sumWeight);
                    } else System.out.println("Добавте стул в комнату!");
                    break;
                case "2":
                   Table.addTable();
                    sumWeight += Table.weight;
                    System.out.println("Вес мебели равен " + sumWeight);
                    break;
                case "-2":
                    if (Table.counter > 0) {
                        Table.removeTable();
                        sumWeight -= Table.weight;
                        System.out.println("Вес мебели равен " + sumWeight);
                    } else System.out.println("Добавте стол в комнату!");
                    break;
                case "3":
                    Sofa.addSofa();
                    sumWeight += Sofa.weight;
                    System.out.println("Вес мебели равен " + sumWeight);
                    break;
                case "-3":
                    if (Sofa.counter > 0) {
                        Sofa.removeSofa();
                        sumWeight -= Sofa.weight;
                        System.out.println("Вес мебели равен " + sumWeight);
                    } else System.out.println("Добавте диван в комнату!");
                    break;
                case "0":
                    tryAgain = false;
                    System.out.println("Работа программы окончена.");
                    break;
                default:
                    System.out.println("Вы нажали не правильную кнопку! Попробуйте еще раз.");
            }
        }
        in.close();
    }
}
