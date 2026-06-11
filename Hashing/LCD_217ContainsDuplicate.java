package Hashing;

import java.util.HashSet;

public class LCD_217ContainsDuplicate {
  public boolean containsDuplicate(int[] nums){
    HashSet<Integer>set=new HashSet<>();
    for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
}
}
