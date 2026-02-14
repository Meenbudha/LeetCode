/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

 #include <stdio.h>
 #include <stdlib.h>

int* twoSum(int *nums, int numsSize, int target, int *returnSize) 
{
    int *temp = malloc(2 *sizeof(int));
    temp[0] = 0;
    temp[1] = 1;
    for(int i = 0;i < numsSize ;i++)
    {
        for(int j = i + 1; j < numsSize; j++)
        {
            if(nums[i] + nums[j] == target)
            {
                *returnSize = 2;
                temp[0] = i;
                temp[1] = j;
                return temp;

            }
        }
    }
    *returnSize = 0;
    return 0;

    free(temp);
}

int main() {
    int nums[] = {2, 7, 11, 15};
    int numsSize = sizeof(nums) / sizeof(nums[0]);
    int target = 19;
    int returnSize;
    int* result = twoSum(nums, numsSize, target, &returnSize);

    if (returnSize == 2) {
        printf("Indices of two elements that add up to %d: [%d, %d]\n", target, result[0], result[1]);
    } else {
        printf("No two elements add up to %d\n", target);
    }

    free(result);

    return 0;
}