class FindMinMaxAvg {
	
	public static void main(String[] args) {
		 int[] arr = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
		 int max = arr[0];
		 int min = arr[0];
		 int sum = arr[0]; 
		 for (var i = 1; i < arr.length; i++) {
		 	if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
		   }
			sum = sum + arr[i];
	    }
		System.out.println("The element with the Minimum value: " +min+"\n"+ "The element with the Maximum value: "  +max +"\n"+
		"Average of all array elements: " + sum/arr.length+"\n"+"Total number of array elements: "+arr.length); 
	}
}
