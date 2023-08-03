package com.meetmevenkat.hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable hashTable = new HashTable(10);

        Employee emp1 = new Employee("ramu", "vanukuri", 10001);
        Employee emp2 = new Employee("swathi", "lokireddy", 10002);
        Employee emp3 = new Employee("mithra", "vanga", 10003);
        Employee emp4 = new Employee("john", "chris", 10004);
        Employee emp5 = new Employee("srinu", "aala", 10005);

        hashTable.put("vanukuri", emp1);
        hashTable.put("lokireddy", emp2);
        hashTable.put("vanga", emp3);
        hashTable.put("chris", emp4);
        hashTable.put("aala", emp5);

        hashTable.print();

    }
}
