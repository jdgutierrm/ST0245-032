public class Punto2_2 {
    public int maxSpan(int[] nums) {
      int max=0;
      int retador=0;
      for(int i=0;i<nums.length;i++){                             
      int j=nums.length-1;
      while(nums[j]!=nums[i]){                                   
      j--;
    }
     retador=j-i+1;
     if(retador>max)max=retador;
  }
  return max;
}

    public int[] fix34(int[] nums) {
      int temp=0;
      boolean three=false;
      for(int i=0;i<nums.length-1;i++){                         
      if(nums[i]==3)
        three=true;
      if(three==true){
        three=false;
      if(nums[i+1]!=4){
      for(int j=1;j<nums.length;j++){                         
        if(nums[j]==4&&nums[j-1]!=3){
            temp=nums[i+1];
          nums[i+1]=nums[j];
          nums[j]=temp;
        }
      }
      }  
      }
    }

    return nums;
}

   public int[] fix45(int[] nums) {
      for(int i=0;i<nums.length;i++){                         
      if(nums[i]==4){
      for(int j=0;j<nums.length;j++){                    
        if(nums[j]==5){
          if(j>0&&nums[j-1]!=4){
            int t=nums[i+1];
            nums[i+1]=5;
            nums[j]=t;
          }
          else if(j==0){
            int t=nums[i+1];
            nums[i+1]=5;
            nums[j]=t;
          }
        }
      }
    }
  }
  return nums;
}

    public boolean linearIn(int[] outer, int[] inner) {
      int var=0;
      for(int j=0;j<inner.length;j++){                                             
      for(int i=0;i<outer.length;i++){                                          
      if(inner[j]==outer[i]){
          var++;
          break;
      }
    }
  }
    if(var==inner.length) return true;
  return false;
}

   public int[] seriesUp(int n) {
     int[]arr=new int[n*(n+1)/2];
     int l=0;
     for(int i=1;i<=n;i++){                                        
     for(int j=1;j<=i;j++,l++){                            
      arr[l]=j;
  }

}
 return arr;
}


