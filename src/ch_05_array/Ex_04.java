package ch_05_array;

public class Ex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 �迭�� �̿��Ͽ� �������� ������ �غ���
		 �л� ���� 27��
		 �� ���� �ο��� 3������.
		 
		 */
		String[] students = {"���ȯ","������","������","������","������","�ڱ���","�ڼ���","�ڼ���","������","������","���","���ϴ�","�ſ�ȭ","������","������","������",
				"������","���¹�","�̱���","�̼�ȣ","�̽���","�̿���","����","������","�ֹμ�","������","Ȳ����"};
		
		
		/*�ε��� ��ȣ �̿��� ���
		int numberPerTeam = 3;
		int count = 0;
		
		// ����
		for(int i = 0; i < 10000; i++ ) {
			int n = (int)(Math.random() * students.length);
			String temp = students[0];
			students[0] = students[n];
			students[n] = temp;
		}
		
		for (int i = 0; i < students.length; i++) {
			if ((i + 1) % numberPerTeam == 1) {
				System.out.println( ++ count + "��: ");
			}
			System.out.println(students[i] + " ");
			if ((i + 1) % numberPerTeam == 0) {
				System.out.println();
			}
		}
		*/
		
		
		/*
		//2�� �迭 �̿� ���
		String team[][] = new String[9][3];
		int count = 0;
		
		for (int i = 0; i < team.length; i++) {
			System.out.print((i+1) + "��: ");
			if(i<9) {
				for(int j=0; j<team[i].length;) {
					int k = (int)(Math.random()*27);
					
					if(!students[k].equals("x")) {
						team[i][j] = students[k];
						System.out.print(team[i][j] + " ");				
						students[k] = "x";
						j++;
					}
				}
				System.out.println();
			}
		}
		*/
		
		// (1) 27������ �̷���� �� �л����� ���� member�迭 ����
		// (2) StringŸ���� 27(9x3)�� ������� ���� team�迭 ����
		String team[][] = new String[9][3];
		int count = 0;
		
		for (int i = 0; i < team.length; i++) {
			System.out.print((i+1) + "��: ");
			if(i<9) {
				for(int j=0; j<team[i].length;) {
					int k = (int)(Math.random()*27);
					
					if(!students[k].equals("x")) {
						team[i][j] = students[k];
						System.out.print(team[i][j] + " ");				
						students[k] = "x";
						j++;
					}
				}
				System.out.println();
			}
		}
	

	}

}
