let header = document.createElement('h2');
header.innerHTML = 'Full DBZ Character List: ';
parentDiv.append(header);

let container = document.createElement('div');

dbzCharacter.forEach((element) => {
  let placeholder = document.createElement('span');
  placeholder.innerHTML = `${element} + \t`;
  container.append(placeholder);
});
