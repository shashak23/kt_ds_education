package vacancehomework;

public class Marine implements AttackUnit {
	
	private int health;
    private int speed;
    private int damage;

    public Marine(int health, int speed, int damage) {
        this.health = health;
        this.speed = speed;
        this.damage = damage;
    }

	@Override
	public void move() {
        System.out.println("마린이"+ speed + "이동합니다...............");
		
	}

	@Override
	public void hold() {
        System.out.println("마린이"+ speed + "정지합니다.................");
		
	}

	@Override
	public void patrol() {
        System.out.println("마린이"+ health + " 정찰합니다................");
		
	}

	@Override
	public void stop() {
        System.out.println("마린이 이동을 멈춥니다.................");
		
	}

	@Override
	public void attack() {
        System.out.println("마린이 공격합니다..... :" + damage);
		
	}
	
	public static void main(String[] args) {
		AttackUnit marine1 = new Marine(100, 50, 30);
		AttackUnit marine2 = new Marine(90, 50, 40);
		AttackUnit marine3 = new Marine(90, 50, 60);
		
		marine1.move();
		marine1.hold();
		marine1.patrol();
		marine1.attack();
		marine1.stop();
		
	}

}
