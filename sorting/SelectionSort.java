package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        for(int i=0; i<input.length; i++){
            int min=input[i];
            int temp;
            //find smallest value
            for(int j=i; j<input.length; j++){
                if(input[j]<min){
                    min=input[j];
                }
            }
            //shift the array
            for(int k=0; k<input.length-1; k++){
                input[k+1] = input[k];
            }
            input[0]=min;
        }
        System.out.println(input);
        System.out.println("Selection Sort!!!");
    }
}
