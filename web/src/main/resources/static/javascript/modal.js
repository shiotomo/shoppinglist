document.getElementById('create-action').addEventListener('click', () => {
  document.getElementById('create-modal').classList.add('is-active');
});

document.getElementById('close-create-action').addEventListener('click', () => {
  document.getElementById('create-modal').classList.remove('is-active');
});

document.getElementById('delete-action').addEventListener('click', () => {
  document.getElementById('delete-modal').classList.add('is-active');
});

document.getElementById('close-delete-action').addEventListener('click', () => {
  document.getElementById('delete-modal').classList.remove('is-active');
});
