const formulario = document.querySelector("form");
const Inome = document.getElementById('nome');
const Icategoria = document.getElementById('categoria');
const Ipreco = document.getElementById('preco');
const Iestoque = document.getElementById('estoque');

function cadastrar() {
  const dados = {
    nome: Inome.value,
    categoria: Icategoria.value,
    preco: Ipreco.value,
    estoque: Iestoque.value
  };

  fetch('http://localhost:8080/usuarios', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(dados)
  })
  .then(response => response.json())
  .then(data => {
    console.log('Usuário cadastrado:', data);
    //carregarProdutos();
    limparCampos();
  })
  .catch(error => {
    console.error('Erro ao cadastrar:', error);
  });
}


function limparCampos() {
  Inome.value = '';
  Icategoria.value = '';
  Ipreco.value = '';
  Iestoque.value = '';
}

formulario.addEventListener('submit', function(event) {
  event.preventDefault();

  const dados = {
    nome: Inome.value,
    categoria: Icategoria.value,
    preco: Ipreco.value,
    estoque: Iestoque.value
  };

  console.log(dados);
  cadastrar(dados);
});
