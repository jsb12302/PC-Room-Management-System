# PC방 좌석 관리 시스템

## 개요

디자인 패턴이 적용될 수 있는 ‘PC방 관리 시스템’이라는 소프트웨어 시스템을 구축하고, 개발 과정 및 테스팅 절차를 준수하여 품질 향상 및 유지보수 시, 발생하는 문제를 예방하는 능력을 배양하는 데 그 목적이 있다.

## 개발 환경
```
* Language : Java
* Platform : NetBeans 11.3
* DB : NotePad
* Tools : JAVA SWING
```

서비스의 주요 기능은 다음과 같다  
가. 관리자  
● 고객 관리  
● 매출 정산  
● PC 관리  

나. 고객  
● 잔여 시간 확인  
● 요금 확인  
● 주문 내역 확인  

## 디자인 패턴
### Builder 패턴
 
![builder](image/builder.PNG)
빌더 클래스를 static으로 생성한다. 빌더 클래스 생성자는 public으로 하여 필수 값들에 대해 생성자의 파라미터로 받는다. 빌더 클래스는 각 멤버변수에 set메서드를 할당해 멤버변수의 값을 변경하고 다시 빌더 객체를 반환한다. 반환한 빌더 클래스는 build() 메서드가 호출될 경우 SignUp을 반환해 객체를 생성해준다. 
![image](https://user-images.githubusercontent.com/73890228/167765480-ba164c1c-ffd3-4311-b8f1-8464d5aeafdc.png)



## 시연 영상 및 발표 영상
[![Video Label](https://img.youtube.com/vi/BuqNLZQmd-o/0.jpg)](https://youtu.be/BuqNLZQmd-o)  
