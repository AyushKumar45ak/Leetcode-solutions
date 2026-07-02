class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList <Integer> list = new ArrayList <> ();
        for(int i=0;i<arr.length;i++){
            if(list.size()<arr.length){
                list.add(arr[i]);
            }
            if(list.size()<arr.length && arr[i]==0){
                list.add(arr[i]);
            }
        }
        for(int k=0;k<arr.length;k++){
            arr[k]=list.get(k);
        }
        System.out.println(Arrays.toString(arr));
    }
}