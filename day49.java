class Solution 
{
	public List<Integer> grayCode(int n) 
	{

		int edge = 1 << n; // (1 << n) == 2 ** n
		Integer[] ans = new Integer[edge];
		ans[0] = 0;
		int lngth = 1; 
		int i, j = 1;

		while (j != edge)
		{
			lngth = j;

			for(i = lngth - 1; i >= 0; i--)
				ans[j++] = ans[i] | lngth;  
		}

		return Arrays.asList(ans);
	}
}
