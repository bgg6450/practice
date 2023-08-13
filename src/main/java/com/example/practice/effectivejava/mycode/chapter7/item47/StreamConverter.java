package com.example.practice.effectivejava.mycode.chapter7.item47;

public class StreamConverter {
    public static void main(String[] args) {
        for (ProcessHandle ph : (Iterable<ProcessHandle>) ProcessHandle.allProcesses()::iterator) {
        }
    }
}
