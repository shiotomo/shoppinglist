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

document.getElementById('create-url').addEventListener('click', () => {
  document.getElementById('url-modal').classList.add('is-active');
});

document.getElementById('close-create-url').addEventListener('click', () => {
  document.getElementById('url-modal').classList.remove('is-active');
});

candidacyIdList.forEach(candidacy => {
  document.getElementById(`delete-candidacy-${candidacy}`).addEventListener('click', () => {
    document.getElementById('delete-candidacy-modal').classList.add('is-active');
  });

  document.getElementById(`close-delete-candidacy-${candidacy}`).addEventListener('click', () => {
    document.getElementById('delete-candidacy-modal').classList.remove('is-active');
  });
});
