###activeMQ
- apache activeMQ는 가장 대중적이고 강력한 오픈 소스 메시징, 통합 패턴 서버
- apache activeMQ는 빠르며, 다양한 언어간의 클라이언트 및 프로토콜을 지원하고,
    사용하기 쉬운 엔터프라이즈 통합 패턴 및 많은 고급 기능을 제공 jms. j2ee
- MOM (메시지 지향 미들웨어)
- activeMQ는 JMS를 지원하는 클라이언트를 포합하는 브로커, 자바 뿐만 아니라 다양한 언어를
이용하는 시스템 간의 통신을 할 수 있게 해줍니다. 또한 클러스터링 기능 및 DB 그리고 file system을 
통해 각 시스템 간의 일관성 및 지속성을 유지해줍니다.
- 간단히 정의하면 클라이언트 간 메시지를 송수신 할 수 있는 오픈 소스 broker(jms 서버)입니다.

###JMS
- JMS는 자바 기반의 MOM API이며 둘 이상의 클라이언트 간의 메시지를 보냅니다.
- JMS는 자바 플랫폼, 엔터프라이즈 에디션 기반,
메시지 생성, 송수신, 읽기를 합니다. 또한 비동기적이며 신뢰할 만하고 
느슨하게 연결된 서로 다른 분산 어플리케이션 컴포넌트 간의 통신을 허용합니다.
+ message broker(목적지에 안전하게 메시지를 건네주는 중개자 역할)
+ destination(목적지에 배달될 2가지 메시지 모델 ) 
    + Queue: point to point
    + Topic: publish to subscribe
    

https://www.programmersought.com/article/8358250043/
###activeMQ 장점 
+ 분리
+ 복구 지원
+ 신뢰성
+ 비동기 처리