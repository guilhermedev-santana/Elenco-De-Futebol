# ⚽ Sistema de Escalação de Time

## 📌 Sobre o projeto

Este projeto foi desenvolvido como uma atividade prática de Programação Orientada a Objetos (POO) em Java. O objetivo é implementar um sistema simples de gerenciamento de um time de futebol, permitindo contratar jogadores, definir suas situações na escalação e visualizar os jogadores escalados.

## 🎯 Objetivos da atividade

- Criar uma enumeração para representar as situações de escalação.
- Implementar classes para representar jogadores e times.
- Cadastrar jogadores em um time.
- Escalar jogadores como titulares ou reservas.
- Controlar a quantidade máxima permitida para cada situação.
- Impedir que jogadores não contratados ou já escalados sejam adicionados novamente.
- Exibir as informações dos jogadores escalados.

## 🛠️ Tecnologias utilizadas

- **Java** — linguagem de programação utilizada no desenvolvimento.
- **IntelliJ IDEA** — ambiente de desenvolvimento integrado (IDE).
- **Programação Orientada a Objetos (POO)** — organização do código por meio de classes e objetos.

## 📂 Estrutura do projeto

O projeto é composto pelas seguintes classes e enumeração:

- **`SituacaoEscalacao`**: enum que define as situações `TITULAR` e `RESERVA`, com suas respectivas quantidades máximas.
- **`Jogador`**: representa um jogador, armazenando nome, número da camisa e situação na escalação.
- **`Time`**: gerencia o nome do time, o técnico, os jogadores contratados e os jogadores escalados.
- **`Principal`**: contém o método `main`, responsável por executar e demonstrar as funcionalidades do sistema.

## ⚙️ Funcionalidades

### Enumeração `SituacaoEscalacao`

Define os tipos de escalação disponíveis:

- `TITULAR`: quantidade máxima de 11 jogadores.
- `RESERVA`: quantidade máxima de 12 jogadores.

### Classe `Jogador`

Responsável por armazenar os dados de cada jogador, incluindo:

- Nome.
- Número da camisa.
- Situação na escalação.

Também possui construtor, métodos getters e setters e o método `toString()` sobrescrito para facilitar a exibição das informações.

### Classe `Time`

Responsável pelo gerenciamento dos jogadores e da escalação do time, oferecendo os seguintes métodos:

- `contratarJogador()`: cadastra um novo jogador.
- `escalarJogador()`: escala um jogador como titular ou reserva, respeitando as regras estabelecidas.
- `removerJogadorEscalacao()`: remove um jogador da escalação.
- `obterEscalacao()`: retorna a lista atual de jogadores escalados.
- Getters e setters para o nome do time e o nome do técnico.

O sistema verifica se o jogador foi contratado, se já está escalado e se existe disponibilidade na