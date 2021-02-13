package com.flora.datastructure;

import java.util.LinkedList;

/**
 * @author Flora on 2021/1/28.
 */
public class HashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }
    LinkedList<Entry>[] entries = new LinkedList[3];

    public void put(int key, String value){
        var index = hash(key);
        var node = new Entry(key, value);

        if(entries[index] == null){
            entries[index] = new LinkedList<>();
            entries[index].add(node);
            return;
        }
        var buckets = entries[index];
        for(Entry entry : buckets){
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }
        buckets.add(node);
    }

    public String get(int key){
        var index = hash(key);
        var buckets = entries[index];
        for(Entry entry : buckets){
            if(entry.key == key){
                return entry.value;
            }
        }
        return null;
    }

    private int hash(int key){
        return key % entries.length;
    }
}
