package Day16;

public class BubbleDemo {
	public <T extends Comparable<T>> T[] bubbleDemo(T[] array2) {
        for (Integer i = 0; i < array2.length; i++) {
            for (Integer j = 0; j < array2.length-i-1; j++) {
                if(array2[j].compareTo(array2[j+1])>0) {
                    Integer x = (Integer) array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = (T)x;
                }
            }
        }
        return array2;
    }


    public void displaySort(Integer[] array2) {
        for(Integer i : array2) {
            System.out.print(i+" ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
    	BubbleDemo sort = new BubbleDemo();

        Integer array[] = {35,40,10,70,50,20,60,22,44};
        Integer [] sortedArray = sort.bubbleDemo(array);
        System.out.println("Bubble sort is :");
        sort.displaySort(sortedArray);
    }

}
