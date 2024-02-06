import java.util.ArrayList;
import java.util.List;

public class KidsWithCandie {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>ans=new ArrayList<>();
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) 
            min=candies[i]>min?candies[i]:min;
        
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies > min) ans.add(true);
            else ans.add(false);
        }    
        return ans;
    }
}