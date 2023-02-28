# Integração - TJSC

### Introdução


<a href="https://www.tjsc.jus.br/"><img align="right" src="https://www.tjsc.jus.br/documents/10181/66389/TJSC-V-Tribunal+de+Justica.png/4f40f8a9-4c23-42a4-95a1-7999cb2d1534?t=1446045086727" width=25%></a>

A aplicação "**integration-tjsc**" é uma **API REST** construída com **Java** e **Spring Boot** que realiza uma integração com o
_Tribunal de Justiça de Santa Catarina_ (**TJSC**). A intenção do projeto é poder permitir aos usuários uma maneira alternativa ao serviço **SOAP**, tornando mais fácil a consulta de dados específicos do **WSDL** do tribunal.

>O _Manual da Interoperabilidade para Transmissão de Atos Extrajudiciais e Fornecimento de Selos Digiais_ foi uma fonte de conhecimento essencial para o desenvolvimento dessa aplicação.

O projeto é totalmente voltado para fins de teste, portanto, não se conecta à nenhum serviço do âmbito extrajudicial em seu ambiente de **produção**. Todos os dados fornecidos pela API são retirados do serviço de **homologação** do **TJSC**.

### Configurações Iniciais 🔧

1 - **Clonagem do projeto**


```properties
git clone https://github.com/GabrielRechBrand/integration-tjsc.git
```

2 - **Adição do certificado ao truststore**

```properties
keytool -import -alias [alias] -file [certificate_location] -keystore [cacerts_location]
```
Sendo:
- **[alias]** = Identificador da sua escolha para o seu certificado.
- **[certificate_location]** = O local do seu certificado na sua máquina. Você pode usar o caminho relativo do arquivo "certificado-tjsc.crt" na raíz do projeto.
- **[cacerts_location]** = O local do seu JDK até o arquivo "cacerts", exemplo: `` C:\Users\rwnov\.jdks\corretto-17.0.3\lib\security\cacerts``


### Execução ⚙️

- **Maven**
```properties
mvn spring-boot:run
```
- **Java**
```properties
mvn clean install
```

```properties
java -jar [jar_location]
```
### Documentação da API 📃

No **integration-tjsc** foi utilizada a library **Swagger** para documentação de seus endpoints e schemas.

> **Heroku: <a href="">https://integration-tjsc.herokuapp.com/swagger-ui/index.html </a>**

> **Localhost: <a href="">http://localhost:8080/swagger-ui/index.html</a>**

Ao acessar o swagger, além de poder visualizar todas as "rotas" da aplicação, também é possível testá-las com algumas funcionalidades básicas, mas é recomendável usar alguma outra ferramenta mais robusta para testes, como o **Postman** ou o **Insomnia**.

### Métricas 📏

> **Tempo de Resposta (ms)**
<img src="https://i.imgur.com/kiGqfk1.png" />

> **Uso de memória (MB)**
<img src="https://i.imgur.com/fdHNS16.png" />

### Tecnologias utilizadas 🗃️
>_O projeto foi criado a partir do <a href="https://start.spring.io/">Spring Initializr</a>._


- **Java 17**
- **Spring Boot 3.0.2**
- **Maven 3.9.0**
- **JUnit**