class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int[] rowMins = new int[matrix.length];
        List<Integer> res = new ArrayList<>();
        
        // Step 1: Find the minimum in each row
        for (int i = 0; i < matrix.length; i++) {
            rowMins[i] = Arrays.stream(matrix[i]).min().getAsInt();
        }

        
        // Step 2: Check if any row minimum is also a column maximum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == rowMins[i]) { // If the element is the row minimum
                    boolean isColMax = true;
                    // Check if it's the maximum in its column
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] > matrix[i][j]) {
                            isColMax = false;
                            break;
                        }
                    }
                    if (isColMax) {
                        res.add(matrix[i][j]);
                    }
                }
            }
        }

        return res;
    }
}