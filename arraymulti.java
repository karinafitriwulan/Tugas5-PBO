public class arraymulti {
	public static void main(String[] args){
		int[][] nilai = {{10,12},{11,14}};

		for (int i = 0; i < nilai.length; i++) {
			for (int j = 0; j < nilai[i].length; j++) {
				System.out.print(nilai[i][j]+"\t");
			}
			System.out.println();
		}

	}
}
