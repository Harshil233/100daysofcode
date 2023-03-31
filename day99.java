class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1= nums1.length;
        int len2= nums2.length;
        int ans[] = new int[len1];

        for(int i=0; i<len1; i++)
        {
            int temp = nums1[i];
            for(int j=0; j<len2; j++)
            {
                if(temp==nums2[j])
                {
                    if(j+1==len2)
                    {
                        ans[i]=-1;
                        break;
                    }
                    else
                    {
                        int flag=0;
                        for(int k = j+1; k < len2; k++)
                        {
                            if(nums2[k] > nums2[j])
                            {
                                ans[i] = nums2[k];
                                flag = 1;
                                break;
                            }
                        }
                        if(flag==0)
                        {
                            ans[i]= -1;
                        }
                    }
                }
            }
            
        }
        return ans;
    }
}
