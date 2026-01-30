package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        boolean moreSwaps=true;
        int temp;
        for(int i=1; i<input.length; i++){
            int key=input[i];
            boolean swapped=true;
            for(int j=i-1; swapped; j--){
                swapped=false;
                System.out.println("running");
                if(key<input[j]){
                    temp=input[j];
                    input[j]=key;
                    input[i]=temp;
                    swapped=true;
                }else{
                    swapped=false;
                }
            }
            for(int o:input){
                System.out.print(o+", ");
            }
            System.out.println();
        }
        for(int i:input){
            System.out.print(i+", ");
        }
    }
}

