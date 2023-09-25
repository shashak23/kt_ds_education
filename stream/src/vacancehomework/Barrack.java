package vacancehomework;

import java.util.ArrayList;
import java.util.Random;

public class Barrack {

	ArrayList<Unit> units;

    public Barrack() {
    	this.units = new ArrayList<>();
    }

    public void createMarine() {
//        Marine marine = new Marine(100, 10, 5);
//        units.add(marine);
    	Random rand = new Random();
    	int hp = rand.nextInt(100);
    	int speed = rand.nextInt(90);
    	int damage = rand.nextInt(80);
    	
    	Marine marine = new Marine(hp, speed, damage);
    	units.add(marine);
        System.out.println("마린이 생성되었습니다.");
    }

    public void createMedic() {
//        Medic medic = new Medic(80, 15, 3);
//        units.add(medic);
    	Random rand = new Random();
    	int health = rand.nextInt(100);
    	int speed = rand.nextInt(90);
    	int damage = rand.nextInt(80);
    	
    	Medic medic = new Medic(health, speed, damage);
    	units.add(medic);
        System.out.println("메딕이 생성되었습니다.");
    }

    public Unit getNthUnit(int n) {
            return units.get(n);
    }

    public void printMarineUnits() {
        System.out.println("마린 유닛 목록:");
        for (Unit unit : units) {
            if (unit instanceof Marine) {
            	// AttackUnit attackUnit = unit;으로 하면 문제가 생김
            	// 그래서 ()를 이용해서 형변환을 해줘야 함
            	AttackUnit attackUnit = (AttackUnit)unit;
                System.out.println("마린 유닛입니당 ---- ");
            }
        }
    }

    public void printMedicUnits() {
        System.out.println("메딕 유닛 목록:");
        for (Unit unit : units) {
            if (unit instanceof Medic) {
            	HealUnit healUnit = (HealUnit)unit;
                System.out.println("메딕 유닛");
            }
        }
    }
    
    public static void main(String[] args) {
		Barrack barrack1 = new Barrack();
		barrack1.createMarine();
		barrack1.createMedic();
		barrack1.createMarine();
		barrack1.createMedic();
		barrack1.createMarine();
		barrack1.createMedic();
		barrack1.createMarine();
		barrack1.createMedic();

		Unit unit = barrack1.getNthUnit(1);
		
		barrack1.printMarineUnits();
		barrack1.printMedicUnits();
    
    }
}
