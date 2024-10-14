public final class NumberUtils
{
    private NumberUtils() {}

    public static int[] sortBubble(int[] array)
    {
        int[]arraySorted = new int[array.length];
        System.arraycopy(array,0,arraySorted,0,array.length);
        for (int i = 1; i < arraySorted.length - 1; i++)
        {
            for (int j = 1; j < arraySorted.length; j++)
            {
                if (arraySorted[j - 1] > arraySorted[j])
                {
                    int temp = arraySorted[j - 1];
                    arraySorted[j - 1] = arraySorted[j];
                    arraySorted[j] = temp;
                }
            }
        }
        return arraySorted;
    }

    public static int[] filter(int[] array, int moreThreshold)
    {
        int[] arrFiltered = new int[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > moreThreshold)
                arrFiltered = pushBack(arrFiltered, array[i]);

        }
        return arrFiltered;
    }

    public static int[] pushBack(int[] array, int newElement)
    {
        int[] arr = new int[array.length + 1];
        System.arraycopy(array,0,arr,0,array.length);
        arr[arr.length -1] = newElement;
        return arr;
    }
}
