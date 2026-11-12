class Solution(object):
    def getConcatenation(self, nums: list[int]) -> list[int]:
        n = len(nums)
        # Create an array of size 2n filled with zeros
        ans = [0] * (2 * n)
        
        # Fill both halves in a single pass
        for i in range(n):
            ans[i] = nums[i]
            ans[i + n] = nums[i]
            
        return ans


#test to check the function
if __name__ == "__main__":
    # 1. Create an object (instance) of the Solution class
    sol = Solution()
    
    # 2. Define your test input
    test_nums = [1, 2, 1]
    
    # 3. Call the method and print the returned result
    result = sol.getConcatenation(test_nums)
    print(result)