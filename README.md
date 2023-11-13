![Banner](https://i.postimg.cc/hjYfK9KH/banner-vnw-atividade1.png)

Atividade de fixação proposta pelo [Vai na Web](https://www.linkedin.com/company/vainaweb/): um programa simples em Java que permite ao usuário escolher 7 
números de 0 a 100 e, em seguida, sorteia 7 números vencedores para comparar com os números escolhidos pelo 
usuário. Com base nos acertos, o programa determina o prêmio do usuário.

## ⚙️ Funcionalidades

- **Escolha de Números** 🎱
  - [x] O usuário pode escolher 7 números inteiros entre 0 e 100.
  - [x] O programa garante que apenas números válidos sejam aceitos.
  - [x] Caso o usuário insira dados inválidos, o programa não para, mas continua a solicitar entradas válidas.
  </br>
- **Sorteio de Números Vencedores** 🎉
  - [x] O programa utiliza a classe Random do Java para sortear 7 números vencedores de forma aleatória.
  </br>
- **Verificação de Acertos** ✅
  - [x] Após o sorteio dos números vencedores, o programa compara os números escolhidos pelo usuário com os números sorteados.
  - [x] Ele conta quantos números foram acertados.
  </br>
- **Cálculo do Prêmio** 💰
  - [x] Com base no número de acertos, o programa calcula o prêmio do usuário.

    | N° de Acertos | Valor do Prêmio |
    | ------------- | --------------- |
    | 0-4           | R$0             |
    | 5             | R$10 mil        |
    | 6             | R$50 mil        |
    | 7             | R$200 mil       |

</br>

## 🛣️ Como Rodar o Projeto

Siga as instruções para rodar o projeto no seu ambiente de desenvolvimento.

### 🚀 Pré-requisitos

- Você vai precisar do [Git](https://git-scm.com/) e Java ([JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)) instalados no seu computador.
- Além disso, é bom ter um editor como o [Eclipse](https://eclipseide.org/) para trabalhar com o código.

### 🎲 Rodando

```bash
# Clone o projeto em uma pasta da sua preferência
$ git clone https://github.com/hamomgs/mega-sena.git
```

Caso esteja usando o Eclipse como editor de código:

1. Abra o Eclipse.
2. Importe o projeto Java para o Eclipse.
   - Clique em File > Import > General > Existing Projects into Workspace.
   - Selecione a pasta do projeto `MegaSena` e clique em Finish.
3. Clique com o botão direito do mouse no projeto e selecione Run as > Java Application.
4. O Eclipse irá compilar e executar o programa. (Vá para o tópico "🕹️ Como Jogar")

As etapas para executar o projeto em outro editor são semelhantes. Em geral, você vai precisar importar o projeto para editor, compilar e em seguida executar o código.

## 🕹️ Como Jogar

1. Digite 7 números de 0 a 100, um de cada vez através do console ou terminal.
2. Veja quantos números você acertou e se você ganhou ou não na Tela Sena. :)

## 🧩 Estrutura do Código

O programa está organizado com os seguintes métodos:

- `sortearNumeros`: Sorteia os números vencedores e retorna um vetor com esses números.
- `obterNumerosEscolhidos`: Permite ao usuário escolher seus números, garantindo que sejam válidos, e retorna um vetor com os números escolhidos.
- `contarAcertos`: Compara os números sorteados com os números escolhidos e conta quantos números foram acertados.
- `calcularPremio`: Determina o prêmio com base no número de acertos.

## 🗂️ Estrutura do Projeto

```markdown
mega-sena
└── MegaSena
    ├── .settings
    ├── src/br/com/vainaweb/backendt1/megasena
    │   └── MegaSena.java
    ├── .classpath
    ├── .gitignore
    └── .project
```

## 🛠️ Tecnologias

- [Java JDK v17.0.9](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

</br>

## 🧑‍🏫 Instrutores

<table>
  <tr>
    <td align="center"><a href="https://www.linkedin.com/in/samuel-silveriom/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/103957897?v=4" width="100px;" alt=""/><br /><sub><b>Samuel Silvério</b></sub></a><br /><a href="https://github.com/Samuel-prata" title="Samuel Silvério">🧑‍🏫</a></td> 
    <td align="center"><a href="https://www.linkedin.com/in/leno-rafael-85a2ab1ba/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/73203800?v=4" width="100px;" alt=""/><br /><sub><b>Leno Rafael</b></sub></a><br /><a href="https://github.com/lenors" title="Leno Rafael">🧑‍🏫</a></td>
</tr>
</table>

## 🧑‍💻 Autor

<table>
  <tr>
    <td align="center"><a href="https://www.linkedin.com/in/hamomgs/"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/88857655?v=4" width="100px;" alt=""/><br /><sub><b>Hamom Silva</b></sub></a><br /><a href="https://github.com/hamomgs" title="Hamom Silva">👨‍💻</a></td>
</tr>
</table>