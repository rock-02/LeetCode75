import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class diffPfTwoArr {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>hs1=new HashSet<>();
        List<List<Integer>>ans=new ArrayList<>();

        
        for(int i=0;i<nums2.length;i++){
            hs1.add(nums2[i]);
        }
        List<Integer>temp=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(! hs1.contains(nums1[i])){
                
                temp.add(nums1[i]);
            }
        }

        ans.add(temp);
        temp=new ArrayList<>();
        hs1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(! hs1.contains(nums2[i])){
                if(temp.indexOf(nums2[i])==-1)
                   temp.add(nums2[i]);
            }
        }
        ans.add(temp);



        return ans;

    }
}
