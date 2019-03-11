package com.company;

import java.util.NoSuchElementException;
import java.util.Stack;

public class Queue<E> extends Stack<E> {
    private Stack<E> s2;

    public Queue(){
        super();
        s2 = new Stack<>();
    }

    public boolean add(E e) throws IllegalStateException, ClassCastException,
            NullPointerException, IllegalArgumentException{
        /* 在此插入代码*/
        this.add(e);
        return true;
    }


    public boolean offer(E e) throws ClassCastException, NullPointerException,
            IllegalArgumentException{
        this.add(e);
        return true;
    }

    public E remove() throws NoSuchElementException {
        if(s2.empty()){
            while(!this.empty()){
                s2.push(this.pop());
            }
        }
        return s2.pop();

    }


    public E poll( ) {
        return this.remove();
    }


    public E peek () {
        if(s2.empty()){
            return this.elementAt(0);
        }
        else{
            return s2.peek();
        }
    }

    public E element(int index) throws NoSuchElementException {
        if(index > s2.size()){
            return s2.get(s2.size()-1-index);
        }
        else{
            index -= s2.size();
            return s2.get(index);
        }
    }

}
