class Solution {
    public static int myAtoi(String s) {
        s = s.trim();
        String [] sArr = s.split(" ");
        int i =0;
        int output = 0;
        //for(i =0;i<sArr.length;i++){

            if((sArr[0].charAt(0)<=57 && sArr[i].charAt(0)>=48) ||(sArr[0].charAt(1)<=57 && sArr[i].charAt(1)>=48)){
                output = Integer.parseInt(sArr[i]);
                System.out.println(output);
                return output;
            }
        //}
        return output;
    }

    public static void main(String[] args){
        String s = "words and 987";
        myAtoi(s);
    }

}