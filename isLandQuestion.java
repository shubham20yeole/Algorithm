package Adobe;

import java.util.*;

public class isLandQuestion {
	public static void main(String[] args) {
		int[][] world = {
				{1,	1,	1,	1,	1},
				{1,	1,	1,	1,	1},
				{1,	1,	1,	1,	1},
				{1,	1,	1,	1,	1},
				{1,	1,	1,	1,	1}
		};
		System.out.println(getIsLands(world));
	}

	private static int getIsLands(int[][] world) {
		int islands = 0, row = world.length, col = world[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int curr = world[i][j];
				if(curr==1){
					checkIsLand(i, j, world);
					islands = islands + 1;
					System.out.println("ISLAND = "+islands);
				}
			}
		}


		return islands;
	}

	private static void checkIsLand(int i, int j, int[][] world) {

		Queue<int[]> q = new LinkedList<int[]>();
		int[] array = new int[2];
		int row = world.length, col = world[0].length;
		array[0] = i;
		array[1] = j;
		q.add(array);
		world[i][j] = -1;
		printArray(world, q);

		while(!q.isEmpty()){
			array = q.poll();
			int a = array[0];
			int b = array[1];

			world[a][b] = -1;

			//check right
			if(b+1<col){
				if(world[a][b+1]==1){
					world[a][b+1] = -1;
					int[] aaa = new int[2];
					aaa[0] = a;
					aaa[1] = b+1;
					q.add(aaa);
					printArray(world, q);

				}
			}
			//check left
			if(b-1>=0){
				if(world[a][b-1]==1){
					world[a][b-1] = -1;
					int[] aaa = new int[2];
					aaa[0] = a;
					aaa[1] = b-1;
					q.add(aaa);
					printArray(world, q);

				}
			}
			//check Up
			if(a-1>0){
				if(world[a-1][b]==1){
					world[a-1][b] = -1;
					int[] aaa = new int[2];

					aaa[0] = a-1;
					aaa[1] = b;
					q.add(aaa);
					printArray(world, q);

				}
			}
			//check down
			if(a+1<row){
				if(world[a+1][b]==1){
					world[a+1][b] = -1;
					int[] aaa = new int[2];

					aaa[0] = a+1;
					aaa[1] = b;
					q.add(aaa);
					printArray(world, q);

				}
			}

		}
		System.out.println("Island Finish");		
	}


	private static void printArray(int[][] world, Queue<int[]> q) {
		int row = world.length, col = world[0].length;

		if(q!=null){
			Queue<int[]> queue = new LinkedList<int[]>(q);
			while(!queue.isEmpty()){
				int[] aa = queue.poll();
				int a = aa[0];
				int b = aa[1];
				System.out.println(a+", "+b);
			}
		}
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(world[i][j]+", ");
//			}
			System.out.println(Arrays.deepToString(world));
//		}
//		System.out.println("");

		System.out.println("____________________________\n");

	}
}

