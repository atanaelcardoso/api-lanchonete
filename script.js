const formulario = document.querySelector("form");
const Inome = document.getElementById('nome')
const Icategoria = document.getElementById('categoria');
const Ipreco = document.getElementById('preco');
const Iestoque = document.getElementById('estoque');

function cadastrar() {

    fetch('http://localhost:3000/produtos', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ Inome, Icategoria, Ipreco, Iestoque })
  });

  carregarProdutos();
};

function limparCampos() {
  document.getElementById('nome').value = '';
  document.getElementById('categoria').value = '';
  document.getElementById('preco').value = '';
  document.getElementById('estoque').value = '';
}

formulario.addEventListener('submit', function(event) {
    event.preventDefault();
    
    const dados = {
        nome: Inome.value,
        categoria: Icategoria.value,
        preco: Ipreco,
        estoque: Iestoque
    };
    console.log(dados)
    limparCampos();
});
