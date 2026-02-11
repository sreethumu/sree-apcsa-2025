package sorting;

public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        for(int i=1; i<input.length; i++){
            //System.out.println(i);
            int key=input[i];
            for(int j=i-1; j>=0; j--){
                int compareTo=input[j];
                if(compareTo>key){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
        
        for(int num:input){
            System.out.print(num + ", ");
        }
}

}

