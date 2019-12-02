import java.util.*;

class Main{
	int array[];

	Main(int size){
		array=new int[size];
	}

	void fillArray(int a[]){
		Random numAleatorio = new Random();
		int n = 0; 
		for (int i=0;i<a.length;i++) {
			n = numAleatorio.nextInt(100-0+1) + 0;//Numero Aleatorio de 0 a 100
			a[i]=n;
		}
	}

	void showArray(int a[]){
		System.out.print("Arreglo: ");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+"	");
		}
		System.out.print("\n\n");
	}

	int[] getArray(){
		return array;
	}

	public static void main(String[] args) {
		Main e=new Main(5);
		Quicksort q=new Quicksort();
		e.fillArray(e.getArray());
		System.out.println("::BEFORE::");
		e.showArray(e.getArray());
		q.quicksort(e.getArray(),0,e.getArray().length-1);
		System.out.println("::AFTER::");
		e.showArray(e.getArray());
	}
	
}