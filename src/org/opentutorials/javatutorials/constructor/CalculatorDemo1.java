package org.opentutorials.javatutorials.constructor;

class Calculator {
    int left,right ; // 전역변수 left, right


    // 생성자가 하는 역할 : 클래스가 생성될때, 클래스와 똑같은 이름을 가지고 있는 생성자가 자동으로 실행되도록 약속되어있다. 그 어떤 메소드보다도 우선 실행됨.
    public Calculator(int _left, int _right) { // 여기서 Calculator 는 생성자(Constructor)
        this.left = _left; // _left 는 위의 지역변수 _left
        // this.left 는 전역변수 left 를 가져옴
        this.right = _right; // _right 는 위의 지역변수 _right
        // this.right 는 전역변수 right 를 가져옴
    }

    public void sum() {
        System.out.println(this.left + this.right); // 전역변수 left,right 의 값을 사용
    }

    public void avg() {
        System.out.println((this.left+this.right)/2); // 전역변수 left,right 의 값을 사용
    }

}

public class CalculatorDemo1 {

    public static void main(String[] args) {

            Calculator c1 = new Calculator(10,20); // Calculator 라는 클래스를 c1 으로 인스턴스화 시킬때 left,right 값을 기본적으로 지정하게 되어있음.
            // 여기서의 Calculator 도 class 가 아닌, 생성자이다.
            c1.sum();
            c1.avg();

            Calculator c2 = new Calculator(20,40);
            c2.sum();
            c2.avg();

    }


}
