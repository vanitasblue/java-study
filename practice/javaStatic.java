package practice;

// static field
class LuckySeven {
    static int firstSeven = 7; // class field
    int secondSeven = 7; // instance field
}

// static method
class CallName {
    // class method
    static void callName1(String name) {
        System.out.println("My name is " + name);
    }
    // instance method
    void callName2(String name) {
        System.out.println("My name is " + name);
    }
}

public class javaStatic {
    public static void main(String[] args) {
        LuckySeven seven1 = new LuckySeven(); // first LuckySeven
        LuckySeven seven2 = new LuckySeven(); // second LuckySeven

        seven1.firstSeven++; // static class field
        seven1.secondSeven++; // instance field
        System.out.println(seven2.firstSeven); // 8
        System.out.println(seven2.secondSeven); // 7

        CallName.callName1("Strawberry"); // 인스턴스를 생성하지 않아도 호출이 가능하다.

        // CallName.callName2("Cherry"); -> Error: non-static method callName2(java.lang.String) cannot be referenced from a static context
        CallName callName = new CallName(); // 인스턴스 생성
        callName.callName2("Cherry"); // 인스턴스를 생성해야만 호출이 가능하다.
    }
}

// 필드나 메서드 생성 시 인스턴스로 생성할지 정적으로 생성할지에 대한 판단 기준은
// 공용으로 사용할지 아닐지로 설정할 수 있다.
// 정적 변수는 모든 인스턴스가 하나의 저장 공간을 공유한다.
// seven1.firstSeven과 seven2.firstSeven은 같은 저장 공간을 공유하기 때문에
// seven1에서 증가된 값 8이 seven2에서도 출력된다.
// 인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로 인스턴스마다 각기 다른 값을 가진다.
// seven1.secondSeven과 seven2.secondSeven은 각각 다른 값을 가진다.