// String 객체는 불변객체이다.
// 따라서 String str = "hello"; 라고 선언한 str 객체는 바꿀수 없다.
// 그러므로 str 에 새로운 String 값을 더한다면 이는 메모리의 낭비가 발생한다.
// String 변하지 않는 문자열을 자주 읽어들이는 경우 사용해주면 좋다.

// 자바는 이를 해결하기 위해 가변성을 가지는 StringBuffer/StringBuilder 클래스를 도입했다.
// 위 두개의 클래스는 가변성을 가지기 때문에 동일 객체의 문자열을 변경하는 것이 가능하다.
// 따라서 문자열의 추가, 수정, 삭제가 빈번하게 발생한다면 위에 두 개의 클래스를 사용하자!

// StringBuffer 클래스는 동기화 키워드를 지원하여 멀티쓰레드 환경에서 안전하다. (Thread-safe)
// 반대로 StringBuilder 클래스는 동기화를 지원하지 않지만 단일쓰레드에서의 성능은 뛰어나다.

// Thread-safe 이란? 여러 쓰레드로부터 동시에 접근이 이뤄어져도 프로그램의 실행에 문제가 없다!
// 즉 하나의 메서드가 한 쓰레드로부터 호출되어 실행중일 때, 다른 스레드가 동일한 함수를 호출하여도
// 각 스레드에서의 수행 결과가 바르게 나오는 것!
package inflearn.section01.ex02_대소문자_변환;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                answer.append(Character.toUpperCase(ch));
            } else {
                answer.append(Character.toLowerCase(ch));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}