package okta.saml.configuration;

public class TargetElemUsingLinearSearch {
    public static void main(String[] args) {
        int[] array = {13, 4, 5, 6, 9, 10};
        int target = 9;
        System.out.println(linearSearch(array, target));

    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
