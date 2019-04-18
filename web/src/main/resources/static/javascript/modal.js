document.getElementById('show_action').addEventListener('click', () => {
  document.getElementById('modal').classList.add('is-active');
});

document.getElementById('close_action').addEventListener('click', () => {
  document.getElementById('modal').classList.remove('is-active');
});
