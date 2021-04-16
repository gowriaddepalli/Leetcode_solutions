'''
The logic is as follows:

The Brute force is to do O(n^2). Compare each element with the rest of the array elements.

But a better approach is to take a stack and start iterating through the index from the end.

Algo:

1. Iterate the array from the rightmost part of the array (Reason we need to see the future to calculate result for present.) Time-> (o(n))

2. Use a linear data storage system to return the difference/next greater temperature. (Storage-> o(n))

3. Use a stack to storage the temperatures that are greater than the current temp, and the stack stores the nearest greater temp on the top. So, the idea is to:

while iterating the element previously, put the element in the stack, if the next element has temp greater than the top of stack, pop it off, else push it. Once done, calculate the index diff between the top of the index and the current index.


Disclaimer, we are pushing indexes into the stack, so as not to tackle cases of repetitive elements.

'''
class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        return_value = [0] * len(T)
        stack = []
        for i in range(len(T)-1, -1, -1):
            # Handle the case where we remove elements from stack(stack is not empty and the current element is ):
            while stack and T[i]>= T[stack[-1]]:
                stack.pop()
            if stack:  # Handle the case to get the index and stack not empty.
                return_value[i] = stack[-1] - i # Subtract the difference from the top.
            stack.append(i)    # Irrespective in every iteration add the index of the element to the stack.
        return return_value
        
        
