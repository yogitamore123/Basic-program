 class count {
        // Returns number of times x occurs in arr[0..n-1]
        static int countOccurrences(int arr[], int n, int x)
        {
            int res = 0;
            for (int i=0; i<n; i++)
              {  if (x == arr[i])
                 { res++;}
              }
            return res;
        }
        
        public static void main(String args[])
        {
            int arr[] = {22,32,45,22,56,22,78};
            int n = arr.length;
            int x = 22;
            System.out.println(countOccurrences(arr, n, x));
        }
    }
    
    

