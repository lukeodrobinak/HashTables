/**
 * HashTable.java
 * Authors: Luke O’Drobinak
 * Date: 2/21/2024
 * Collaborators: N/A
 * Citations: Oracle Java Documentation, Baeldung.com, GeeksforGeeks.com
 **/

public class HashTable {

    private class Entry {
        String key;
        String value;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public boolean isEmpty() {
            return key.isEmpty();
        }

    }

     int size;
     int count;
     Entry[] values;

     public HashTable(int size) {
          this.size = size;
          values = new Entry[size];
          for (int i = 0; i < size; i++) {
               values[i] = new Entry("", "");
          }
     }

     public boolean put(String key, String value) {

          if (count >= size * 0.75) {
              rehash();
          }

          int index = hashCode(key);

          if (values[index].isEmpty()) {
               values[index] = new Entry(key, value);
               count++;
          } else {
               return false;
          }
          return true;
     }

     public String get(String key) {
          int index = hashCode(key);
          if (values[index].isEmpty()) {
               return null;
          }
          return values[index].value;
     }

     private int hashCode(String key) {
         int hash = 17;
         for (int i = 0; i < key.length(); i++) {
             for (int j = 0; j < key.length(); j++) {
                 hash = (hash * 31 + key.charAt(j)) % size;
             }
             key = key.substring(i);
         }
         return (hash % size);
     }


     private void rehash() {
        size = (int)(size * 1.5);
        Entry[] temp = values;
        values = new Entry[size];

        for (int i = 0; i < size; i++) {
             values[i] = new Entry("", "");
        }

         for (int i = 0; i < temp.length; i++) {
             if (!temp[i].isEmpty()) {
                 put(temp[i].key, temp[i].value);
             }
         }
     }

}
