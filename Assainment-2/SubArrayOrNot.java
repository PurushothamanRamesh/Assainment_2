public class SubArrayOrNot {
    static boolean isSubArray(int arr1[], int arr2[], int len1, int len2) {
        int i=0;
        int j=0;
        while (i < len1 && j < len2)
        {
            if (arr1[i] == arr2[j])
            {
                i++;
                j++;
                if (j == len2)
                    return true;
            }
            else
            {
                i =+1;
                j = 0;
            }
        }
        return false;
    }
    public static void main(String arr[])
    {
        int arr1[] = { 2, 3, 0, 5, 1, 1, 2,3,0,3,1};
        int arr1length = arr1.length;
        int arr2[] = { 3, 0, 3, 1 };
        int arr2length = arr2.length;
        if (isSubArray(arr1, arr2, arr1length, arr2length))
            System.out.println("YES ! it is a SubArray");
        else
            System.out.println("NO It's not a subArray");
    }
}