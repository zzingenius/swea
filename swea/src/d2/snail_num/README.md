## 1954. 달팽이 숫자 (D2) ##

[문제 바로 가기](https://swexpertacademy.com/main/code/problem/problemDetail.do)


달팽이는 1부터 N*N까지의 숫자가 시계방향으로 이루어져 있다.

다음과 같이 정수 N을 입력 받아 N크기의 달팽이를 출력하시오.

⬇️n == 3\
<img width="230" height="239" alt="image" src="https://github.com/user-attachments/assets/bf263211-b4fe-4058-b9f5-472ca6ffd3b6" />

## 해결 방법 ##

1. 2차원 배열을 하나 만들어줍니다.
2. 현재 위치(x,y)와 해당 자리에 넣을 숫자 그리고 방향을 알려줄 변수를 하나씩 생성합니다.
3. 다음 위치를 확인하고 해당 위치가 벽에 부딫혔을 경우 방향을 바꿔줍니다.
