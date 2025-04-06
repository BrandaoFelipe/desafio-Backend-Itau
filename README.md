# 🚀 TransacaoAPI

Estou criando o desafio de backEnd do Itau(https://github.com/feltex/desafio-itau-backend?tab=readme-ov-file) 
até o momento temos uma API simples para processar transações em memória, garantindo validação de dados e um ID autoincremental.

## 📝 Descrição

Esta API permite processar transações, garantindo que:
- **A data da transação não seja no futuro**
- **O valor da transação seja igual ou maior que zero**
- **As transações sejam armazenadas temporariamente em memória (`HashMap`)**

## ⚙️ Tecnologias utilizadas

- **Java 17+**
- **Spring Boot**
- **Collections (`HashMap`) para armazenamento em memória**
- **AtomicLong para geração de ID autoincremental**

## 🛠️ Como executar o projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/transacao-api.git
2. Acesse o diretório:
   ```sh
   cd transacao-api
3. Execute o projeto com Maven:
  ```sh
   mvn spring-boot:run
```
# 🔄 Endpoints da API
Criar uma transação
  ```sh
  POST /transacao
```

Exemplo de corpo da requisição (JSON)
```sh
{
  "dataHora": "2025-04-06T19:21:00Z",
  "valor": 150.75
}
```
# Retorno esperado:
✅ Caso a transação seja válida:
  ```sh
{
  "mensagem": "Transação processada com sucesso"
}
```
❌ Caso a transação seja inválida:
  ```sh
  {
  "erro": "A transação NÃO DEVE acontecer no futuro"
  }
```
# 📌 Melhorias futuras
Limpar Transações: DELETE /transacao

Calcular Estatísticas: GET /estatistica

Implementar testes automatizados com JUnit e Mockito

Melhorar tratamento de erros e mensagens de respostas

Testes automatizados: Sejam unitários e/ou funcionais, testes automatizados são importantes e ajudam a evitar problemas no futuro. Se você fizer testes automatizados, atente-se na efetividade dos seus testes! Por exemplo, testar apenas os "caminhos felizes" não é muito efetivo.

Containerização: Você consegue criar meios para disponibilizar sua aplicação como um container? OBS: Não é necessário publicar o container da sua aplicação!

Logs: Sua aplicação informa o que está acontecendo enquanto ela trabalha? Isso é útil para ajudar as pessoas desenvolvedoras a solucionar eventuais problemas que possam ocorrer.

Observabilidade: Sua API tem algum endpoint para verificação da saúde da aplicação (healthcheck)?

Performance: Você consegue estimar quanto tempo sua aplicação gasta para calcular as estatísticas?

Tratamento de Erros: O Spring Boot dá às pessoas desenvolvedoras ferramentas para se melhorar o tratamento de erros padrão. Você consegue alterar os erros padrão para retornar quais erros ocorreram?

Documentação da API: Você consegue documentar sua API? Existem ferramentas e padrões que podem te ajudar com isso!

Documentação do Sistema: Sua aplicação provavelmente precisa ser construída antes de ser executada. Você consegue documentar como outra pessoa que pegou sua aplicação pela primeira vez pode construir e executar sua aplicação?

Configurações: Você consegue deixar sua aplicação configurável em relação a quantidade de segundos para calcular as estatísticas? Por exemplo: o padrão é 60 segundos, mas e se o usuário quiser 120 segundos?

# 👨‍💻 Autor
Desenvolvido por Felipe Brandao 🚀

