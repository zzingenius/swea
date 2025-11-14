## 1859. 백만 장자 프로젝트(D2)

[바로가기](https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&problemLevel=3&contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=JAVA&select-1=3&pageSize=10&pageIndex=1)


25년 간의 수행 끝에 원재는 미래를 보는 능력을 갖게 되었다. 이 능력으로 원재는 사재기를 하려고 한다.

다만 당국의 감시가 심해 한 번에 많은 양을 사재기 할 수 없다.

다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.

    1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
    2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
    3. 판매는 얼마든지 할 수 있다.

예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.


## 해결방법

배열을 만들어 해결하도록 한다.\
최댓값을 가장 마지막 날의 값이라고 가정한 뒤, 마지막 날과 그 전의 날의 값을 비교한다.\
최댓값이 전 날의 값보다 크다면 팔아 이익을 남기고\
그렇지 않다면 팔지 않고 최댓값을 해당 값으로 바꾼다.

**주의 사항**\
이익 변수는 ***int***가 아닌 ***long***타입으로 선언한다.
>이익이 int가 담을 수 있는 최댓값을 뛰어 넘을 시 오류가 나기 때문
