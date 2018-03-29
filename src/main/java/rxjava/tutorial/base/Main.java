package rxjava.tutorial.base;

import io.reactivex.Observable;

/**
 * Created by LilG2pac on 24.03.2018.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from rxjava world!!!");
        Observable.just(1,2,3,4,5)
                .subscribe(number -> System.out.println(number));
    }
}