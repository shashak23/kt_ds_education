package FruitStoreMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FruitStore {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 생성
        Map<String, Integer> fruitStock = new HashMap<>();
        Map<String, Integer> fruitPrice = new HashMap<>();
        int totalRevenue = 0;

        // 초기 과일 재고 설정
        fruitStock.put("수박", 3);
        fruitStock.put("멜론", 1);
        fruitStock.put("딸기", 2);
        fruitStock.put("참외", 5);

        // 초기 과일 가격 설정
        fruitPrice.put("수박", 19000);
        fruitPrice.put("멜론", 8000);
        fruitPrice.put("딸기", 12000);
        fruitPrice.put("참외", 15000);

        while (true) {
            System.out.println("< 과일 매장에 오신 것을 환영합니다. >");
            System.out.println("아래 메뉴 중 하나를 선택하세요.");
            System.out.println("==== 메뉴 ==================");
            System.out.println("1. 구매");
            System.out.println("2. 반품");
            System.out.println("3. 종료");
            System.out.println("============================");
            System.out.print("메뉴를 입력하세요: ");

            int menuNum = sc.nextInt();
            sc.nextLine();

            switch (menuNum) {
                case 1:
                    System.out.println("\"구매\"를 입력했습니다.");
                    System.out.println("구매 프로세스를 진행합니다.\n");

                    while (true) {
                        System.out.println("=== 메뉴 ====================");
                        System.out.println("1. 수박");
                        System.out.println("2. 멜론");
                        System.out.println("3. 딸기");
                        System.out.println("4. 참외");
                        System.out.println("5. 뒤로가기");
                        System.out.println("=============================");
                        System.out.print("메뉴를 입력하세요. ");

                        int fruitNum = sc.nextInt();
                        sc.nextLine();

                        if (fruitNum == 5) {
                            break;
                        }

                        String fruitName = "";
                        int price = 0;
                        int stock = 0;

                        switch (fruitNum) {
                            case 1:
                                fruitName = "수박";
                                break;
                            case 2:
                                fruitName = "멜론";
                                break;
                            case 3:
                                fruitName = "딸기";
                                break;
                            case 4:
                                fruitName = "참외";
                                break;
                            default:
                                System.out.println("잘못된 메뉴 번호입니다. 다시 입력해주세요.");
                                continue;
                        }

                        price = fruitPrice.get(fruitName);
                        stock = fruitStock.get(fruitName);

                        System.out.println("\"" + fruitName + "\"을 입력했습니다.");
                        System.out.println("\"" + fruitName + "\" 가격은 " + price + "원 입니다.");
                        System.out.println("\"" + fruitName + "\" 재고는 " + stock + "개 남았습니다.");

                        System.out.print("구매하시겠습니까? (y/n): ");
                        String answer = sc.nextLine().toUpperCase();

                        if (answer.equals("Y")) {
                            if (stock > 0) {
                                fruitStock.put(fruitName, stock - 1);
                                totalRevenue += price;
                                System.out.println("\"" + fruitName + "\"을 구매합니다.");
                                System.out.println("과일매장의 \"" + fruitName + "\" 재고는 " + (stock - 1) + "개가 되었습니다.");
                                System.out.println("과일매장의 수익금은 " + totalRevenue + "원 입니다.\n");
                            } else {
                                System.out.println("\"" + fruitName + "\"은 품절되었습니다.\n");
                            }
                        } else {
                            System.out.println("\"" + fruitName + "\"을 구매하지 않습니다.\n");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\"반품\"를 입력했습니다.");
                    System.out.println("반품 프로세스를 진행합니다.\n");

                    while (true) {
                        System.out.println("구매자가 구매한 상품은 ");
                        int index = 1;
                        for (String fruit : fruitStock.keySet()) {
                            int purchased = fruitStock.get(fruit) != 0 ? 1 : 0;
                            if (purchased == 1) {
                                System.out.println("===========================");
                                System.out.println(index + ". " + fruit + " (" + purchased + "개)");
                                index++;
                            }
                        }

                        System.out.println("2. 취소");
                        System.out.println("===========================");
                        System.out.print("어떤 상품을 반품하시겠습니까? ");
                        int returnNum = sc.nextInt();
                        sc.nextLine();

                        if (returnNum == index) {
                            break;
                        }

                        int fruitIndex = 1;
                        String fruitToReturn = "";

                        for (String fruit : fruitStock.keySet()) {
                            int purchased = fruitStock.get(fruit) != 0 ? 1 : 0;
                            if (purchased == 1) {
                                if (fruitIndex == returnNum) {
                                    fruitToReturn = fruit;
                                    break;
                                }
                                fruitIndex++;
                            }
                        }

                        System.out.println("\"" + fruitToReturn + "\"을 반품합니다.");
                        fruitStock.put(fruitToReturn, fruitStock.get(fruitToReturn) + 1);
                        totalRevenue -= fruitPrice.get(fruitToReturn);
                        System.out.println("과일매장의 \"" + fruitToReturn + "\" 재고는 " + fruitStock.get(fruitToReturn) + "개가 되었습니다.");
                        System.out.println("과일매장의 수익금은 " + totalRevenue + "원 입니다.\n");
                    }

                    System.out.println("반품할 상품이 없습니다.");
                    System.out.println("반품 프로세스를 종료합니다.\n");
                    break;

                case 3:
                    System.out.println("과일매장의 총 수익금은 " + totalRevenue + "원 입니다.");
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("잘못된 메뉴 번호입니다. 다시 입력해주세요.\n");
                    break;
            }
        }
    }
}
