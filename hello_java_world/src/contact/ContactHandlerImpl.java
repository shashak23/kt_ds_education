package contact;

import java.util.List;

public class ContactHandlerImpl implements ContactHandler{
	// ContactApp에서 이름 바꾸기 알크 + 쉬프트 + 알
	// 이름 바꾸고 인터페이스 만들기 
	private ContactService contactService;  // 2단계


	// 생성자 하나 넣어주고
	public ContactHandlerImpl(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@Override
	// 등록 메소드로 빼기 -- 2단계
	public void create(String name, int phone, String email) {
		ContactVO contact = new ContactVO(name, phone, email);
		contactService.create(contact);
	}
	
	@Override
	// 전체 조회 -- 2단계
	public void readAll() {
		List<ContactVO> contactlist = contactService.readAll();
		for(ContactVO contact : contactlist) {
			System.out.println("name: " + contact.getName());
			System.out.println("phone: " + contact.getPhone());
            System.out.println("email: " + contact.getEmail());
		}
	}
	
	@Override
	// 개별 조회 -- 2단계 
	// idx값을 출력하도록 파라미터로 넣어 놓고
	public void readOne(int idx) {
		ContactVO oneContact = contactService.readOne(idx);
		System.out.println("name: " + oneContact.getName());
		System.out.println("phone: " + oneContact.getPhone());
        System.out.println("email: " + oneContact.getEmail());
	}
	
	@Override
	// 삭제하기 -- 2단계
	public void delete(int idx) {
		contactService.deleteOne(0);
	}
	
	@Override
	// 수정하기 -- 2단계
	public void updateOne(int idx, String name, int phone, String email) {
		ContactVO contact = contactService.readOne(idx);
		contact.setName(name);
		contact.setPhone(phone);
		contact.setEmail(email); // update의 끝
		// 배열의 주소를 갖고 있는 메모리의 주소에 있는 데이터를 바꿨다!
		// 눈에 보이지는 않지만 메모리에서는 작동이 된 것 -- why? 레퍼런스 타입(항상 메모리 값을 가짐)
		contactService.updateOne(idx, contact); // 명확하게 보여주기!
	}
	// 여기까지 하고 인터페이스를 만들거에요! -- 2단계 --------------------------------------

//	public static void main(String[] args) {
		
//		ContactVO[] contactArray = new ContactVO[100];
		
		// interface 호출 = 값
		// impl()에 null을 주면 nullpoint예외, 
		// 우리는 contactArray를 줘야한다.
//		ContactService contactService = new ContactServiceImpl(contactArray); // 1단계
		
		// 연락처 데이터 직접 입력 
//		ContactVO contact = new ContactVO("김시하", 111, "siha");
//		contactService.create(contact);
//
//		contact = new ContactVO("김베리", 222, "berry");
//		contactService.create(contact);
//		
//		contact = new ContactVO("김하늘", 333, "sky");
//		contactService.create(contact);
		
		// 전체 조회
		// 컨택트vo에 대한 배열이고 기본값이 객체라서 널이고
		// 데이터에 null이면 nullpoint예외가 나오고
		// null이 아니면 안나옴 그렇게 하기 위해서는 
//		ContactVO[] contactlist = contactService.readAll();
//		for(int i=0; i<contactlist.length; i++) {
//			ContactVO tempContact = contactlist[i];
//			System.out.println("name: " + tempContact.getName());
//			System.out.println("phone: " + tempContact.getPhone());
//            System.out.println("email: " + tempContact.getEmail());
//		}
		
		// 개별 조회
//		ContactVO oneContact = contactService.readOne(2);
//		System.out.println("name: " + oneContact.getName());
//		System.out.println("phone: " + oneContact.getPhone());
//        System.out.println("email: " + oneContact.getEmail());
        
        // 삭제하기
//        contactService.deleteOne(0);
//        contactService.deleteOne(1);
//        
//        // 수정하기
//        oneContact.setName("김시하");        
//        contactService.updateOne(2, oneContact);
//        
        // 삭제 됐는지 확인하기
//        contactlist = contactService.readAll();
//		for(int i=0; i<contactlist.length; i++) {
//			ContactVO tempContact = contactlist[i];
//			System.out.println("name: " + tempContact.getName());
//			System.out.println("phone: " + tempContact.getPhone());
//            System.out.println("email: " + tempContact.getEmail());
//		}
        
        // 여기까지하면 nullpoint예외가 나와요 -> 그 이유가 100배열인데 3개만 만들어서
        // 100개의 인덱스에 들어있는 값은 다 0이니까 a[i] += 1; 해도 에러가 안나요
        // 근데 int가 아니가 string일 경우에는 기본값이 null이니까 에러가 나요
        
        //------------------------------ 위 교수님 코드 1단계 , 아래 내 코드 
		
//		contactService.create(null);
//		contactService.readAll();
//		contactService.readOne(0);
//		contactService.updateOne(0, null);
//		contactService.deleteOne(0);

//		while(true) {
//			System.out.println("Start App=====================");
//			System.out.println("1. create ");
//			System.out.println("2. readAll ");
//			System.out.println("3. readOne ");
//			System.out.println("4. updateOne ");
//			System.out.println("5. deleteOne ");
//			
//			int selectNum;
//            try {
//                selectNum = sc.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Wrong Number, Press the Number plz");
//                sc.nextLine(); // 입력 버퍼 비우기
//                continue; // 다시 메뉴를 입력받도록 반복문의 처음으로 돌아감
//            }
//			switch(selectNum) {
//			// 등록하기 
//			case 1 : 
//				System.out.print("name: ");
//                sc.nextLine(); // 버퍼 비우기
//                String name = sc.nextLine();
//
//                System.out.print("phone number: ");
//                int phone = sc.nextInt();
//
//                System.out.print("email: ");
//                sc.nextLine(); 
//                String email = sc.nextLine();
//
//                contactVOArray[idx++] = new ContactVO(name, phone, email);
//                break;
//            // 전체 조회
//			case 2 : 
//				ContactVO[] contactVOArray = contactService.readAll();
//				System.out.println("\n----------select All Information----------");
//                if (contactVOArray.length == 0) {
//                    System.out.println("nobody");
//                } else {
//                    System.out.println("===== Contact List =====");
//                    for (ContactVO contact : contactVOArray) {
//                        System.out.println("name: " + contact.getName());
//                        System.out.println("phone: " + contact.getPhone());
//                        System.out.println("email: " + contact.getEmail());
//                        System.out.println("-----------------------");
//                    }
//                }
//
//                
//                break;
//			case 3:
//                System.out.print("select One index: ");
//                int index = sc.nextInt();
//                ContactVO contact = contactService.readOne(index);
//                if (contact == null) {
//                    System.out.println("Wrong Index");
//                } else {
//                    System.out.println("===== " + index + "Contact Information =====");
//                    System.out.println("name: " + contact.getName());
//                    System.out.println("phone: " + contact.getPhone());
//                    System.out.println("email: " + contact.getEmail());
//                    System.out.println("-----------------------");
//                }
//                break;
//			case 4:
//                System.out.print("update Contact index: ");
//                int modifyIndex = sc.nextInt();
//
//                System.out.print("name: ");
//                sc.nextLine(); // 버퍼 비우기
//                String modifyName = sc.nextLine();
//
//                System.out.print("phone: ");
//                int modifyPhone = sc.nextInt();
//
//                System.out.print("email: ");
//                sc.nextLine(); 
//                String modifyEmail = sc.nextLine();
//
//                ContactVO modifyContact = new ContactVO(modifyName, modifyPhone, modifyEmail);
//                contactService.updateOne(modifyIndex, modifyContact);
//                break;
//
//            case 5:
//                System.out.print("delete index: ");
//                int deleteIndex = sc.nextInt();
//                contactService.deleteOne(deleteIndex);
//                break;
//
//            case 6:
//                System.out.println("End App=====================");
//                sc.close();
//                System.exit(0);
//
//            default:
//                System.out.println("Wrong Number. Try again!!!!!!");
//			}
//			
//		}
		
//	}
	
}
