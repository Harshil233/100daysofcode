class Solution {
   public int strStr(String haystack, String needle) 
    {
        int l1 = haystack.length(),  l2 = needle.length();
        String newString = needle + "#" + haystack;
        int n = newString.length();
        int z[] = new int[n];
        int i = 0;
        while(i < n)
        {
            if(i <= l2)
                z[i] = 0;
            else
            {
                int left = 0, right = 0;
                if(newString.charAt(left) == newString.charAt(i))
                {
                    right = i;
                    while(right < n && newString.charAt(left) == newString.charAt(right))
                    {
                        left ++; right ++;
                    }
                }
                z[i] = left;
            }
            i++;
        }
        for(int id = 0; id < n; id++)
        {
            if(z[id] == l2)
                return id - l2 - 1;
        }
        return -1;
    }
}
