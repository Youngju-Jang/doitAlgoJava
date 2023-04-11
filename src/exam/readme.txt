연습문제 풀이를 장별로 정리하였습니다.

1. 테스트 환경입니다.
소스 파일 인코딩 : UTF-8
자바  버전 : jdk-17.0.1
운영  체제 : 윈도 11

2. 컴파일 명령은 다음과 같습니다.
연습 1-1의 Max4.java 를 컴파일하는 예

1) 인코딩 UTF-8 인 경우 
javac   -encoding   utf-8   Max4.java

2) 인코딩 949 ksc5601 ANSI 인 경우 
javac   Max4.java
    
3. 실행 명령은 다음과 같습니다.
java   Max4

4. 여러 파일을 컴파일할 경우 명령
javac   -encoding   utf-8   -d   .   *.java

※ 설명
-encoding   utf-8   : encoding utf-8로
-d   .                   : 현재 디렉토리에서 부터 컴파일
*.java                  : 모든 java파일 컴파일

5. 다음 프로그램은 컴파일 시 경고(warning)가 발생합니다.
   컴파일 에러가 아니므로 실행에는 지장이 없습니다.
--------------------------------------------------
연습문제 4-2        exam.chap04EX.Stack.java
연습문제 4-6        exam.chap04EX.Queue.java
연습문제 8-1        exam.chap08EX.LinkedListTest.java
연습문제 8-2        exam.chap08EX.LinkedListTest.java
연습문제 8-4        exam.chap08EX.ArrayLinkedListTest.java
연습문제 8-5        exam.chap08EX.ArrayLinkedListTest.java
연습문제 8-6        exam.chap08EX.exam.chap08EX.ArrayLinkedListX2.java
연습문제 8-8        exam.chap08EX.exam.chap08EX.ArrayLinkedListX2.java
연습문제 8-9        exam.chap08EX.DoubleLinkedList.java
연습문제 8-10      exam.chap08EX.DoubleLinkedList.java
연습문제 9-1        exam.chap09EX.exam.chap09EX.BinTree2.java
연습문제 9-2        exam.chap09EX.exam.chap09EX.BinTree2.java
연습문제 10-1      ChainHash.java
연습문제 10-1      exam.chap10EX.OpenHash.java
--------------------------------------------------

6. 다음은 exam.chap04EX.Stack.java 를 컴파일한 경우 경고(warning) 문장입니다.
   컴파일 에러가 아니므로 실행에는 지장이 없습니다.

---------------------------------------------------------------
javac -encoding utf-8  exam.chap04EX.Stack.java
---------------------------------------------------------------

Note: exam.chap04EX.Stack.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
계속하려면 아무 키나 누르십시오 . . .

7. 다음은 -Xlint 옵션을 주고 exam.chap04EX.Stack.java 를 컴파일한 경우입니다.
   -Xlint 옵션을 넣으면 경고의 상세한 내용이 나옵니다.
   
---------------------------------------------------------------
javac -encoding utf-8 -Xlint  exam.chap04EX.Stack.java
---------------------------------------------------------------
exam.chap04EX.Stack.java:10: warning: [serial] serializable class EmptyGstackException has no definition of serialVersionUID
        public static class EmptyGstackException extends RuntimeException {
                      ^
exam.chap04EX.Stack.java:15: warning: [serial] serializable class OverflowGstackException has no definition of serialVersionUID
        public static class OverflowGstackException extends RuntimeException {
                      ^
exam.chap04EX.Stack.java:24: warning: [unchecked] unchecked cast
                        stk = (E[])new Object[capacity];                // 스택 본체용 배열을 생성
                                   ^
  required: E[]
  found:    Object[]
  where E is a type-variable:
    E extends Object declared in class exam.chap04EX.Stack
3 warnings
---------------------------------------------------------------
