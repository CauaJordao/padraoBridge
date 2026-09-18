# Bridge — Sistema de Notificações de Biblioteca

Projeto acadêmico em Java que demonstra o padrão de projeto **Bridge (Ponte)** aplicado a um sistema de notificações de uma biblioteca.

## 📚 Tema

O sistema representa uma biblioteca que precisa enviar diferentes tipos de notificações aos usuários:

- **Empréstimo**
- **Devolução**
- **Reserva**

As notificações podem ser enviadas por diferentes canais:

- **E-mail**
- **SMS**
- **Push**

O objetivo é permitir que o tipo de notificação e o canal de envio sejam combinados de forma independente.

## 🎯 Objetivo

Demonstrar na prática como o padrão **Bridge** separa uma abstração de sua implementação, permitindo que ambas evoluam independentemente.

## 🌉 Como o Bridge é aplicado

A classe abstrata `Notificacao` representa a **abstração**.

O `CanalEnvio` representa o **implementador**, responsável pelo mecanismo de envio.

As classes `Emprestimo`, `Devolucao` e `Reserva` especializam a abstração, enquanto `CanalEmail`, `CanalSMS` e `CanalPush` implementam os diferentes canais.

Isso permite combinações como:

```text
Emprestimo + E-mail
Emprestimo + SMS
Emprestimo + Push

Devolucao + E-mail
Devolucao + SMS
Devolucao + Push

Reserva + E-mail
Reserva + SMS
Reserva + Push
```

Sem o Bridge, seria necessário criar uma classe para cada combinação, aumentando a quantidade de classes e o acoplamento.

## 🏗️ Estrutura

```text
src/
├── main/
│   └── java/
│       └── bridge/
│           ├── Notificacao.java
│           ├── Emprestimo.java
│           ├── Devolucao.java
│           ├── Reserva.java
│           ├── CanalEnvio.java
│           ├── CanalEmail.java
│           ├── CanalSMS.java
│           └── CanalPush.java
│
└── test/
    └── java/
        └── bridge/
            ├── EmprestimoTest.java
            ├── DevolucaoTest.java
            └── ReservaTest.java
```

## 📊 Diagrama UML

O projeto possui dois arquivos de diagrama na pasta `docs`:

- `diagrama-sistema.mmd` — versão em Mermaid;
- `diagrama-sistema.txt` — versão textual para consulta rápida.

O relacionamento central é:

```text
Notificacao ─────── CanalEnvio
      │                  │
      │                  ├── CanalEmail
      ├── Emprestimo     ├── CanalSMS
      ├── Devolucao      └── CanalPush
      └── Reserva
```

A referência entre `Notificacao` e `CanalEnvio` representa a ponte entre a abstração e sua implementação.

## 🧪 Testes

Os testes automatizados verificam:

- conteúdo de cada tipo de notificação;
- envio de empréstimo por E-mail;
- envio de devolução por SMS;
- envio de reserva por Push.

Para executar pelo Maven:

```bash
mvn test
```

## ▶️ Como executar no IntelliJ IDEA

1. Abra o IntelliJ IDEA.
2. Selecione **File → Open**.
3. Escolha a pasta do projeto.
4. Aguarde o Maven carregar o `pom.xml`.
5. Execute os testes pela pasta `src/test`.
6. As classes também podem ser utilizadas diretamente em outras aplicações.

## 🛠️ Tecnologias

- Java 11
- Maven
- JUnit 5
- IntelliJ IDEA
- Git
- GitHub
- Mermaid

## 📌 Padrão utilizado

**Bridge (Ponte)**

O padrão permite separar uma abstração de sua implementação, evitando uma hierarquia de classes excessivamente rígida.

### Elementos do padrão neste projeto

| Elemento | Implementação |
|---|---|
| Abstração | `Notificacao` |
| Abstrações refinadas | `Emprestimo`, `Devolucao`, `Reserva` |
| Implementador | `CanalEnvio` |
| Implementadores concretos | `CanalEmail`, `CanalSMS`, `CanalPush` |

## 👨‍💻 Projeto acadêmico

**Universidade de Vassouras**

**Nome:** Cauã Pereira Jordão  
**Matrícula:** 202410052

**Tema:** Padrão Bridge aplicado a um Sistema de Notificações de Biblioteca
