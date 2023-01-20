# Payara Micro sandbox with JakartaEE and MicroProfile

### Clone this repository and start prototyping.
```shell
git clone https://github.com/besza/payara-micro-sandbox.git
```  
### Components
* JakartaEE 10
* [MicroProfile 5.0](https://github.com/eclipse/microprofile)
* [Payara Micro Maven Plugin 1.4.0](https://github.com/payara/ecosystem-maven/tree/master/payara-micro-maven-plugin)
  * [Payara Micro 6.2023.1](https://docs.payara.fish/community/docs/Technical%20Documentation/Payara%20Micro%20Documentation/Overview.html)

### Start the sample application
```shell
./mvnw package payara-micro:start
```
The sample application serves a single endpoint at http://localhost:8083/payara-sandbox/greeting. 

Debugging is enabled on port 5005.

Integration test example with `mvn verify` (or `mvnw verify`).