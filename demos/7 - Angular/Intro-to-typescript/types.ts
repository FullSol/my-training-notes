var count = 'bananas';

var apples: string = 'granny smith';

var list: any[] = ['sleep', 'eat', 'repeat'];

// Any type allows us to have flexibility of typing with any given variable, class, or interface.
if (list.length <= 3) {
  list[0] = 5;
}

console.log(list);
