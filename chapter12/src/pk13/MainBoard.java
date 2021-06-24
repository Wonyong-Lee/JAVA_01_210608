package pk13;

public class MainBoard {

	public static void main(String[] args) {

		// 기본 게임 레벨 1단계
		Player player = new Player();
		player.play(1);
		
		// 레벨 2단계
		AdvancedLevel aLevel = new AdvancedLevel();
		/*
		aLevel.showLevelMessage();
		aLevel.go(2);
		*/
		player.upgradeLevel(aLevel);           // 중급자 레벨       // 위와 합치면 player.upgradeLevel(new AdvancedLevel());
		player.play(2);                        // == aLevel.go
		
		// 레벨 3단계
		SuperLevel sLevel = new SuperLevel();
		/*
		sLevel.showLevelMessage();
		sLevel.go(3);
		*/
		player.upgradeLevel(sLevel);           // 개고수 레벨       // 위와 합치면 player.upgradeLevel(new SuperLevel());       
		player.play(3);                        // == sLevel.go
	}

}
