<div align="center">
  <img src="https://cdn-icons-png.flaticon.com/512/2875/2875878.png" width="120px" alt="Logo Estoque" />
  
  <h1 style="font-size: 32px; margin: 10px 0;">Java-Inventory-CLI (Java + JDBC)</h1>
  <p>Um sistema de gerenciamento de estoque via terminal e focado em Orientação a Objetos.</p>

  <p align="center">
    <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
    <img alt="JDBC" src="https://img.shields.io/badge/JDBC-007396?style=for-the-badge&logo=java&logoColor=white" />
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />
  </p>
</div>

<br/>

## 📖 Sobre o Projeto

Este projeto foi desenvolvido do zero com o objetivo de aplicar na prática conceitos fundamentais de **Programação Orientada a Objetos (POO)** e integração com Banco de Dados Relacional. A aplicação simula o *back-end* e a interação de linha de comando de um sistema corporativo de estoque.

### 🎯 O que eu aprendi
- **Encapsulamento e Modelagem:** Criação de classes e objetos com separação clara de responsabilidades.
- **Padrão DAO (Data Access Object):** Isolamento de toda a lógica de persistência de dados.
- **Tratamento de Recursos:** Uso de `try-with-resources` para evitar vazamento de memória nas conexões.

---

## ✨ Funcionalidades

O sistema implementa as operações base de um CRUD de forma interativa via console:

- [x] **Cadastrar produto:** Inserção dinâmica (Nome, Preço e Quantidade).
- [x] **Listar estoque:** Consulta ao banco e exibição formatada de todos os produtos salvos.
- [ ] Atualizar quantidade e preços *(Em desenvolvimento)*
- [ ] Excluir produto *(Em desenvolvimento)*

---



## 📁 Arquitetura do Projeto

Para garantir um código limpo e de fácil manutenção, o projeto foi dividido nos seguintes pacotes:

<details>
<summary><b>Clique para ver a estrutura de pastas</b></summary>

- 📦 `model`
  - 📄 `Produto.java`: Representação da entidade e encapsulamento dos dados.
- 📦 `dao`
  - 📄 `ProdutoDAO.java`: Classe operária responsável pelos comandos SQL (`INSERT`, `SELECT`).
- 📦 `connection`
  - 📄 `ConnectionFactory.java`: Responsável por gerenciar a comunicação com o banco(arquivo deve ser feito pelo usuário!).
- 📦 `org.example`
  - 📄 `Main.java`: Ponto de entrada com o menu interativo (CLI).

</details>

---

## 🛠️ Como executar na sua máquina

1. Clone este repositório:
   ```bash
   git clone [https://github.com/Mankeya/Java-Inventory-CLI.git](https://github.com/Mankeya/Java-Inventory-CLI.git)
