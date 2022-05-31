var count = 'bananas';
var apples = 'granny smith';
var list = ['sleep', 'eat', 'repeat'];
// Any type allows us to have flexibility of typing with any given variable, class, or interface.
if (list.length <= 3) {
  list[0] = 5;
}
console.log(list);

/* TS is STATICALLY TYPED, so we can't reassign a variable to a different type once it is initialized */
