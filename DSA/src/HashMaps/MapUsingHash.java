package HashMaps;

import javax.swing.text.html.parser.Entity;

public class MapUsingHash {
    private Entity[] entities;      //! array of Entity class

    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key,String value){
         int hash = Math.abs(key.hashCode()%entities.length);       //? Generating the hash
         entities[hash] = new Entity(key, value);                   //? Storing at 'hash' index
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash] != null && entities[hash].key == key){
            return entities[hash].value;
        }
        return "empty";
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode()%entities.length);
        if(entities[hash] != null && entities[hash].key == key){
            entities[hash] = null;
        }
    }



    //! Data structure to store key and value
    private class  Entity {
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}
