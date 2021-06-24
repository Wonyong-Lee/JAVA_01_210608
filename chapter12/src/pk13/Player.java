package pk13;

public class Player {

	private PlayerLevel level;      // PlayerLevel level = new PlayerLevel();
	
	public Player() {
		// PlayerLevel level = new BeginnerLEvel(); ��ü����
		level = new BeginnerLevel();    // �ʺ��ڷ� �޸𸮹���
		level.showLevelMessage();       // �ʺ��� �޼���
	}

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();        // �� ������ �޼���
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
