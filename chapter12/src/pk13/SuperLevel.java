package pk13;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("매우 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높게 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("돌아설 수 있습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****당신은 개고수입니다****");
	}

}
