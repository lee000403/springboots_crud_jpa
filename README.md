 <h3 align="center"><img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=white"/></a>&nbsp Spring Boot JPA 방법 연습 </h3>

<h3 align="center">📚 공부 의도 📚</h3>
<h5 align="center">Spring Boot 공부중 JPA에 대한 발견</h5>
<h5 align="center">PROJECT-TAB 적용을 위한 참고 자료(블로그 및 유튜브)</h5>

<h3 align="center">🕒 공부 기간</h3>
<h5 align="center">2023-08-16 ~ 2023-08-18</h5>

<h3 align="center">📁 공부 방법 📁</h3>

| 유튜브 참고 내용 | 블로그 참고 내용 |
| --- | --- |
| ![유튜브 이미지](https://github.com/lee000403/springboots_crud_jpa/blob/main/images/JPA-CRUD%20%EC%9C%A0%ED%8A%9C%EB%B8%8C.jpg) | ![블로그 이미지](https://github.com/lee000403/springboots_crud_jpa/blob/main/images/JPA-CRUD%20%EB%B8%94%EB%A1%9C%EA%B7%B8.jpg) |
| JPA에 대한 기본적인 CRUD 코드 | JPA에 대한 이해도 증가 |


<h3> 💊 공부 내용 </h3>
<h5 align="center">Controller, Service, Entity, Repository 에 대한 이해</h5>

| Controller | Service | Entity | Repository |
| --- | --- | --- | --- |
| 사용자한테 DTO 받아 Service의 기능을 호출한다. | Controller에서 DTO를 통해 데이터를 받은 후 Repository를 통해 데이터를 관리하는 역할을 한다. | DB에 있는 Column들을 필드로 가지고 있다. PK값을 @Id로 설정해줘야한다. | DB에 실제로 접근하는 것. Service와 DB를 역할해주는 역할을 한다. |

<h5 align="center">Repository의 기능</h5>

| save()    | findOne()                  | findAll()                 | count()                 | delete()                  |
| --------- | -------------------------- | ------------------------- | ----------------------- | ------------------------- |
| **기능**   |
| 레코드 저장(insert 및 update) | pk를 활용한 레코드 하나 찾기 | 전체 레코드 불러오기 | 레코드 갯수 확인 | 해당 레코드 삭제 |

<h3> 😥 문제점 </h3>
<h5> 기존에 JSP를 활용하던 것을 다시 html로 작성해야한다. </h5>
<h5> Repository 및 Entity 를 작성해야한다. </h5>

<h3> 💡 궁금점 </h3>
<h5> 기존에 있던 권한 및 로그인에 대한 변경이 없는지? (추후 공부 예정)</h5>


<h3> 🍎 최종 목적 </h3>
<h5>기본적인 CRUD를 JPA를 활용하여 코드 작성 및 코드 간편화</h5>
