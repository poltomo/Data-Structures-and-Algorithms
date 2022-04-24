"""
Find the largest sum of any contiguous subarray.

array: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
contiguous subarray with largest sum: [4, -1, 2, 1], with sum 6
"""

#Empty subarrays admitted
def max_subarray1(numbers):
    best_sum = 0
    current_sum = 0
    for x in numbers:
        current_sum = max(0, current_sum + x)
        best_sum = max(best_sum, current_sum)
    return best_sum

#No empty subarrays admitted
def max_subarray2(numbers):
    """Find the largest sum of any contiguous subarray."""
    if numbers == []:
        raise ValueError('Empty array has no nonempty subarrays')

    best_sum = float('-inf')
    current_sum = 0
    for x in numbers:
        current_sum = max(x, current_sum + x)
        best_sum = max(best_sum, current_sum)
    return best_sum

arr=[-2, 1, -3, 4, -1, 2, 1, -5, 4]

print(max_subarray1(arr))
