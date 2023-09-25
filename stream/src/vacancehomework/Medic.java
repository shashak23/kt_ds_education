package vacancehomework;

public class Medic implements HealUnit{


	private int health;
    private int speed;
    private int damage;

    public Medic(int health, int speed, int damage) {
        this.health = health;
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public void move() {
        System.out.println("메딕이 이동합니다------: " + speed);
    }

    @Override
    public void hold() {
        System.out.println("메딕이 정지합니다-----: " + health);
    }

    @Override
    public void patrol() {
        System.out.println("메딕이 정찰합니다-----: " + health);
    }

    @Override
    public void stop() {
        System.out.println("메딕이 이동을 멈춥니다-----: " + health);
    }

    @Override
    public void heal() {
        System.out.println("메딕이 치유합니다------: " + damage);
    }

    public static void main(String[] args) {
    	HealUnit medic1 = new Medic(100, 50, 30);
    	HealUnit medic2 = new Medic(90, 50, 40);
    	HealUnit medic3 = new Medic(90, 50, 60);
		
		medic1.move();
		medic1.hold();
		medic1.patrol();
		medic1.heal();
		medic1.stop();
		
	}

}
