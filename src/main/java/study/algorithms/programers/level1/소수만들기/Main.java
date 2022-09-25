package study.algorithms.programers.level1.소수만들기;

public class Main {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int num = nums[i] + nums[j] + nums[k];
                    answer += getPrimenumber1(num) ? 1:0;
                }
            }
        }
        return answer;
    }
    public boolean getPrimenumber1(int num) {

        for(int i = 2; i < num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean getPrimenumber2(int num) {

        if(num == 1 || num == 2 || num == 3){
            return true;
        }else if((num%2 == 1) && (num%3 == 2)){
            return true;
        } else if ((num % 2 == 1) &&(num%3 == 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Main T = new Main();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 7, 6, 4};
        System.out.println(T.solution(nums1));
        System.out.println(T.solution(nums2));
        for(int i=0; i<1000; i++){
            System.out.println(i+" = " + T.getPrimenumber1(i));

        }

    }
}
