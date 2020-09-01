import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class HandIndices {
	private String dir_path = "D:/programming/gof_ISMCTS/handIndices/";
	
	public static int[][] i1 = new int[16][1];
	public static int[][] i2 = new int[66][2];
	public static int[][] i3 = new int[125][3];
	public static int[][] i4 = new int[125][4];
	public static int[][] i5 = new int[4368][5];
	
	public HandIndices() throws FileNotFoundException {
		for (int i = 1; i < 6; i++) {
			Scanner sc = new Scanner(new BufferedReader(new FileReader(dir_path + "i" + i + ".txt")));
			
			int[][] array = null;
			switch (i) {
				case 1:
					array = HandIndices.i1;
					break;
				case 2:
					array = HandIndices.i2;
					break;
				case 3:
					array = HandIndices.i3;
					break;
				case 4:
					array = HandIndices.i4;
					break;
				case 5:
					array = HandIndices.i5;
					break;
			}
			            			
			for (int j = 0; j < array.length; j++) {
				String[] line = sc.nextLine().trim().split(" ");
				for (int k = 0; k < line.length; k++) {
					array[j][k] = Integer.parseInt(line[k]);
			    }
			}
		}
	}
}
