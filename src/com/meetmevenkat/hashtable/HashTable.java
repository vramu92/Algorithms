package com.meetmevenkat.hashtable;

public class HashTable {
    private StoredEmployee[] employees;

    public HashTable(int capacity) {
        employees = new StoredEmployee[capacity];
    }

    private int getHashKey(String fName){
        return fName.length() % employees.length;
    }

    private boolean contains(Employee employee){
        return employees[getHashKey(employee.getLastName())] != null ? true : false;
    }

    public void put(String key, Employee employee){
        int hashedKey = getHashKey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == employees.length -1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }

            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = ( hashedKey + 1) % employees.length;
            }
        }
        if(occupied(hashedKey)){
            System.out.println("Sorry, there is an employee at position " + hashedKey);
        }else{
            employees[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    private boolean occupied(int index){
        return employees[index] != null;
    }

    private int findKey(String key){
        int haskedKey = getHashKey(key);
        if(employees[haskedKey] != null && employees[haskedKey].key.equals(key)){
            return haskedKey;
        }

        int stopIndex = haskedKey;
        if(haskedKey == employees.length -1){
            haskedKey = 0;
        }else{
            haskedKey++;
        }

        while(haskedKey != stopIndex && (employees[haskedKey] == null || (employees[haskedKey] != null && employees[haskedKey].key.equals(key)))){
            haskedKey = (haskedKey + 1) % employees.length;
        }

        if(stopIndex == haskedKey){
            return -1;
        }else{
            return haskedKey;
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return employees[hashedKey].employee;
    }

    public void remove(Employee employee){
        if(!contains(employee)){
            employees[getHashKey(employee.getLastName())] = null;
        }
    }

    public void print(){
        for(int i =0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }
}
