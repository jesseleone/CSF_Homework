import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Samples for the SimpleHashMap lab
 */
public class SimpleHashMap
{
    public SimpleHashMap(ArrayList<LinkedList<KeyValueTuple>> dataStore) {
        this.dataStore = dataStore;
    }

    private class KeyValueTuple {
        public KeyValueTuple(Object value, String key) {
            this.value = value;
            this.key = key;
        }

        public Object value;
        public String key;
    }

    private ArrayList<LinkedList<KeyValueTuple>> dataStore;

    public Object put(Object value, String key)
    {
        // TODO:
        // * Get the hash value of the key
        // * Insert the key/value tuple in the linked list at the desired index in the data store
        // * If something in that spot already exists, add it at the end of the linked list
        // * Return the value
        int hashValue = key.hashCode()%10;
        KeyValueTuple insertTuple = new KeyValueTuple(value, key);
        if(dataStore.get(hashValue)==null){
            dataStore.set(hashValue, insertTuple);
        }else{

        }

        return null;
    }

    public Object get(String key)
    {
        // TODO:
        // * Get the hash value of the key
        // * Look for the desired key in the LinkedList at the appropriate index
        // * Return the value
        return null;
    }

    public Object remove(String key)
    {
        // TODO:
        // * Get the hash value of the key
        // * Remove the key/value tuple in the linked list at the appropriate index in the data store
        // * Return the value
        return null;
    }

    /*
     * Debugging Helpers
     */

    /**
     * Prints out each bucket in the tree. Use for debugging purposes.
     */
    public void print()
    {
        for (LinkedList<KeyValueTuple> keysAndValues : this.dataStore)
        {
            System.out.println("Bin #" + this.dataStore.indexOf(keysAndValues));
            for (KeyValueTuple keyValueTuple : keysAndValues)
            {
                System.out.println("Key: " + keyValueTuple.key + ", Value: " + keyValueTuple.value);
            }
        }
    }

    public Collection<String> keySet()
    {
        ArrayList<String> keys = new ArrayList<String>();
        for (LinkedList<KeyValueTuple> keysAndValues : this.dataStore)
        {
            for (KeyValueTuple keyValueTuple : keysAndValues)
            {
                keys.add(keyValueTuple.key);
            }
        }
        return keys;
    }

    public Collection<Object> valueSet()
    {
        ArrayList<Object> values = new ArrayList<Object>();
        for (LinkedList<KeyValueTuple> keysAndValues : this.dataStore)
        {
            for (KeyValueTuple keyValueTuple : keysAndValues)
            {
                values.add(keyValueTuple.key);
            }
        }
        return values;
    }
}
