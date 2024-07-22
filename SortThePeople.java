public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        //String[] output = new String[names.length()];
        for(int i = 0;i<heights.length;i++){
            for(int j = i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    heights=swap(i,j,heights);
                    names = swapPeople(i,j,names);
                }
            }
        }
        System.gc();
        return names;
    }
    public static int[] swap(int i , int j, int[] heights){
            int temp=heights[i];
            heights[i] = heights[j];
            heights[j] = temp;
            return heights;
             
        }
    public static String[] swapPeople(int i, int j,String[] names){
            String temp = names[i];
            names[i] = names[j];
            names[j] = temp;
            return names;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] output = sortPeople(names,heights);
        for(String out:output){
            System.out.print(out + " ");
        }
    }
}
