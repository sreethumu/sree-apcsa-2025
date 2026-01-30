package sorting;

public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        for(int i=0; i<input.length; i++){
            int max=input[0];
            int indexOf=0;
            //find biggest value
            for(int j=0; j<input.length-i; j++){
                if(input[j]>max){
                    max=input[j];
                    indexOf=j;
                }
            }
            //shift the array
            System.out.print(max + "   ");
            System.out.println(indexOf);
            for(int k=indexOf; k<input.length-i; k++){
                if(input.length-i-1==k){
                    input[k]=max;
                }else{
                    input[k]=input[k+1];
                }
            }
        }
        System.out.println();
        for(int i: input){
            System.out.print(i+", ");
        }
        System.out.println("Selection Sort!!!");
    }
}
