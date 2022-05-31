interface Person {
  name: string;
  title: string;
  salary: number;
  toDos: any[];
}

const user: Person = {
  name: 'John',
  title: 'CEO',
  salary: 100000,
  toDos: ['sleep', 'eat', 'repeat'],
};

console.log(user);
