// Java program for the above approach
class GFG{
	
    // Function to find the Fibonacci
    // number which is nearest to N
    static void nearestFibonacci(int num)
    {
        
        // Base Case
        if (num == 0)
        {
            System.out.print(0);
            return;
        }
    
        // Initialize the first & second
        // terms of the Fibonacci series
        int first = 0, second = 1;
    
        // Store the third term
        int third = first + second;
    
        // Iterate until the third term
        // is less than or equal to num
        while (third <= num)
        {
            
            // Update the first
            first = second;
    
            // Update the second
            second = third;
    
            // Update the third
            third = first + second;
        }
    
        // Store the Fibonacci number
        // having smaller difference with N
        int ans = (Math.abs(third - num) >=
                Math.abs(second - num)) ?
                second : third;
    
        // Print the result
        System.out.print(ans);
    }
    
    // Driver Code
    public static void main (String[] args)
    {
        int N = 17;
        
        nearestFibonacci(N);
    }
    }
    
    // This code is contributed by AnkThon
    