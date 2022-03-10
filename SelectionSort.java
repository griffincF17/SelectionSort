class SelectionSort{
    public static void main(String[] args){
        int arr[] = {9, 7, 4, 1, 6, 8, 0, 3, 2, 5};

	//Prints the original array
	for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
	}
	System.out.println();

	//The selection sort algorithm
	for(int j = 0; j < arr.length; j++){
            int lowestIndex = j;
            
	    //Goes through each unsorted element for the smallest value
	    for(int k = j; k < arr.length - 1; k++){
                if(arr[k + 1] < arr[lowestIndex]){
                    lowestIndex = k + 1;
		}
	    }
	    //Places the smallest unsorte value at the end of the sorted subarray.
	    int tmp = arr[j];
	    arr[j] = arr[lowestIndex];
	    arr[lowestIndex] = tmp;

	    //Prints the array after each run
	    System.out.print("After run " + (j + 1) + ": ");
            for(int l = 0; l < arr.length; l++){
                System.out.print(arr[l]);
	    }
	    System.out.println();
	}//end selection sort algorithm

    }//end main method
}//end SelectionSort class
