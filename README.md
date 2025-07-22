# MAVI Veiculos

O programa é um sistema de cadastro desenvolvido para permitir que o usuário gerencie e controle as informações de seus veículos de forma prática e organizada.
Através da interface do sistema, o usuário pode registrar múltiplos carros, armazenando dados importantes como modelo, marca, ano de fabricação, placa, entre outros.

(<img width="769" height="539" alt="image" src="https://github.com/user-attachments/assets/dbf61921-2636-4259-a25e-e8b8e21db401" />)

---

## 📌 Índice

- [Funcionalidades](#🚀-funcionalidades)
- [Tecnologias Utilizadas](#🛠️-tecnologias-utilizadas)
- [Como Executar o Projeto](#⚙️-como-executar-o-projeto)
- [Estrutura do Projeto](#📂-estrutura-do-projeto)
- [Contribuindo para o Projeto](#🤝-contribuindo-para-o-projeto)
- [Autores](#👨‍💻-autores)
- [Licença](#📄-licença)

---

## 🚀 Funcionalidades

Liste as principais funcionalidades do seu projeto.

- [x] Funcionalidade 1 - Entrar com o usuario usando a senha correta.
- [x] Funcionalidade 2 - Deletar um carro cadastrado.
- [x] Funcionalidade 3 - Alterar um carro cadastrado.
- [x] Funcionalidade 4 - Cadastrar quantos carros quiser.

---

## 🛠️ Tecnologias Utilizadas

Liste as tecnologias, linguagens e ferramentas usadas.

- Java 17
- Swing (GUI)
- MySQL
- NetBeans IDE 23
- Git e GitHub

---

## ⚙️ Como Executar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

### 📋 Pré-requisitos

- Java JDK 23 instalado (ou versão requerida)
- NetBeans IDE ou outra IDE Java compatível
- MySQL Server (se houver uso de banco de dados)

### ▶️ Rodando o projeto

1. Clone este repositório:

```bash
git clone https://github.com/JuliaMenegaz/JuliaM/tree/main/ProjetoIntegrador-Carros
```

2. Abra o projeto no NetBeans.

3. Configure a conexão com o banco de dados (se necessário).

4. Execute a aplicação através da classe principal (Main.java ou classe equivalente).

📂 Estrutura do Projeto:

Explique brevemente a organização dos diretórios e arquivos principais:

```
📦nome-do-projeto
 ┗ 📂src
   ┣ 📂dao
   ┣ BD.java
   ┣ DAO.java
   ┣ 📂model
   ┣ Carro.java
   ┣ Modelo.java
   ┣ Usuario.java
   ┣ 📂view
   ┣ JCarros.java
   ┣ JInicio.java
   ┣ JTabelaDeCarros.java
   ┣ 📂controller
   ┣ Conexao.java
   ┗ Criptografia.java
 
```

## 🤝 Contribuindo para o Projeto
Siga os passos abaixo para contribuir:

1. Faça um Fork do projeto.

2. Crie uma nova branch com a funcionalidade ou correção `(git checkout -b feature/nova-funcionalidade).`

3. Realize as alterações necessárias e faça o commit `(git commit -m 'feat: implementa nova funcionalidade').`

4. Faça o push para sua branch `(git push origin feature/nova-funcionalidade).`

5. Abra um Pull Request neste repositório.

Padrões de commit sugeridos:

`feat`: Implementação de novas funcionalidades

`fix`: Correção de bugs

`docs`: Atualização da documentação

`refactor`: Refatoração do código sem alterar funcionalidades

`chore`: Mudanças internas sem alterar funcionalidades (configs, scripts, etc)

Exemplo de commit:
```bash
git commit -m "feat: adiciona formulário de cadastro"
```

## 👨‍💻 Autores
Júlia Menegaz Bueno

## 📄 Licença
Este projeto está sob licença MIT - veja o arquivo LICENSE para detalhes.



---



## 📚 Arquivo de licença (LICENSE)

Crie um arquivo separado chamado `LICENSE` com o conteúdo padrão da licença MIT:

MIT License

Copyright (c) [ano] [seu nome]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


---

## 📝 Arquivo `.gitignore`

Para garantir que arquivos desnecessários não sejam enviados para o GitHub, crie também um arquivo `.gitignore` com conteúdo semelhante:

/build/
/dist/
/nbproject/private/
/.idea/
/.vscode/
*.class
*.jar
*.log
*.tmp
