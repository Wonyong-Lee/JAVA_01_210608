package pk4;

public class AssignTest_04 {

	public static void main(String[] args) {

		// �������� ����ϰ� ���, �������� ���� ���� ��� �� ����� ���߿�
		
		// ���� ����
		int gameScore=150;               
		int lastScore1=++gameScore;        // 1�� ���ϰ� �б� 151
		System.out.println(lastScore1);    // 151
		
		int lastScore2=--gameScore;        // 1�� ���� �б� 150
		System.out.println(lastScore2);    // 150
		
		
		// ���� ����
		int lastScore3=gameScore++;        // �а� �� 1�� ���ϱ�
		System.out.println(lastScore3);    // 150
		System.out.println(gameScore);     // 151
		
		int lastScore4=gameScore--;        // �а� �� 1�� ����
		System.out.println(lastScore4);    // 151
		System.out.println(gameScore);     // 150
		
				
 	}

}
