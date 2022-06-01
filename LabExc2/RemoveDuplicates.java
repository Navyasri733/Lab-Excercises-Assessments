package LabExc2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int a[] = { 5, 4, 5, 6, 4, 7, 8, 8, 9, 9, 6, 2, 2 };
		int n = a.length;

		int m = 0;

		for (int i = 0; i < n; i++) {
			m = Math.max(m, a[i]);

		}

		int[] f = new int[m + 1];

		for (int i = 0; i < m + 1; i++) {
			f[i] = 0;

		}

		for (int i = 0; i < n; i++) {
			f[a[i]]++;

		}

		for (int i = 0; i < m + 1; i++) {
			if (f[i] > 0) {
				System.out.print(i + " ");

			}

		}
	}

}


