package practice.stringMethods;

public class Password {
    public static void main(String[] args) {
        String password = "strawberryoolongtea";

        System.out.println(password.equals("StrawberryOolongTea")); // false
        System.out.println(password.equalsIgnoreCase("StrawberryOolongTea")); // true
        System.out.println(password.compareTo("cherryblossomtea"));
        System.out.println(password.compareTo("Cherryblossomtea"));
        System.out.println(password.compareToIgnoreCase("WildberryOolongTea"));
    }
}

// .compareTo() / .compareToIgnoreCase()
// 유니코드 숫자의 사전식 순서 차이를 알려준다.
// 즉, A 문자열의 유니코드가 3이고 비교하는 B 문자열의 유니코드가 6일 때 3이 출력된다.
// 케이스에 따라 값이 달라지므로 유의한다. -> compareToIgnoreCase 사용
// 만약 0이 나온다면 두 문자열은 같다(equal).