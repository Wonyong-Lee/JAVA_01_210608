package pk13;

public class MainBoard {

	public static void main(String[] args) {

		// �⺻ ���� ���� 1�ܰ�
		Player player = new Player();
		player.play(1);
		
		// ���� 2�ܰ�
		AdvancedLevel aLevel = new AdvancedLevel();
		/*
		aLevel.showLevelMessage();
		aLevel.go(2);
		*/
		player.upgradeLevel(aLevel);           // �߱��� ����       // ���� ��ġ�� player.upgradeLevel(new AdvancedLevel());
		player.play(2);                        // == aLevel.go
		
		// ���� 3�ܰ�
		SuperLevel sLevel = new SuperLevel();
		/*
		sLevel.showLevelMessage();
		sLevel.go(3);
		*/
		player.upgradeLevel(sLevel);           // ����� ����       // ���� ��ġ�� player.upgradeLevel(new SuperLevel());       
		player.play(3);                        // == sLevel.go
	}

}
