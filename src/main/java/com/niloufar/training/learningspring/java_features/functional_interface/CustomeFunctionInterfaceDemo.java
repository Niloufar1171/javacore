package com.niloufar.training.learningspring.java_features.functional_interface;

public class CustomeFunctionInterfaceDemo {
    public static void main(String[] args) {

        CustomFunctionInterface addition = (a,b) -> a + b;
        //CustomFunctionInterface additionWithLamdba = Integer::sum;
        System.out.println("result of calling the addition method using lambda expressions : " +  addition.add(3,4));
        System.out.println("The result of calling an statc methon in our interface : " +CustomFunctionInterface.multiply(3,4));
        System.out.println("*********************************************************************************");

    }
}
