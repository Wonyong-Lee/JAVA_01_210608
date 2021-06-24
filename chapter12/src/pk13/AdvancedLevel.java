package pk13;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("낮게 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("돌아설 수 없습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("****당신은 중급자입니다****");
	}

}
