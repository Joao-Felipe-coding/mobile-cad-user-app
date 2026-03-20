# Projeto Cadastro de Usuário

Este é um projeto Android desenvolvido para fins de aprendizado, focado na criação de telas, manipulação de componentes de entrada de texto e listagem de dados.

## Telas do Aplicativo

### 1. Tela Principal (MainActivity)
A porta de entrada do app. Sua função é exibir a lista de usuários que foram cadastrados.
- **Componentes principais:** `RecyclerView` para a listagem e um `Button` para navegar até a tela de cadastro.

### 2. Tela de Cadastro (CreateUser)
Onde o usuário insere suas informações.
- **Componentes principais:** `TextInputEditText` para Nome e E-mail, e um `Button` para salvar as informações.

## Classes e Suas Funções

### `MainActivity.java`
Classe que gerencia o ciclo de vida da tela principal. Ela será responsável por inicializar a lista de usuários e configurar o adaptador do RecyclerView.

### `CreateUser.java`
Classe responsável por capturar as informações digitadas no formulário. Ela contém a lógica para salvar os dados e fechar a tela após o cadastro bem-sucedido.

### `UserAdapter.java`
Classe essencial para o funcionamento do `RecyclerView`. Ela define como os dados dos usuários serão vinculados aos elementos visuais da lista.

