package entities;

import java.util.HashMap;
import java.util.Map;

//This class is not mutable, unlike the String class.
public class StringStorage
{
    private String data;

    public StringStorage(String data)
    {
        this.data = data;
    }

    public Memento createMemento()
    {
        Memento memento = new Memento();
        memento.set("data", data);
        return memento;
    }

    public void setMemento(Memento memento)
    {
        data = memento.get("data").toString();
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return data;
    }



    public class Memento
    {
        private Map<String, Object> data;

        public Memento() {
            this.data = new HashMap<>();
        }

        private void set(String key, Object value)
        {
            data.put(key, value);
        }

        private Object get(String key)
        {
            return data.get(key);
        }
    }
}
