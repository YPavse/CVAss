// B. Perform sorting of an array in descending order.

var arr = [5, 2, 9, 1, 5, 6, 3];

arr.sort(function(a, b) {
    return b - a;
});

console.log(arr);