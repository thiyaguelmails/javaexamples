package com.example.app;

import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;

public class GettingStarted {
	
	public static void main(String[] args) {
		
		Observable<String> observable = Observable.just("1222.22d", "12.123", "554.5");
		
		Action1<String> onNextAction = new Action1<String>(){
			@Override
			public void call(String t) {
				System.out.println("Just converted this item from string -> " + Double.valueOf(t));
			}
		};
		
		Action1<Throwable> onErrorAction = new Action1<Throwable>(){
			
			@Override
			public void call(Throwable t) {
				System.err.println("An error ocurred!!");
				t.printStackTrace();
			}
		};
		
		Action0 onCompleteAction = new Action0(){
			
			@Override
			public void call() {
				System.out.println("Completed evaluating numbers.");
			}
		};
		
		observable.subscribe(onNextAction,onErrorAction,onCompleteAction);
		
	}

}
