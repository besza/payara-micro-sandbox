# Payara Micro sandbox with JakartaEE and MicroProfile

### Clone this repository and start prototyping.
```shell
git clone https://github.com/besza/payara-micro-sandbox.git
```  
### Components
* JakartaEE 8
* [MicroProfile 3.3](https://github.com/eclipse/microprofile)
* [Payara Micro Maven Plugin 1.4.0](https://github.com/payara/ecosystem-maven/tree/master/payara-micro-maven-plugin)
  * [Payara Micro 5.2021.5](https://docs.payara.fish/community/docs/5.2021.5/documentation/payara-micro/payara-micro.html)

### Start the sample application
```shell
./mvnw package payara-micro:start
```
The sample application serves a single endpoint at http://localhost:8080/payara-sandbox/greeting . Debugging is enabled on port 5005.