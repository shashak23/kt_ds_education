package contact;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactApp {
	
//	static ContactVO[] contactVOArray = new ContactVO[];
//	static int index = [];

	public static void main(String[] args) {
		
		// interface 호출 = 값
		ContactService contactService = new ContactServiceImpl();
		// scanner 만들기
		Scanner sc = new Scanner(System.in);
		
//		contactService.create(null);
//		contactService.readAll();
//		contactService.readOne(0);
//		contactService.updateOne(0, null);
//		contactService.deleteOne(0);

		while(true) {
			System.out.println("Start App=====================");
			System.out.println("1. create ");
			System.out.println("2. readAll ");
			System.out.println("3. readOne ");
			System.out.println("4. updateOne ");
			System.out.println("5. deleteOne ");
			
			int selectNum;
            try {
                selectNum = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong Number, Press the Number plz");
                sc.nextLine(); // 입력 버퍼 비우기
                continue; // 다시 메뉴를 입력받도록 반복문의 처음으로 돌아감
            }
			switch(selectNum) {
			// 등록하기 
			case 1 : 
				System.out.print("name: ");
                sc.nextLine(); // 버퍼 비우기
                String name = sc.nextLine();

                System.out.print("phone number: ");
                int phone = sc.nextInt();

                System.out.print("email: ");
                sc.nextLine(); // 버퍼 비우기
                String email = sc.nextLine();

                ContactVO newContact = new ContactVO(name, phone, email);
                contactService.create(newContact);
                break;
            // 전체 조회
			case 2 : 
				ContactVO[] allContacts = contactService.readAll();
				System.out.println("\n----------select All Infromation----------");
                if (allContacts.length == 0) {
                    System.out.println("nobody");
                } else {
                    System.out.println("===== Contact List =====");
                    for (ContactVO contact : allContacts) {
                        System.out.println("name: " + contact.getName());
                        System.out.println("phone: " + contact.getPhone());
                        System.out.println("email: " + contact.getEmail());
                        System.out.println("-----------------------");
                    }
                }
//				for(int i=0; i<index; i++) {
//					allContacts[i].showInfo();
//				}

                
                break;
			case 3:
                System.out.print("select One index: ");
                int index = sc.nextInt();
                ContactVO contact = contactService.readOne(index);
                if (contact == null) {
                    System.out.println("Wrong Index");
                } else {
                    System.out.println("===== " + index + "Contact Information =====");
                    System.out.println("name: " + contact.getName());
                    System.out.println("phone: " + contact.getPhone());
                    System.out.println("email: " + contact.getEmail());
                    System.out.println("-----------------------");
                }
                break;
			case 4:
                System.out.print("update Contact index: ");
                int modifyIndex = sc.nextInt();

                System.out.print("name: ");
                sc.nextLine(); // 버퍼 비우기
                String modifyName = sc.nextLine();

                System.out.print("phone: ");
                int modifyPhone = sc.nextInt();

                System.out.print("email: ");
                sc.nextLine(); // 버퍼 비우기
                String modifyEmail = sc.nextLine();

                ContactVO modifyContact = new ContactVO(modifyName, modifyPhone, modifyEmail);
                contactService.updateOne(modifyIndex, modifyContact);
                break;

            case 5:
                System.out.print("delete index: ");
                int deleteIndex = sc.nextInt();
                contactService.deleteOne(deleteIndex);
                break;

            case 6:
                System.out.println("End App=====================");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Wrong Number. Try again!!!!!!");
			}
			
		}
		
	}
}
