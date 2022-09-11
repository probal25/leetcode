package easy.shuffle_string;

public class Solution {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        char[] sArray = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] =  sArray[i];
        }
        return String.valueOf(result);
    }
}
