package ordenamientoArreglo;

public class sortMethods {
	// Estos metodos son para imprimir en cadena para la interfaz grafica
	public String sortByBubbleAscendInterfaz(int[] arreglo, boolean logs) {
		StringBuilder log = new StringBuilder();
		int tamano = arreglo.length;
		int pasadas = 0;
		for (int i = 0; i < tamano; i++) {
			/*
			 * if (logs) {
			 * log.append("\nPass num ").append(i).append("\n");
			 * }
			 */
			for (int j = i + 1; j < tamano; j++) {
				/*
				 * if (logs) {
				 * log.append("i= ").append(arreglo[i]).append(" j= ").append(arreglo[j]).append
				 * ("\n");
				 * }
				 */
				if (arreglo[i] > arreglo[j]) {
					/*
					 * if (logs) {
					 * log.append("-Si es mayor se realiza el cambio\n");
					 * }
					 */
					int temporal = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temporal;
					pasadas++;
					/*
					 * if (logs) {
					 * log.append(imprimeInterfaz(arreglo)).append("\n");
					 * }
					 */
				}
			}
		}
		log.append("Total de pasadas: ").append(pasadas).append("\n");
		log.append(imprimeInterfaz(arreglo)).append("\n");
		return log.toString();
	}

	public String sortBySelectionAscendInterfaz(int[] arreglo, boolean logs) {
		StringBuilder log = new StringBuilder();
		int tamano = arreglo.length;
		int pasadas = 0;
		for (int i = 0; i < tamano - 1; i++) {
			int num = i;
			for (int j = i + 1; j < tamano; j++) {
				if (arreglo[j] < arreglo[num]) {
					num = j;
				}
			}
			int temporal = arreglo[num];
			arreglo[num] = arreglo[i];
			arreglo[i] = temporal;
			pasadas++;
			/*
			 * if (logs) {
			 * log.append("\nPass num ").append(i).append("\n");
			 * log.append(imprimeInterfaz(arreglo)).append("\n");
			 * }
			 */
		}
		log.append("Total de pasadas: ").append(pasadas).append("\n");
		log.append(imprimeInterfaz(arreglo)).append("\n");
		return log.toString();
	}

	public String sortByInsertionAscendInterfaz(int[] arreglo, boolean logs) {
		StringBuilder log = new StringBuilder();
		int tamano = arreglo.length;
		int pasadas = 0;
		for (int i = 1; i < tamano; ++i) {
			int key = arreglo[i];
			int j = i - 1;
			while (j >= 0 && arreglo[j] > key) {
				arreglo[j + 1] = arreglo[j];
				j = j - 1;
			}
			arreglo[j + 1] = key;
			pasadas++;
			/*
			 * if (logs) {
			 * log.append("\nPass num ").append(i).append("\n");
			 * log.append(imprimeInterfaz(arreglo)).append("\n");
			 * }
			 */
		}
		log.append("Total de pasadas: ").append(pasadas).append("\n");
		log.append(imprimeInterfaz(arreglo)).append("\n");
		return log.toString();
	}

	public String sortByBubbleUpgradeAscendInterfaz(int[] arreglo, boolean logs) {
		StringBuilder log = new StringBuilder();
		int tamano = arreglo.length;
		int pasadas = 0;
		boolean flag;
		for (int i = 0; i < tamano; i++) {
			flag = false;
			/*
			 * if (logs) {
			 * log.append("\nPass num ").append(i).append("\n");
			 * }
			 */
			for (int j = 1; j < tamano - i; j++) {
				/*
				 * if (logs) {
				 * log.append("i= ").append(arreglo[i]).append(" j= ").append(arreglo[j]).append
				 * ("\n");
				 * }
				 */
				if (arreglo[j - 1] > arreglo[j]) {
					/*
					 * if (logs) {
					 * log.append("-Si es mayor se realiza el cambio\n");
					 * }
					 */
					int temporal = arreglo[j - 1];
					arreglo[j - 1] = arreglo[j];
					arreglo[j] = temporal;
					flag = true;
					pasadas++;
					/*
					 * if (logs) {
					 * log.append(imprimeInterfaz(arreglo)).append("\n");
					 * }
					 */
				}
			}
			if (!flag)
				break;
		}
		log.append("Total de pasadas: ").append(pasadas).append("\n");
		log.append(imprimeInterfaz(arreglo)).append("\n");
		return log.toString();
	}

	public String imprimeInterfaz(int[] arreglo) {
		StringBuilder result = new StringBuilder();
		for (int i : arreglo) {
			result.append(i).append(" ");
		}
		return result.toString();
	}
}
