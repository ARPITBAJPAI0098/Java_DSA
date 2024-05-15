public class decimaltobinary {
    
    public static String decbin(int nums) {
       
        StringBuilder result = new StringBuilder();
        while (nums > 0) {
            result.insert(0, nums % 2);
            nums /= 2;
        }
        return result.toString();
    
    }
// below code for checking to binary number string which one is greater,smaller
    public boolean queryString(String s, int n) {
        for (int i = 1; i <= n; i++) {
                String binaryRepresentation = decbin(i);
                if (!s.contains(binaryRepresentation)) {
                    return false;
                }
        }
        return true;
    }
        
}
    
