# Spring boot Microservice use Kafka

# 📝 Description

> Develop Spring boot microservices server use kafka by event driven <br>
 카프카를 event driven 형식으로 써서 micro service server 개발을 공부하는 Repo 입니다.
> 

---

# ⚒️ **Used Stacks**
## Server

• Java 17   
• Spring Boot 3.1.4    
• Kafka

---

# 📃 Review

Kafka의 event driven 방식을 활용 전에 먼저 구조를 생각했습니다.
Kafka 를 중앙에 두고 해당 Kafka 를 통해서 데이터들이 이동하고 다수의 micro service server 들이 공유하게 됩니다.
저는 이럴 때마다 Dto 등 해당 데이터의 구조나 규격을 어떻게 해야 모든 server 가 공유할 수 있을지 고민했습니다.

Json 타입이기에 Map<String, Object> 형식으로 공유받아도 되지만 Java라는 언어를 사용하고 있고, type에 대한 명확한 규격이 없다면, 힘들것이라 생각했습니다.
이렇게 계속해서 고민하고 생각하던 중 base-domains 라는 Spring project 를 하나 만든 다음 다른 micro service server가 해당 프로젝트를 
```
implementation project(path: ":base-domains")
```
해당 형식으로 build.gradle 에 import 해서 사용하면 base-domains 에서 만든 dto 등을 import 한 Spring project 에서 공유할 수 있다는 것을 알게되었습니다.

찾은 뒤부터는 순조로웠습니다.

각 만들고 싶은 service 에 대한 topic 과 consumer gruop 등을 만든 뒤 데이터가 service 에 들어오게 된다면 적당하고 알맞은 topic 에 데이터를 올린 뒤 
해당 topic 을 구독하고 있는 micro service server 는 데이터를 받아서 다시 서비스 로직을 실행하게 됩니다.

Dto 규격을 공유받기 때문에, Kafka 를 이용해 데이터를 이동시키고 확인하고 해당 데이터를 DB에 저장하면 끝이었습니다.
Kafka 를 독학하면서 어느정도 공부했다고 생각했지만, 아직 모르는 부분도 많았고 디테일한 설정이 많이 필요하다는 것을 알게되었습니다.
