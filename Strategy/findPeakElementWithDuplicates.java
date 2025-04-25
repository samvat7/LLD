import java.util.ArrayList;

public class findPeakElementWithDuplicates{

    public static void main(String[] args){

        
        Integer[] nums = {1, 3, 7, 6, 6, 6, 6, 4, 3, 2,1};

        Integer n = nums.length;

        Integer[] m = new Integer[100];

        for (int i = 0; i < 100; i++) {
            m[i] = 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for(Integer i=0;i<n;i++){

            if(m[nums[i]] == 0){

                arr.add(nums[i]);
                m[nums[i]] = 1;
            }
        }

        n = arr.size();

        Integer lo=0,hi=n-1;


        while(lo<=hi){

            Integer mid = lo + (hi-lo)/2;

            if(mid == 0){

                if(n == 1){

                    System.out.println(arr.get(mid));
                    break;
                }
                else if(arr.get(mid)>arr.get(mid+1)){

                    System.out.println(arr.get(mid));
                }
            }

            if(mid == n-1){

                if(arr.get(mid)>arr.get(mid-1)){

                    System.out.println(arr.get(mid));
                    break;
                }
            }

            if(arr.get(mid) > arr.get(mid-1) && arr.get(mid)>arr.get(mid+1)){

                System.out.println(arr.get(mid));
                break;
            }
            else if(arr.get(mid)<arr.get(mid-1)){ // down slope

                hi = mid-1;
            }
            else lo = mid+1;
        }

        return;
    }
}