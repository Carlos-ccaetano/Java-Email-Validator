# Validador de E-mails JavaFX

Este projeto demonstra a validação de endereços de e-mail utilizando expressões regulares em Java, com uma interface gráfica simples desenvolvida em JavaFX.

## Funcionalidades

- Valida o formato de endereços de e-mail.
- Interface gráfica intuitiva para entrada e visualização do resultado.

## Tecnologias Utilizadas

- Java 11+
- Maven (Gerenciador de Dependências)
- JavaFX (Interface Gráfica)

## Como Compilar e Executar

Para compilar e executar este projeto, você precisará ter o Java Development Kit (JDK) 11 ou superior e o Apache Maven instalados em sua máquina.

### 1. Clonar o Repositório (Exemplo)

```bash
git clone https://github.com/SEU_USUARIO/email-validator-project.git
cd email-validator-project
```

### 2. Compilar o Projeto

Navegue até o diretório raiz do projeto (`email-validator-project`) e execute o seguinte comando Maven para compilar o projeto e baixar as dependências:

```bash
mvn clean install
```

### 3. Executar a Aplicação

Após a compilação bem-sucedida, você pode executar a aplicação JavaFX usando o plugin Maven:

```bash
mvn javafx:run
```

## Estrutura do Projeto

```
email-validator-project/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── portfolio/
│   │   │           ├── App.java
│   │   │           ├── PrimaryController.java
│   │   │           └── emailvalidator/
│   │   │               ├── EmailValidator.java
│   │   │               └── EmailValidatorController.java
│   │   └── resources/
│   │       ├── primary.fxml
│   │       └── emailvalidator.fxml
└── README.md
```


