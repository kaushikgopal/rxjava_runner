package co.kaush.rxjava.cli;

import rx.Observable;
import rx.functions.Action0;

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    Observable<Integer> source1 = Observable.just(1, 2, 3, 4, 5);
    Observable<Integer> source2 = Observable.range(100, 5);

    source1.take(3)
        .asObservable()
        .doOnSubscribe(() -> System.out.println(" ---- subscribing"))
        .subscribe(integer -> System.out.println(String.format("---- %d", integer)));

    /*source1.take(20)
        .buffer(2, 1)
        .filter(l -> l.size() == 2)
        .map(l -> l.get(0) + l.get(1))
        .concatWith(source2)
        .subscribe(integer -> System.out.println(String.format("---- %d", integer)));*/
  }

}