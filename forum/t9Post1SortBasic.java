package forum;

import java.util.Arrays;
public class t9Post1SortBasic {

     public static void bubleSort(int[] list){
         //loop each element
         for(int i=0;i<list.length;++i){
             //loop to compare right element value
             for(int j=0;j<list.length-i-1;++j){
                //compare curr element value vs value on the right element
                 //asc order use >; desc order use <
                 if(list[j]>list[j+1]){
                     //swap value between element
                     int buffer=list[j];
                     list[j]=list[j+1];
                     list[j+1]=buffer;
                 }
             }

         }

     }

     public static void insertionSort(int[] list){
        for(int i=1; i<list.length;++i){
            int curVal=list[i];
            int leftIdx=i-1;
            //compare value to the left element,
            // move element until smaller value found
            while (leftIdx>=0 && curVal<list[leftIdx]){
                list[leftIdx+1]=list[leftIdx];
                --leftIdx;
            }
            //move current value to correct pos
            list[leftIdx+1]=curVal;
         }
     }

     public static void selectionSort(int[] list){
        for (int i=0; i<list.length-1;++i){
            int minIdx=i;
            for(int j=i+1;j<list.length;++j){
                if(list[j]<list[minIdx]){
                    minIdx=j;
                }
            }
            //swap value
            int bfr=list[i];
            list[i]=list[minIdx];
            list[minIdx]=bfr;
        }
     }

    public static void main(String[] args) {
        int[] dummyBubble={4,6,1,8,3,6};
        System.out.println("Bubble Sort");
        System.out.println("Before: " + Arrays.toString(dummyBubble));
        bubleSort(dummyBubble);
        System.out.println("After : " + Arrays.toString(dummyBubble));

        int[] dummyIns={9,6,2,8,1};
        System.out.println("Insertion Sort");
        System.out.println("Before: " + Arrays.toString(dummyIns));
        insertionSort(dummyIns);
        System.out.println("After : " + Arrays.toString(dummyIns));

        int[] dummySelect={10,3,4,7,2};
        System.out.println("Selection Sort");
        System.out.println("Before: " + Arrays.toString(dummySelect));
        selectionSort(dummySelect);
        System.out.println("After : " + Arrays.toString(dummySelect));
    }
}
