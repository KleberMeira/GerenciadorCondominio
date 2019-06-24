
public class Ordenador {

	public void mergesortAno(Predio a[], int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergesortAno(a, start, middle);
			mergesortAno(a, middle + 1, end);
			merge(a, start, middle, end);
		}
	}

	private void merge(Predio[] a, int start, int middle, int end) {
		Predio[] b = new Predio[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = new Predio(a[i]);
		}
		int i = start;
		int j = middle + 1;
		int k = start;

		while (i <= middle && j <= end) {
			if (b[i].getData().compareAno(b[j].getData().getAno()) < 0)
				a[k++].copiarEvento(b[i++]);
			else
				a[k++].copiarEvento(b[j++]);
		}

		while (i <= middle)
			a[k++].copiarEvento(b[i++]);

	}
	
}
