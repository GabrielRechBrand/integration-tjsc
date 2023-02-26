# Integração - TJSC 📖

<a href="https://www.tjsc.jus.br/"><img align="right" src="https://www.tjsc.jus.br/documents/10181/66389/TJSC-V-Tribunal+de+Justica.png/4f40f8a9-4c23-42a4-95a1-7999cb2d1534?t=1446045086727" width=25%></a>

A aplicação "**integration-tjsc**" é uma **API REST** construída com **Java** e **Spring Boot** que realiza uma integração com o
_Tribunal de Justiça de Santa Catarina_ (**TJSC**). A intenção do projeto é poder permitir aos usuários uma maneira alternativa ao serviço **SOAP**, tornando mais fácil a consulta de dados específicos do **WSDL** do tribunal.

### Configurações Iniciais 🔧

1 -  **Clonagem do projeto**

```properties
git clone https://github.com/GabrielRechBrand/integration-tjsc.git
```

2 - **Adição do certificado ao truststore**

```properties
keytool -import -alias [alias] -file [certificate_location] -keystore [cacerts_location]
```

### Execução ⚙️

```properties
mvn spring-boot:run
```
### Documentação dos Endpoints

-