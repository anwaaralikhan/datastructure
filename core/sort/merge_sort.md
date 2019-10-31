
### Time Complexity:
The list of size  is divided into a max of **Log N** parts, and the merging of all sublists into a single list takes **O(N)** time, the worst case run time of this algorithm is **O (N log N)**

As merge sort is a recursive algorithm, the time complexity can be expressed as the following recursive relation:

```
T(n) = 2T(n/2) + O(n)
```
`T(n/2)` corresponds to the time required to sort the sub-arrays and `O(n)` time to merge the entire array.
When solved, the time complexity will come to `O(nLogn)`.

This is true for the worst, average and best case since it will always divide the array into two and then merge.
The space complexity of the algorithm is `O(n)` as we're creating temporary arrays in every recursive call.
