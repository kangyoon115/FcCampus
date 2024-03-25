package fc.java.course2.part1;

public class IntArrayBasic {
    public static void main(String[] args) {
        // 정수 5개를 배열에 저장하고 출력하세요.
        int[] nums=new int[5]; //배열생성동작,고정길이 -> 가변길이
        nums[0]=1;//저장동작(입력,추가)
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        for(int i=0;i< nums.length;i++){ //길이를 구하는 동작
            int data=nums[i]; //데이터를 얻는동작(가져오는동작)
            System.out.println(data);
        }
        //향상된 for문(foreach)
        for(int data: nums){
            System.out.println(data);
        }


    }
}
