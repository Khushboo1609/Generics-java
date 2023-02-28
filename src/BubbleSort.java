class BubbleSort <T extends Comparable<T>>{
    void BubbleSorting( T [] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1-i; j++) {
                if (a[j].compareTo(a[j + 1])>0) {
                    T temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
class Bubble{
    public static void main(String[] args) {

        //Integer[] a=new Integer[]{1,5,63,7};
        String[]s = new String[]{"a","b","ac","adff"};
        BubbleSort bs=new BubbleSort();
        bs.BubbleSorting(s);
        for(int i =0;i<s.length;i++){
            System.out.println(s[i]);
        }


    }
}
